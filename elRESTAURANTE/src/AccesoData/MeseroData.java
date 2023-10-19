package AccesoData;

import Entidades.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MeseroData {

    // Método para insertar un nuevo mesero en la base de datos
    public void insertarMesero(Mesero mesero) {
        try {
            String sql = "INSERT INTO mesero (nombre, apellido, usuario, contraseña) VALUES (?, ?, ?, ?)";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
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

    // Método para modificar un mesero existente en la base de datos
    public void modificarMesero(Mesero mesero) {
        try {
            String sql = "UPDATE mesero SET nombre=?, apellido=?, usuario=?, contraseña=? WHERE idMesero=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
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

    // Método para eliminar un mesero por su ID
    public void eliminarMesero(int idMesero) {
        try {
            String sql = "DELETE FROM mesero WHERE idMesero=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idMesero);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener todos los meseros de la base de datos
    public List<Mesero> obtenerTodosLosMeseros() {
        List<Mesero> listaMeseros = new ArrayList<>();
        try {
            String sql = "SELECT idMesero, nombre, apellido, usuario, contraseña FROM mesero";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idMesero = resultSet.getInt("idMesero");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    String usuario = resultSet.getString("usuario");
                    String contraseña = resultSet.getString("contrasena");

                    Mesero mesero = new Mesero(idMesero, nombre, apellido, usuario, contraseña);
                    listaMeseros.add(mesero);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaMeseros;
    }
    
    
    public Mesero obtenerMeseroPorUsuario(String usuario) {
        Mesero mesero = null;
        try {
            String sql = "SELECT * FROM mesero WHERE usuario = ?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, usuario);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int idMesero = resultSet.getInt("idMesero");
                        String nombre = resultSet.getString("nombre");
                        String apellido = resultSet.getString("apellido");
                        String contraseña = resultSet.getString("contraseña");
                        mesero = new Mesero(idMesero, nombre, apellido, usuario, contraseña);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mesero;
    }

    public Mesero obtenerMeseroPorId(int idMesero) {
        Mesero mesero = null;
        try {
            String sql = "SELECT * FROM mesero WHERE idMesero = ?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idMesero);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        String nombre = resultSet.getString("nombre");
                        String apellido = resultSet.getString("apellido");
                        String usuario = resultSet.getString("usuario");
                        String contraseña = resultSet.getString("contraseña");
                        mesero = new Mesero(idMesero, nombre, apellido, usuario, contraseña);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mesero;
    }
}
