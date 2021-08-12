package com.diplomado.bibliotheque.connaissances.modelo;

import java.util.Date;

public class Prestamo {
    
    private int id;
    private int libro;
    private int afiliado;
    private Date fechaEntrega;
    private boolean entregado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibro() {
        return libro;
    }

    public void setLibro(int libro) {
        this.libro = libro;
    }

    public int getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(int afiliado) {
        this.afiliado = afiliado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    
}
