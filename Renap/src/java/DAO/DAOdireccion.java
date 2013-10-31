/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.*;
import modelo.direccion;

/**
 *
 * @author francisco
 */
public class DAOdireccion {

    conexionBD con;
    public DAOdireccion() {
        this.con=BDconexion.open(BDconexion.mysql);        
    }
    
    public void edit(direccion direc){
        this.con = BDconexion.open(BDconexion.mysql);
        try {
           String Sql = "UPDATE Direccion SET ";
        } catch (Exception e) {
        }
        
    }
    
}
