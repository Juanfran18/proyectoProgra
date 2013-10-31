/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.relacion;

/**
 *
 * @author francisco
 */
public class DAOrelacion {
    
    conexionBD con;
    
    public DAOrelacion() {
        this.con = BDconexion.open(BDconexion.mysql);
    }
    
    
    public void save(relacion re){
        try {
            String sql="INSER INTO Relacion(TipoDeRelacion,CUI_1,CUI_2,DOC_Relacion,FechaInicio,FechaFin)"
                    + "VALUES('"+re.getTipo()+"','"+re.getCui1()+"','"+re.getCui2()+"','"+re.getFechaInicio()+"','"+re.getFechaFinal()+"')";
            this.con.ejecutado(sql);
           
        } catch (Exception e) {
             Logger.getLogger(DAOpersona.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            this.con.cerrar();
        }
    }
    
    
}
