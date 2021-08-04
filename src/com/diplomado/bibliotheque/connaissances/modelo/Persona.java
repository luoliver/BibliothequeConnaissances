package com.diplomado.bibliotheque.connaissances.modelo;

import com.diplomado.bibliotheque.connaissances.enums.EnumBoolean;
import com.diplomado.bibliotheque.connaissances.enums.EnumGenero;
import java.util.Date;

public class Persona {
    
    private int id;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String Apellido;
    private Date fechaNacimiento;
    private EnumGenero genero;
    private EnumBoolean estado;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tipoDocumento
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the numeroDocumento
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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
     * @return the genero
     */
    public EnumGenero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    /**
     * @return the estado
     */
    public EnumBoolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EnumBoolean estado) {
        this.estado = estado;
    }
    
}
