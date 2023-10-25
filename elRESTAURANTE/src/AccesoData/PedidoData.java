
package AccesoData;



import Entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoData {
    Connection con = Conexion.getConexion();
    
    public void insertarPedido(Pedido pedido) {
        String sql = "INSERT INTO pedido (idMesa, idMesero, idProducto, fecha, estado) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1, pedido.getIdMesa());
                statement.setInt(2, pedido.getIdMesero());
                statement.setInt(3, pedido.getIdProducto());
                statement.setDate(4, new java.sql.Date(pedido.getFecha().getTime()));
                statement.setBoolean(5, pedido.isEstado());
                statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Su pedido fue insertado con exitos");
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"Su pedido no pudo ser insertado, problema con el servidor");
        }
    }

    public void modificarPedido(Pedido pedido) {
          String sql = "UPDATE pedido SET idMesa=?, idMesero=?, idProducto=?, fecha=?, estado=? WHERE idPedido=?";
            try {
                 PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1, pedido.getIdMesa());
                statement.setInt(2, pedido.getIdMesero());
                statement.setInt(3, pedido.getIdProducto());
                statement.setDate(4, new java.sql.Date(pedido.getFecha().getTime()));
                statement.setBoolean(5, pedido.isEstado());
                statement.setInt(6, pedido.getIdPedido());
                statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Su pedido fue modificado con exito");
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"ERROR problema con la base de datos, no pudo ser modificado");
        }
    }

    public void eliminarPedido(int idPedido) {
        String sql = "DELETE FROM pedido WHERE idPedido=?";
           try {
                 PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1, idPedido);
                statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Su pedido fue eliminado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Su pedido no pudo ser eliminado, ERROR en la base de datos");
        }
    }

    public List<Pedido> obtenerTodosLosPedidos() {
        List<Pedido> listaPedidos = new ArrayList<>();
            String sql = "SELECT * FROM pedido";
           try { 
                 PreparedStatement statement = con.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int idPedido = resultSet.getInt("idPedido");
                    int idMesa = resultSet.getInt("idMesa");
                    int idMesero = resultSet.getInt("idMesero");
                    int idProducto = resultSet.getInt("idProducto");
                    Date fecha = resultSet.getDate("fecha");
                    boolean estado = resultSet.getBoolean("estado");

                    Pedido pedido = new Pedido(idPedido, idMesa, idMesero, idProducto, fecha, estado);
                    listaPedidos.add(pedido);
                }
            JOptionPane.showMessageDialog(null,"Sus pedidos se mostraran con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en la base de datos");
        }
        return listaPedidos;
    }
}