

package AccesoData;


import Entidades.Cobro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CobroData {
   

    public static void insertarCobro(Cobro cobro) {
        try {
            String sql = "INSERT INTO cobro (id_pedido, id_mesero, id_mesa, fecha) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setInt(1, cobro.getIdPedido());
                statement.setInt(2, cobro.getIdMesero());
                statement.setInt(3, cobro.getIdMesa());
                statement.setDate(4, new java.sql.Date(cobro.getFecha().getTime()));
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void modificarCobro(Cobro cobro) {
        try  {
            String sql = "UPDATE cobro SET id_pedido=?, id_mesero=?, id_mesa=?, fecha=? WHERE id_cobro=?";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setInt(1, cobro.getIdPedido());
                statement.setInt(2, cobro.getIdMesero());
                statement.setInt(3, cobro.getIdMesa());
                statement.setDate(4, new java.sql.Date(cobro.getFecha().getTime()));
                statement.setInt(5, cobro.getIdCobro());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarCobro(int idCobro) {
        try {
            String sql = "DELETE FROM cobro WHERE id_cobro=?";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setInt(1, idCobro);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Cobro> obtenerTodosLosCobros() {
        List<Cobro> listaCobros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM cobro";
            try (PreparedStatement statement = Conexion.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idCobro = resultSet.getInt("id_cobro");
                    int idPedido = resultSet.getInt("id_pedido");
                    int idMesero = resultSet.getInt("id_mesero");
                    int idMesa = resultSet.getInt("id_mesa");
                    Date fecha = resultSet.getDate("fecha");

                    Cobro cobro = new Cobro(idCobro, idPedido, idMesero, idMesa, fecha);
                    listaCobros.add(cobro);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCobros;
    }
}
    

