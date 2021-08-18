package com.diplomado.bibliotheque.connaissances.modelo;

import com.diplomado.bibliotheque.connaissances.enums.EnumRol;
import java.util.Date;

public class Usuario {

    private int id;
    private String usuario;
    private String contrasena;
    private String correo;
    private Date fechaModificacionClave;
    private EnumRol rol;

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario() {
        //Constructor vacio
    }

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
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the fechaModificacionClave
     */
    public Date getFechaModificacionClave() {
        return fechaModificacionClave;
    }

    /**
     * @param fechaModificacionClave the fechaModificacionClave to set
     */
    public void setFechaModificacionClave(Date fechaModificacionClave) {
        this.fechaModificacionClave = fechaModificacionClave;
    }

    /**
     * @return the rol
     */
    public EnumRol getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(EnumRol rol) {
        this.rol = rol;
    }

}
