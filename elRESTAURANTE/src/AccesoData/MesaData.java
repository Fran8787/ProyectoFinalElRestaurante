
package AccesoData;


import Entidades.Mesa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MesaData {
    private Connection con = null;
    
    public MesaData() {
        con = Conexion.getConexion();
    }
    
    public void insertarMesa(Mesa mesa) {
        try {
            String sql = "INSERT INTO mesas (capacidad, disponibilidad, atendida) VALUES (?, ?, ?)";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, mesa.getCapacidad());
                statement.setBoolean(2, mesa.isDisponibilidad());
                statement.setBoolean(3, mesa.isAtendida());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("error");
        }
    }

    public void modificarMesa(Mesa mesa) {
        try {
            String sql = "UPDATE mesas SET capacidad=?, disponibilidad=?, atendida=? WHERE id_mesa=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, mesa.getCapacidad());
                statement.setBoolean(2, mesa.isDisponibilidad());
                statement.setBoolean(3, mesa.isAtendida());
                statement.setInt(4, mesa.getIdMesa());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("error");
        }
    }

    public void eliminarMesa(int idMesa) {
        try {
            String sql = "DELETE FROM mesas WHERE id_mesa=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idMesa);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
           System.out.println("error");
        }
    }

    public List<Mesa> obtenerTodasLasMesas() {
        List<Mesa> listaMesas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesa";
            
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int idMesa = rs.getInt("idMesa");
                    int capacidad = rs.getInt("capacidad");
                    boolean disponibilidad = rs.getBoolean("disponible");
                    boolean atendida = rs.getBoolean("atendida");
                    Mesa mesa = new Mesa(idMesa, capacidad, disponibilidad, atendida);
                    listaMesas.add(mesa);
                }
            }
         catch (SQLException e) {
            System.out.println("error");
        }
        return listaMesas;
    }
}