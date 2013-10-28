/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author francisco
 */
public class relacion {
    
   private int tipo;
   private String cui1;
   private String cui2;
   private String doc;
   private Date fechaInicio;
   private Date fechaFinal;

    public relacion() {
    }

    public relacion(int tipo, String cui1, String cui2, String doc, Date fechaInicio, Date fechaFinal) {
        this.tipo = tipo;
        this.cui1 = cui1;
        this.cui2 = cui2;
        this.doc = doc;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cui1
     */
    public String getCui1() {
        return cui1;
    }

    /**
     * @param cui1 the cui1 to set
     */
    public void setCui1(String cui1) {
        this.cui1 = cui1;
    }

    /**
     * @return the cui2
     */
    public String getCui2() {
        return cui2;
    }

    /**
     * @param cui2 the cui2 to set
     */
    public void setCui2(String cui2) {
        this.cui2 = cui2;
    }

    /**
     * @return the doc
     */
    public String getDoc() {
        return doc;
    }

    /**
     * @param doc the doc to set
     */
    public void setDoc(String doc) {
        this.doc = doc;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }   
}
