/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;
/**
 *
 * @author francisco
 */
public abstract class conexionBD {
    protected String[] parametros;
    protected Connection conexion;
    
    abstract Connection abrir();
    
    public ResultSet query(String query){
        Statement st;
        ResultSet rs =null;
        try {
            st = conexion.createStatement();
            rs=st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
     public boolean ejecutado(String query){
        Statement st;
        boolean save=true;
        try {
            st = conexion.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            save=false;
            
            e.printStackTrace();
        }
        return save;
    }
     
     public boolean cerrar(){
         boolean ok=true;
         try {
             conexion.close();
         } catch (Exception e) {
             ok=false;
             e.printStackTrace();
         }
         return ok;
     }
}
