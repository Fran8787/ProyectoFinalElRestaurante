

import AccesoData.ProductoData;
import Entidades.Producto;
import java.util.List;


import AccesoData.ReservaData;
import static AccesoData.ReservaData.consultarReservas;
import java.util.List;



/**
 * sql INSERT INTO `mesero`(`nombre`, `apellido`, `usuario`, `contraseña`,
 * `estado`) VALUES ('Pablo','Poder','Pablo','Poder','0'),
 * ('Antonella','Civarello','Antonella','Civarello','0'),('Mauricio','Funes','Mauricio','Funes','0'),('Maira','Rotte','Maira','Rotte','0'),('Sebastian','Busto','Sebastian','Busto','0');
 *
 *
 *
 * INSTRUCTIVO: El proyecto será una aplicación en Java / MySQL. Se debe crear
 * las tablas de la base de datos, y las correspondientes clases. Utilice una
 * clase para la conexión y confeccione la interfaz gráfica (GUI). El grupo
 * deberá presentar el proyecto en 3 etapas.
 *
 *
 * 1-	Armado de la base de datos completa, relaciones. Proyecto en Netbeans, y
 * clase de conexión. ABM de la clase Producto (ProductoData) y pruebas dede el
 * main.
 *
 * 2-	Desarrollo de todas las clases principales del dominio (ABM), consultas
 * SQL embebidas. Interfaces gráficas completas.
 *
 * 3-	Implementación de los todos los métodos necesarios, listados, ABM de
 * clases relacionadas y aplicación terminada.
 *
 * Se deben presentar las clases con atributos y métodos
 * necesarios(abstracción). Setters y Getters (encapsulamiento). Constructor. Se
 * evaluará el aporte de todos los miembros al proyecto, en la construcción de
 * las clases. Se subirán los commit al repositorio (Git). * 5	ATENCION DEL
 * RESTÓ Se solicita un sistema para un Restó, que permita ingresar a la gente
 * que viene a almorzar o cenar, y pasar un buen rato. * RELACIONES
 *
 * ●	El Resto tiene muchas mesas, cada mesa hace uno o varios pedidos. Y cada
 * pedido corresponde a una mesa en particular.
 *
 * ●	En un Pedido se pueden agregar uno o más productos. Ese producto solo está
 * en un pedido por vez. ●	Cada pedido es cobrado por un mesero y cada mesero
 * cobra muchos pedidos. ●	Una mesa puede tener reserva, a nombre de una
 * persona, DNI, fecha, hora, y estado vigente o no vigente. El mesero puede
 * anular la reserva. ●	Es necesario que los meseros se registren en el sistema
 * por única vez, y acceder para poder cargar Pedidos, y así atender mesas
 * ocupadas con gente. ABMC mesero. ●	Las mesas tienen número, capacidad,
 * estado. ABMC Mesas. ●	El lugar vende productos de comida tal como pizzas,
 * lomos, hamburguesas, o tacos. Se venden bebidas con o sin alcohol, gaseosa y
 * cerveza. Los productos guardan código, nombre, cantidad, y precio. ABMC
 * productos.
 *
 * CREANDO PEDIDOS ●	Una mesa ocupada puede hacer uno o varios pedidos. Un
 * mesero atiende todos los pedidos de esa mesa, cada pedido es atendido por ese
 * mesero. Los pedidos se toman por una mesera que los atiende y cobra los
 * pedidos que los ocupantes realicen. La mesera carga un pedido vinculado a una
 * mesa, y una lista de productos que, sumados todos los importes unitarios, se
 * obtiene el monto del pedido. Inicialmente están pendientes (0) o
 * entregado/pagado (1). Una mesa puede tener entre sus pedidos algunos pagados
 * y otros sin pagar. ●	Un método agregar producto, agrega un producto a un
 * pedido (una lista de productos). Quitar producto lo elimina o anula del
 * pedido. ●	Calcula Subtotal: recibe la cantidad de un producto por su precio
 * unitario, devuelve el subtotal. Ejemplo dos gaseosas a 100$, subtotal 200$. ●
 * Un método sumar subtotales, suma los precios de productos y devuelve el monto
 * final. sumados componen el monto total de la cuenta. ●	Una mesa puede estar
 * en estado libre, ocupada, atendida, y al ser cobrada pasa a libre. ●	Los
 * meseros pueden listar pedidos cobrados en el día. Anular pedidos. ●	Listar
 * ingresos sumando totales de pedidos para una fecha en particular. ●	Listar
 * los pedidos que cobro un mesero en particular en el día. ●	Listar los pedidos
 * que ha hecho una mesa en una fecha entre horas.
 */
public class Main {    
    public static void main(String[] args) {


        ProductoData pd = new ProductoData();

        //------------------------------------------------------------
        Producto pro = new Producto("Hamburgesa de lentejaa", "Hamburguesas", 100, 10000, 1);
        pd.guardarProducto(pro);

        //------------------------------------------------------------
      //  pd.eliminarProducto(54);

        //------------------------------------------------------------
        List<Producto> productos = pd.listarProductos();

        for (Producto producto : productos) {
            System.out.println("ID del Producto: " + producto.getIdProducto());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Disponible: " + producto.getDisponible());
            System.out.println("-----------------------------");
        }
    
    //------------------------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

     
        List<ReservaData> reservas = consultarReservas();
        for (ReservaData reserva : reservas) {
            System.out.println(reserva);
    }

    }

}
