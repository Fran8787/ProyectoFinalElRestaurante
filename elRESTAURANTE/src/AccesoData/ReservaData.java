package AccesoData;




import Entidades.Reserva;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ReservaData {
    private Connection con = null;

    

    public List<Reserva> consultarReservas() {
        List<Reserva> reservas = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Connection con = Conexion.getConexion();
            String selectQuery = "SELECT id_reserva, id_mesa, nombre, dni, fecha, hora, estado FROM reservas";
            preparedStatement = con.prepareStatement(selectQuery);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idReserva = resultSet.getInt("id_reserva");
                int idMesa = resultSet.getInt("id_mesa");
                String nombre = resultSet.getString("nombre");
                int dni = resultSet.getInt("dni");
                LocalDate fecha = resultSet.getDate("fecha").toLocalDate();
                Time hora = resultSet.getTime("hora");
                boolean estado = resultSet.getBoolean("estado");

                Reserva reserva = new Reserva(idReserva, idMesa, nombre, dni, fecha, hora, estado);
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(con, preparedStatement, resultSet);
        }

        return reservas;
    }

    private void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}