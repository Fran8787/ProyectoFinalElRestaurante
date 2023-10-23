
package AccesoData;



import Entidades.Mesero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MeseroData {
    private Connection con = null;
    
    public MeseroData() {
        con = Conexion.getConexion();
    }
    
    public void insertarMesero(Mesero mesero) {
        
        String sql = "INSERT INTO mesero (nombre, apellido, usuario, contraseña, estado) VALUES (?, ?, ?, ?, ?)";
            try{
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, mesero.getNombre());
                ps.setString(2, mesero.getApellido());
                ps.setString(3, mesero.getUsuario());
                ps.setString(4, mesero.getContraseña());
                ps.setBoolean(4, mesero.getEstado());
                ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesero.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesero añadido con éxito.");
            }
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesero: " + ex.getMessage());
        }
    }

    public void modificarMesero(Mesero mesero) {
        
            String sql = "UPDATE mesero SET nombre=?, apellido=?, usuario=?, contraseña=?, estado=? WHERE idMesero=?";
            PreparedStatement ps = null;
            try{
                ps = con.prepareStatement(sql);
                ps.setString(1, mesero.getNombre());
                ps.setString(2, mesero.getApellido());
                ps.setString(3, mesero.getUsuario());
                ps.setString(4, mesero.getContraseña());
                ps.setBoolean(5, mesero.getEstado());
                ps.setInt(6, mesero.getIdMesero());
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

    public void eliminarMesero(int idMesero) {
        try {
            String sql = "UPDATE mesero SET disponible = 0 WHERE idMesero = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó al mesero.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesero");
        }
    }
    public List<Mesero> obtenerTodosLosMeseros() {
        List<Mesero> meseros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesero WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesero mesero = new Mesero(
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("usuario"),  
                    rs.getString("contraseña"),
                    rs.getBoolean("estado")      
                );
                mesero.setIdMesero(rs.getInt("idMesero"));
                meseros.add(mesero);
            }
            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero: " + ex.getMessage());
        }
        return meseros;
        
    }
       
    }