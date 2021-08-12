package com.diplomado.bibliotheque.connaissances.modelo;

import java.util.Date;

public class Afiliado extends Persona{
    
    private Usuario usuario;
    
    private Date fechaAfiliacion;

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the fechaAfiliacion
     */
    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    /**
     * @param fechaAfiliacion the fechaAfiliacion to set
     */
    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }
    
}
