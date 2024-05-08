/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.List;
/**
 *
 * @author User
 */
public class Usuario {
    private String nombre;
    private String identificacion;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String identificacion, List<Libro> librosPrestados) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.librosPrestados = librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
    
}
