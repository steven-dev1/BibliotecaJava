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
public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;
    
    public void agregarLibro(Libro libro) {
    libros.add(libro);
        System.out.println("Libro agregado a la biblioteca: " + libro.getTitulo());
    }
}
