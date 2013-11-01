/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.tagext.TryCatchFinally;
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
           String Sql = "UPDATE Direccion SET Pais='"+direc.getPais()+"', Departamento='"+direc.getDepartamentto()
                   + "', Municipio='"+direc.getMunicipio()+"', Asentamiento='"+direc.getAsentamiento()+"', Zona='"+direc.getZona()
                   + "', Calle='"+direc.getCalle()+"', Avenida='"+direc.getAvenida()+"', NumeroDeCasa='"+direc.getNumeroCasa()+"'"+" Where ID_Direccion='";
           this.con.ejecutado(Sql);
        } catch (Exception e) {
            Logger.getLogger(DAOpersona.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            this.con.cerrar();
        }    
    }
    
    public void save(direccion direc){
        try {
            String Sql = "INSERT INTO Direccion (Pais, Departamento, Municipio, Asentamiento, Zona, Calle, Avenida, NumeroDeCasa)+"
                + "values('"+direc.getPais()+"','"+direc.getDepartamentto()+"','"+direc.getMunicipio()+"','"+direc.getAsentamiento()
                +"','"+direc.getZona()+"','"+direc.getCalle()+"','"+direc.getAvenida()+"','"+direc.getNumeroCasa()+"')";  
            this.con.ejecutado(Sql);
        } catch (Exception e) {
            Logger.getLogger(DAOpersona.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            this.con.cerrar();
        }
                   
    }
    
}
