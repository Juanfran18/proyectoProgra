/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author francisco
 */
public class BDconexion {
//manejador de la bd 
    public static final int mysql = 1;
    public static String[] configMysql = {"umg", "root", "pass"};

    public static conexionBD open(int bd) {
        switch (bd) {
            case BDconexion.mysql:
                return new MySQLconexionBD(configMysql);
            default:
                return null;
        }
    }
}
