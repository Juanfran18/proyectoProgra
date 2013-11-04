/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Relacion;

/**
 *
 * @author francisco
 */
public class DAOrelacion {
    
  factory fac;

    public DAOrelacion() {
        fac = new factory();
    }
    
    
    public void save(Relacion re){
        try {
            String sql="INSER INTO Relacion(TipoDeRelacion,CUI_1,CUI_2,DOC_Relacion,FechaInicio,FechaFin)"
                    + "VALUES('"+re.getTipo()+"','"+re.getCui1()+"','"+re.getCui2()+"','"+re.getFechaInicio()+"','"+re.getFechaFinal()+"')";
            fac.ejecutado(sql);
           
        } catch (Exception e) {
             Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
