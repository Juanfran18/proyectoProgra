/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author francisco
 */
public class direccion {
    private String pais;
    private int departamentto;
    private int municipio;
    private String asentamiento;
    private int zona;
    private String calle;
    private String avenida;
    private int numeroCasa;

    public direccion() {
    }

    public direccion(String pais, int departamentto, int municipio, String asentamiento, int zona, String calle, String avenida, int numeroCasa) {
        this.pais = pais;
        this.departamentto = departamentto;
        this.municipio = municipio;
        this.asentamiento = asentamiento;
        this.zona = zona;
        this.calle = calle;
        this.avenida = avenida;
        this.numeroCasa = numeroCasa;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the departamentto
     */
    public int getDepartamentto() {
        return departamentto;
    }

    /**
     * @param departamentto the departamentto to set
     */
    public void setDepartamentto(int departamentto) {
        this.departamentto = departamentto;
    }

    /**
     * @return the municipio
     */
    public int getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the asentamiento
     */
    public String getAsentamiento() {
        return asentamiento;
    }

    /**
     * @param asentamiento the asentamiento to set
     */
    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    /**
     * @return the zona
     */
    public int getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(int zona) {
        this.zona = zona;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the avenida
     */
    public String getAvenida() {
        return avenida;
    }

    /**
     * @param avenida the avenida to set
     */
    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    /**
     * @return the numeroCasa
     */
    public int getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * @param numeroCasa the numeroCasa to set
     */
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    
    
}
