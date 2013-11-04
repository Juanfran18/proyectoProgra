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
public class Person {
    private String cui;
    private String nombre;
    private String apellido;
    private String sexo;
    private String estadoCivil;
    private int estatusNacional;
    private Date fechaDeNacimiento;
    private int idLugarN;
    private Date fechaDeDefuncion;
    private int idLugarD;
    private int idVecindad;

    public Person() {
    }

    public Person(String cui, String nombre, String apellido, String sexo, String estadoCivil, int estatusNacional, Date fechaDeNacimiento, int idLugarN, Date fechaDeDefuncion, int idLugarD, int idVecindad) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.estatusNacional = estatusNacional;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.idLugarN = idLugarN;
        this.fechaDeDefuncion = fechaDeDefuncion;
        this.idLugarD = idLugarD;
        this.idVecindad = idVecindad;
    }

    /**
     * @return the cui
     */
    public String getCui() {
        return cui;
    }

    /**
     * @param cui the cui to set
     */
    public void setCui(String cui) {
        this.cui = cui;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the estatusNacional
     */
    public int getEstatusNacional() {
        return estatusNacional;
    }

    /**
     * @param estatusNacional the estatusNacional to set
     */
    public void setEstatusNacional(int estatusNacional) {
        this.estatusNacional = estatusNacional;
    }

    /**
     * @return the fechaDeNacimiento
     */
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the idLugarN
     */
    public int getIdLugarN() {
        return idLugarN;
    }

    /**
     * @param idLugarN the idLugarN to set
     */
    public void setIdLugarN(int idLugarN) {
        this.idLugarN = idLugarN;
    }

    /**
     * @return the fechaDeDefuncion
     */
    public Date getFechaDeDefuncion() {
        return fechaDeDefuncion;
    }

    /**
     * @param fechaDeDefuncion the fechaDeDefuncion to set
     */
    public void setFechaDeDefuncion(Date fechaDeDefuncion) {
        this.fechaDeDefuncion = fechaDeDefuncion;
    }

    /**
     * @return the idLugarD
     */
    public int getIdLugarD() {
        return idLugarD;
    }

    /**
     * @param idLugarD the idLugarD to set
     */
    public void setIdLugarD(int idLugarD) {
        this.idLugarD = idLugarD;
    }

    /**
     * @return the idVecindad
     */
    public int getIdVecindad() {
        return idVecindad;
    }

    /**
     * @param idVecindad the idVecindad to set
     */
    public void setIdVecindad(int idVecindad) {
        this.idVecindad = idVecindad;
    }
    
    
    
}
