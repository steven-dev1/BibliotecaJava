/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author User
 */
public class Prestamo {
    private String id_prestamo;
    private String usuario_fk;
    private String libro_fk;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String prestamod_estado;

    public Prestamo(String id_prestamo, String usuario_fk, String libro_fk, String fechaPrestamo, String fechaDevolucion, String prestamod_estado) {
        this.id_prestamo = id_prestamo;
        this.usuario_fk = usuario_fk;
        this.libro_fk = libro_fk;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.prestamod_estado = prestamod_estado;
    }

    public String getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(String id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public String getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(String usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public String getLibro_fk() {
        return libro_fk;
    }

    public void setLibro_fk(String libro_fk) {
        this.libro_fk = libro_fk;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPrestamod_estado() {
        return prestamod_estado;
    }

    public void setPrestamod_estado(String prestamod_estado) {
        this.prestamod_estado = prestamod_estado;
    }

    
    
    
}
