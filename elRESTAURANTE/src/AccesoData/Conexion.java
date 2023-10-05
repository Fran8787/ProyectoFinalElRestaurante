/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoData;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="elrestaurante";
    private static String USUARIO="root";
    private  static String PASSWORD="";
    private static Connection connection;

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private Conexion(){}
    
    public static Connection getConexion(){
     
        if(connection == null){
        
            try {   
                Class.forName("org.mariadb.jdbc.Driver");
             connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
            
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar los driver");
           
      
                
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }
        }
            return connection;
    }
    
} 
    

