
package AccesoData;


import Entidades.Mesa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MesaData {
    private Connection con = null;
    
    public MesaData() {
        con = Conexion.getConexion();
    }
    
    public void insertarMesa(Mesa mesa) throws SQLException {
        String sql = "INSERT INTO mesa (capacidad, disponible, atendida) VALUES (?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, mesa.getDisponible());
            ps.setBoolean(3, mesa.getAtendida());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con éxito.");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa: " + ex.getMessage());
        }
    }

    public void modificarMesa(Mesa mesa) {
        
        String sql = "UPDATE mesa SET capacidad = ?, disponible = ?, atendida = ? WHERE idMesa = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, mesa.getDisponible());
            ps.setBoolean(3, mesa.getAtendida());
            ps.setInt(4, mesa.getIdMesa());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La mesa indicada no existe");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa: " + ex.getMessage());
        }
       
    }

    public void eliminarMesa(int idMesa) {
        try {
            String sql = "UPDATE mesa SET disponible = 0 WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la Mesa.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa");
        }
        
    }

    public List<Mesa> obtenerTodasLasMesas() {
        List<Mesa> mesas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesa WHERE disponible = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa(
                    rs.getInt("capacidad"),
                    rs.getBoolean("disponible"),
                    rs.getBoolean("atendida")      
                );
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesas.add(mesa);
            }
            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa: " + ex.getMessage());
        }
        return mesas;
        }
}