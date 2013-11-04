/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author principal
 */
public class Relaciones {
    private int tipo;
    private String cui1;
    private String cui2;
    private String doc;
    private Date fechaini;
    private Date fechafin;

    public Relaciones() {
    }

    public Relaciones(int tipo, String cui1, String cui2, String doc, Date fechaini, Date fechafin) {
        this.tipo = tipo;
        this.cui1 = cui1;
        this.cui2 = cui2;
        this.doc = doc;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
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
     * @return the fechaini
     */
    public Date getFechaini() {
        return fechaini;
    }

    /**
     * @param fechaini the fechaini to set
     */
    public void setFechaini(Date fechaini) {
        this.fechaini = fechaini;
    }

    /**
     * @return the fechafin
     */
    public Date getFechafin() {
        return fechafin;
    }

    /**
     * @param fechafin the fechafin to set
     */
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    
    
    
}
