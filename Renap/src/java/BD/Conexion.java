/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;

/**
 *
 * @author principal
 */
public class Conexion {
     /*static String bd = "universidad";
    static String user = "rootadmin1524";
    static String password = "adminlopez1524";
    static String url = "jdbc:mysql://db4free.net:3306/" + bd;*/
    static String bd = "Renap";
    static String user = "root";
    static String password = "";
    static String Hostname="localhost:";
    static int puerto=3306;
    static String url = "jdbc:mysql://"+Hostname+puerto+"/" + bd;
    Connection conn = null;

    
    public static synchronized Connection getConexion() {
        Connection cn = null;
        try {            
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            cn = null;
        } finally {
            return cn;
        }
    }

    public void desconectar() {
        conn = null;
        System.out.println("La conexion a la  base de datos " + bd + " a terminado");
    }
    
}
