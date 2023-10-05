
package AccesoData;



import Entidades.Mesero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MeseroData {
    
    public static void insertarMesero(Mesero mesero) {
        try  {
            String sql = "INSERT INTO meseros (nombre, apellido, usuario, contrasena) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setString(1, mesero.getNombre());
                statement.setString(2, mesero.getApellido());
                statement.setString(3, mesero.getUsuario());
                statement.setString(4, mesero.getContraseña());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void modificarMesero(Mesero mesero) {
        try {
            String sql = "UPDATE meseros SET nombre=?, apellido=?, usuario=?, contrasena=? WHERE id_mesero=?";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setString(1, mesero.getNombre());
                statement.setString(2, mesero.getApellido());
                statement.setString(3, mesero.getUsuario());
                statement.setString(4, mesero.getContraseña());
                statement.setInt(5, mesero.getIdMesero());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarMesero(int idMesero) {
        try{
            String sql = "DELETE FROM meseros WHERE id_mesero=?";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setInt(1, idMesero);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Mesero> obtenerTodosLosMeseros() {
        List<Mesero> listaMeseros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM meseros";
            try (PreparedStatement statement = Conexion.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idMesero = resultSet.getInt("id_mesero");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    String usuario = resultSet.getString("usuario");
                    String contraseña = resultSet.getString("contraseña");

                    Mesero mesero = new Mesero(idMesero, nombre, apellido, usuario, contraseña);
                    listaMeseros.add(mesero);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaMeseros;
    }
}