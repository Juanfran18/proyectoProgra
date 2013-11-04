/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author principal
 */
public class factory {
    Connection cn;
    
    public ResultSet query(String query){
        cn = Conexion.getConexion();
        Statement st;
        ResultSet rs =null;
        try {
            st = cn.createStatement();
            rs=st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
     public boolean ejecutado(String query){
         cn = Conexion.getConexion();
        Statement st;
        boolean save=true;
        try {
            st = cn.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            save=false;
            
            e.printStackTrace();
        }
        return save;
    }
}
