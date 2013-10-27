/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author francisco
 */
public final class MySQLconexionBD extends conexionBD{

    public MySQLconexionBD(String[] params ) {
        this.parametros = params;
        this.abrir();
    }

    
    
    @Override
    Connection abrir() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conexion= DriverManager.getConnection("jdbc:mysql://localhost/"+this.parametros[0],this.parametros[1],this.parametros[2]);
        } catch (Exception e) {
        }
        return this.conexion;
    }
    
    
}
