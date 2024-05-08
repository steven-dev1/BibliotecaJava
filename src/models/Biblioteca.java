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
//    private List<Prestamo> prestamos;

    public Biblioteca(List<Libro> libros, List<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
}
