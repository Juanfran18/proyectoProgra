/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.BDconexion;
import BD.conexionBD;
import modelo.persona;

/**
 *
 * @author francisco
 */
public class DAOpersona {
    
    conexionBD con;

    public DAOpersona() {
        this.con =BDconexion.open(BDconexion.mysql);
    }
    
    public boolean save(persona per){
        boolean save =false;
        try {
            
        } catch (Exception e) {
        }
        return save;        
    }            
    
}
