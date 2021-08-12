package com.diplomado.bibliotheque.connaissances.modelo;
import java.util.Date;
public class Libro {
    
    private int id;
    private String Codigo;
    private String nombre;
    private String editorial;
    private int categoria;
    private int autor;
    private int cantidad;
    private Date fechaPublicacion;

    public Libro(int id, String Codigo, String nombre, String editorial, int categoria, int autor, int cantidad, Date fechaPublicacion) {
        this.id = id;
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.editorial = editorial;
        this.categoria = categoria;
        this.autor = autor;
        this.cantidad = cantidad;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
}
