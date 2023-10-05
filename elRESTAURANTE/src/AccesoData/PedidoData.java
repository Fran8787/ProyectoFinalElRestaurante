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

import Entidades.Pedido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoData {
    
    public void insertarPedido(Pedido pedido) {
        try {
            String sql = "INSERT INTO pedidos (id_mesa, id_mesero, id_producto, fecha, estado) VALUES (?, ?, ?, ?, ?)";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, pedido.getIdMesa());
                statement.setInt(2, pedido.getIdMesero());
                statement.setInt(3, pedido.getIdProducto());
                statement.setDate(4, new java.sql.Date(pedido.getFecha().getTime()));
                statement.setBoolean(5, pedido.isEstado());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarPedido(Pedido pedido) {
        try {
            String sql = "UPDATE pedidos SET id_mesa=?, id_mesero=?, id_producto=?, fecha=?, estado=? WHERE id_pedido=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, pedido.getIdMesa());
                statement.setInt(2, pedido.getIdMesero());
                statement.setInt(3, pedido.getIdProducto());
                statement.setDate(4, new java.sql.Date(pedido.getFecha().getTime()));
                statement.setBoolean(5, pedido.isEstado());
                statement.setInt(6, pedido.getIdPedido());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarPedido(int idPedido) {
        try {
            String sql = "DELETE FROM pedidos WHERE id_pedido=?";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, idPedido);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pedido> obtenerTodosLosPedidos() {
        List<Pedido> listaPedidos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedidos";
            try (Connection con = Conexion.getConexion();
                 PreparedStatement statement = con.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idPedido = resultSet.getInt("id_pedido");
                    int idMesa = resultSet.getInt("id_mesa");
                    int idMesero = resultSet.getInt("id_mesero");
                    int idProducto = resultSet.getInt("id_producto");
                    Date fecha = resultSet.getDate("fecha");
                    boolean estado = resultSet.getBoolean("estado");

                    Pedido pedido = new Pedido(idPedido, idMesa, idMesero, idProducto, fecha, estado);
                    listaPedidos.add(pedido);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPedidos;
    }
}