/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.BDconexion;
import BD.conexionBD;

/**
 *
 * @author francisco
 */
public class DAOpersona {
    
    conexionBD con;

    public DAOpersona() {
        this.con =BDconexion.open(BDconexion.mysql);
    }
    
    
}
