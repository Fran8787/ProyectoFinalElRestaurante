
/**
 * INSTRUCTIVO: El proyecto será una aplicación en Java / MySQL. Se debe crear las tablas de la base de datos,
 * y las correspondientes clases. Utilice una clase para la conexión y confeccione la interfaz gráfica (GUI). 
 * El grupo deberá presentar el proyecto en 3 etapas.
 * 
 * 1-	Armado de la base de datos completa, relaciones. Proyecto en Netbeans, y clase de conexión.
 * ABM de la clase Producto (ProductoData) y pruebas dede el main.
 * 
 * 2-	Desarrollo de todas las clases principales del dominio (ABM), consultas SQL embebidas. 
 * Interfaces gráficas completas.
 * 
 * 3-	Implementación de los todos los métodos necesarios, listados, ABM de clases relacionadas y aplicación terminada.
 *
 * Se deben presentar las clases con atributos y métodos necesarios(abstracción). Setters y Getters (encapsulamiento).
 * Constructor.
 * Se evaluará el aporte de todos los miembros al proyecto, en la construcción de las clases.
 * Se subirán los commit al repositorio (Git).  *
 * 5	ATENCION DEL RESTÓ
 * Se solicita un sistema para un Restó, que permita ingresar a la gente que viene a almorzar o cenar, y pasar un buen rato.  *
 * RELACIONES
 *
 * ●	El Resto tiene muchas mesas, cada mesa hace uno o varios pedidos. Y cada pedido corresponde a una mesa en particular.
 * ●	En un Pedido se pueden agregar uno o más productos. Ese producto solo está en un pedido por vez.
 * ●	Cada pedido es cobrado por un mesero y cada mesero cobra muchos pedidos.
 * ●	Una mesa puede tener reserva, a nombre de una persona, DNI, fecha, hora, y estado vigente o no vigente.
 * El mesero puede anular la reserva.
 * ●	Es necesario que los meseros se registren en el sistema por única vez, y acceder para poder cargar Pedidos,
 * y así atender mesas ocupadas con gente. ABMC mesero.
 * ●	Las mesas tienen número, capacidad, estado. ABMC Mesas.
 * ●	El lugar vende productos de comida tal como pizzas, lomos, hamburguesas, o tacos.
 * Se venden bebidas con o sin alcohol, gaseosa y cerveza. Los productos guardan código, nombre, cantidad, y precio.
 * ABMC productos.
 *
 * CREANDO PEDIDOS
 * ●	Una mesa ocupada puede hacer uno o varios pedidos. Un mesero atiende todos los pedidos de esa mesa,
 * cada pedido es atendido por ese mesero.
 * Los pedidos se toman por una mesera que los atiende y cobra los pedidos que los ocupantes realicen.
 * La mesera carga un pedido vinculado a una mesa, y una lista de productos que, sumados todos los importes unitarios, se obtiene el monto del pedido. Inicialmente están pendientes (0) o entregado/pagado (1). Una mesa puede tener entre sus pedidos algunos pagados y otros sin pagar.
 * ●	Un método agregar producto, agrega un producto a un pedido (una lista de productos).
 * Quitar producto lo elimina o anula del pedido.
 * ●	Calcula Subtotal: recibe la cantidad de un producto por su precio unitario, devuelve el subtotal.
 * Ejemplo dos gaseosas a 100$, subtotal 200$.
 * ●	Un método sumar subtotales, suma los precios de productos y devuelve el monto final.
 * sumados componen el monto total de la cuenta.
 * ●	Una mesa puede estar en estado libre, ocupada, atendida, y al ser cobrada pasa a libre.
 * ●	Los meseros pueden listar pedidos cobrados en el día. Anular pedidos.
 * ●	Listar ingresos sumando totales de pedidos para una fecha en particular.
 * ●	Listar los pedidos que cobro un mesero en particular en el día.
 * ●	Listar los pedidos que ha hecho una mesa en una fecha entre horas.
 */
public class Main {

    public static void main(String[] args) {

    }

}
