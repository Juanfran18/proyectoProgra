/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.factory;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Person;

/**
 *
 * @author francisco
 */
public class DAOPersona {

     factory fac;

    public DAOPersona() {
        fac = new factory();
    }

    public Person edit(Person per) {
        try {
            String sql = "UPDATE persona SET Nombre='" + per.getNombre() + "', Apellido='" + per.getApellido()
                    + "', Sexo='" + per.getSexo() + "', EstadoCivil='" + per.getEstadoCivil() + "', EstatusNacional='" + per.getEstatusNacional()
                    + "', FechaDeNacimiento='" + per.getFechaDeNacimiento()+ "', LugarDeNacimiento='" + per.getIdLugarN()
                    + "',FechaDeDefuncion='" + per.getFechaDeDefuncion()+ "', LugarDeDefuncion='" + per.getIdLugarD()
                    + "', Vecindad='" + per.getIdVecindad()+"'" + " WHERE CUI='"+per.getCui()+"'";
            fac.ejecutado(sql);
        } catch (Exception e) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        return per;

    }

    public boolean registrar(Person per) {
        boolean save = false;
        try {
            String sql = "INSERT INTO persona(CUI,Nombre,Apellido,Sexo,EstadoCivil,EstatusNacional,FechaDeNacimiento,"
                    + "LugarDeNacimiento, Vecindad)"
                    + "VALUES('" + per.getCui() + "','" + per.getNombre() + "','" + per.getApellido() + "','" + per.getSexo() + "','"
                    + per.getEstadoCivil() + "','" + per.getEstatusNacional() + "','" + per.getFechaDeNacimiento()+ "','"
                    + per.getIdLugarN()+ "','" + per.getIdVecindad() + "')";
            fac.ejecutado(sql);


        } catch (Exception e) {

            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, e);
        } 
        return save;
    }
    /*
    public boolean save(persona per) {
        this.con = BDconexion.open(BDconexion.mysql);
        boolean save = false;
        try {
            String sql = "INSERT INTO persona(CUI,Nombre,Apellido,Sexo,EstadoCivil,EstatusNacional,FechaDeNacimiento,"
                    + "LugarDeNacimiento,FechaDeDefuncion,LugarDeDefuncion,Vecindad,Firma,Foto)"
                    + "VALUES('" + per.getCui() + "','" + per.getNombre() + "','" + per.getApellido() + "','" + per.getSexo() + "','"
                    + per.getEstadoCivil() + "','" + per.getEstatusNacional() + "','" + per.getFechaNacimiento() + "','"
                    + per.getIdLugarNacimiento() + "','" + per.getFechaDefuncion() + "','" + per.getIdLugarDefuncion()
                    + "','" + per.getIdVecindad() + "','" + per.getFirma() + "','" + per.getFoto() + "')";
            this.con.ejecutado(sql);


        } catch (Exception e) {

            Logger.getLogger(DAOpersona.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            this.con.cerrar();
        }
        return save;
    }*/
}
