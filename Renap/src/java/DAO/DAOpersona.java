/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.BDconexion;
import BD.conexionBD;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.persona;

/**
 *
 * @author francisco
 */
public class DAOpersona {

    conexionBD con;

    public DAOpersona() {
        this.con = BDconexion.open(BDconexion.mysql);
    }

    public boolean save(persona per) {
        boolean save = false;        
        try {
            String sql = "INSERT INTO persona(CUI,Nombre,Apellido,Sexo,EstadoCivil,EstatusNacional,FechaDeNacimiento,"
                    + "LugarDeNacimiento,FechaDeDefuncion,LugarDeDefuncion,Vecindad,Firma,Foto)"
                    + "VALUES('" + per.getCui() + "','" + per.getNombre() + "','" + per.getApellido() + "','" + per.getSexo() + "','"
                    + per.getEstadoCivil() + "','" + per.getEstatusNacional() + "','" + per.getFechaNacimiento() + "','"
                    + per.getIdLugarNacimiento() + "','" + per.getFechaDefuncion() + "','" + per.getIdLugarDefuncion() 
                    + "','" + per.getIdVecindad()+"','"+per.getFirma()+"','"+per.getFoto()+ "')";
            this.con.ejecutado(sql);
            

        } catch (Exception e) {
            Logger.getLogger(DAOpersona.class.getName()).log(Level.SEVERE, null, e);
        }
        return save;
    }
}
