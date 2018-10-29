/*
 Clase para conectar Base de datos MySQL
 */
package Conexion_DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author raul
 */
public class Conexion {
    private Connection con;
      
    public Conexion(){
    
    String driver="com.mysql.cj.jdbc.Driver";
    String url= "jdbc:mysql://localhost:3306/DB_Galileo?autoReconnect=true&useSSL=false";  
    String user="root";
    String password = "villa$1%5";  
   
    
    try{
        Class.forName(driver);
        con=DriverManager.getConnection(url,user,password);
        System.out.println("Conectado a la base de datos");
        
        }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error de conexion"+e.getMessage());
       
        }
    }
    
    public Connection conectar(){
        return con;
    }
    
    public void desconectar(){
       try{
        con.close();
        System.out.println("Cerrado");
        }catch (SQLException e){
            System.out.println("Error al cerrar conexion"+e.getMessage());
        } finally {
            try{
                if (con != null) {
                    con.close(); 
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
    }
    }

}
