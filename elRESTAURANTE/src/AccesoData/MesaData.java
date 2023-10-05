/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoData;

/**
 *
 * @author Administrador
 */
import Entidades.Mesa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MesaData {
   

    public static void insertarMesa(Mesa mesa) {
        try  {
            String sql = "INSERT INTO mesas (capacidad, disponibilidad, atendida) VALUES (?, ?, ?)";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setInt(1, mesa.getCapacidad());
                statement.setBoolean(2, mesa.isDisponibilidad());
                statement.setBoolean(3, mesa.isAtendida());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void modificarMesa(Mesa mesa) {
        try {
            String sql = "UPDATE mesas SET capacidad=?, disponibilidad=?, atendida=? WHERE id_mesa=?";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setInt(1, mesa.getCapacidad());
                statement.setBoolean(2, mesa.isDisponibilidad());
                statement.setBoolean(3, mesa.isAtendida());
                statement.setInt(4, mesa.getIdMesa());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarMesa(int idMesa) {
        try {
            String sql = "DELETE FROM mesas WHERE id_mesa=?";
            try (PreparedStatement statement = Conexion.prepareStatement(sql)) {
                statement.setInt(1, idMesa);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Mesa> obtenerTodasLasMesas() {
        List<Mesa> listaMesas = new ArrayList<>();
        try  {
            String sql = "SELECT * FROM mesas";
            try (PreparedStatement statement = Conexion.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idMesa = resultSet.getInt("id_mesa");
                    int capacidad = resultSet.getInt("capacidad");
                    boolean disponibilidad = resultSet.getBoolean("disponibilidad");
                    boolean atendida = resultSet.getBoolean("atendida");

                    Mesa mesa = new Mesa(idMesa, capacidad, disponibilidad, atendida);
                    listaMesas.add(mesa);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaMesas;
    }
}
    

