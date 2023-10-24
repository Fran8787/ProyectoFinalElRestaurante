package AccesoData;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }

   public void usuarioContraseña(String user, String pass) {
    String sql = "SELECT `idMesero`, `nombre`, `apellido`, `usuario`, `contraseña`, `estado` FROM `mesero` WHERE `usuario` = ? AND `contraseña` = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            
            // Se encontró un registro con el usuario y contraseña proporcionados
            int idMesero = rs.getInt("idMesero");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String usuario = rs.getString("usuario");
            String contraseña = rs.getString("contraseña");
            String estado = rs.getString("estado");

            // Puedes utilizar los datos del mesero según tus necesidades
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. Bienvenido, " + nombre + " " + apellido);
        } else {
            // No se encontró un registro con el usuario y contraseña proporcionados
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Por favor, inténtalo nuevamente.");
        }

        rs.close();
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero: " + ex.getMessage());
    }
} 
   
    public void guardarProducto(Producto producto) {
        String sql = "INSERT INTO producto (nombre, categoria, precio, disponible, cantidad) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setInt(3, producto.getPrecio());
            ps.setInt(4, producto.getDisponible());
            ps.setInt(5, producto.getCantidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
        }
    }

    public Producto buscarProducto(int id) throws SQLException {
        Producto producto = null;
        String sql = "SELECT * FROM producto WHERE idProducto = ? AND disponible = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Producto(
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getInt("cantidad"),
                    rs.getInt("precio"),
                    rs.getInt("disponible")
                );
                producto.setIdProducto(id);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Producto");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
        }
        return producto;
    }
    public Producto buscarProductoNombre(String nombre){
         Producto producto = null;
    String sql = "SELECT * FROM producto WHERE nombre = ? AND disponible = 1";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            producto = new Producto(
                rs.getString("nombre"),
                rs.getString("categoria"),
                rs.getInt("cantidad"),
                rs.getInt("precio"),
                rs.getInt("disponible")
            );
            producto.setIdProducto(rs.getInt("idProducto"));
        } else {
            JOptionPane.showMessageDialog(null, "No existe el Producto");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
    }
    return producto;
    }

    public List<Producto> listarProductos(){
        List<Producto> productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto WHERE disponible = 1 AND cantidad > 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto(
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getInt("cantidad"),
                    rs.getInt("precio"),
                    rs.getInt("disponible")
                       
                );
                producto.setIdProducto(rs.getInt("idProducto"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
        }
        return productos;
    }
    
    public List<Producto> listarProdxCategoria(String cat) {
        List<Producto> productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto WHERE disponible = 1 AND cantidad > 0 AND categoria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto(
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getInt("cantidad"),
                    rs.getInt("precio"),
                    rs.getInt("disponible")
                       
                );
                producto.setIdProducto(rs.getInt("idProducto"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
        }
        return productos;
    }

    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre = ?, categoria = ?, precio = ?, disponible = ?, cantidad = ? WHERE idProducto = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setInt(3, producto.getPrecio());
            ps.setInt(4, producto.getDisponible());
            ps.setInt(5, producto.getCantidad());
            ps.setInt(6, producto.getIdProducto());
          
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
        }
    }

    public void eliminarProducto(int id) {
        try {
            String sql = "UPDATE producto SET disponible = 0 WHERE idProducto = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el Producto.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
    }
}
