/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.factory;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Direccion;

/**
 *
 * @author francisco
 */
public class DAOdireccion {

     factory fac;

    public DAOdireccion() {
        fac = new factory();
    }

    
    public void edit(Direccion direc){      
        try {
           String Sql = "UPDATE Direccion SET Pais='"+direc.getPais()+"', Departamento='"+direc.getDepartamentto()
                   + "', Municipio='"+direc.getMunicipio()+"', Asentamiento='"+direc.getAsentamiento()+"', Zona='"+direc.getZona()
                   + "', Calle='"+direc.getCalle()+"', Avenida='"+direc.getAvenida()+"', NumeroDeCasa='"+direc.getNumeroCasa()+"'"+" Where ID_Direccion='";
           fac.ejecutado(Sql);
        } catch (Exception e) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, e);
        }  
    }
    
    public void save(Direccion direc){
        try {
            String Sql = "INSERT INTO Direccion (Pais, Departamento, Municipio, Asentamiento, Zona, Calle, Avenida, NumeroDeCasa)+"
                + "values('"+direc.getPais()+"','"+direc.getDepartamentto()+"','"+direc.getMunicipio()+"','"+direc.getAsentamiento()
                +"','"+direc.getZona()+"','"+direc.getCalle()+"','"+direc.getAvenida()+"','"+direc.getNumeroCasa()+"')";  
            fac.ejecutado(Sql);
        } catch (Exception e) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, e);
        }
                   
    }
    
}
