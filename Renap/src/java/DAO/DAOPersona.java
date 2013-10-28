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
public class DAOPersona {

    conexionBD con;
    public DAOPersona() {
        con = BDconexion.open(BDconexion.mysql);
    }   
    
    public void nuevaPersona(persona per){
        try {
            
        } catch (Exception e) {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO persona (CUI,Nombre,Apellido,Sexo,EstadoCivil,"
                    + "EstatusNacional,FechaDeNacimiento,LugardeNacimiento,"
                    + "FechaDeDefuncion,LugarDeDefuncion,vecindad,Firma,Foto)"
                    + " VALUES ()");
        }
        
    }
    
}
