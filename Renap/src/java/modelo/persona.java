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
public class persona {

    private String cui;
    private String nombre;
    private String apellido;
    private String sexo;
    private String estadoCivil;
    private int estatusNacional;
    private Date fechaNacimiento;
    private int idLugarNacimiento;
    private Date fechaDefuncion;
    private int idLugarDefuncion;
    private int idVecindad;
    private String foto;
    private String firma;

    public persona() {
    }

    public persona(String cui, String nombre, String apellido, String sexo, String estadoCivil, int estatusNacional, Date fechaNacimiento, int idLugarNacimiento, Date fechaDefuncion, int idLugarDefuncion, int idVecindad, String foto, String firma) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.estatusNacional = estatusNacional;
        this.fechaNacimiento = fechaNacimiento;
        this.idLugarNacimiento = idLugarNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.idLugarDefuncion = idLugarDefuncion;
        this.idVecindad = idVecindad;
        this.foto = foto;
        this.firma = firma;
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
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the idLugarNacimiento
     */
    public int getIdLugarNacimiento() {
        return idLugarNacimiento;
    }

    /**
     * @param idLugarNacimiento the idLugarNacimiento to set
     */
    public void setIdLugarNacimiento(int idLugarNacimiento) {
        this.idLugarNacimiento = idLugarNacimiento;
    }

    /**
     * @return the fechaDefuncion
     */
    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    /**
     * @param fechaDefuncion the fechaDefuncion to set
     */
    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    /**
     * @return the idLugarDefuncion
     */
    public int getIdLugarDefuncion() {
        return idLugarDefuncion;
    }

    /**
     * @param idLugarDefuncion the idLugarDefuncion to set
     */
    public void setIdLugarDefuncion(int idLugarDefuncion) {
        this.idLugarDefuncion = idLugarDefuncion;
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

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the firma
     */
    public String getFirma() {
        return firma;
    }

    /**
     * @param firma the firma to set
     */
    public void setFirma(String firma) {
        this.firma = firma;
    }

    
    
}
