
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){    
          try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/persona","root","");
          }catch(Exception e){
              System.err.println("Error" +e);
          }
    }
    
    public Connection getConnection(){
         return con;//Retornamos la conexión a la base de datos 
    }
}//Fin clase Conexion
