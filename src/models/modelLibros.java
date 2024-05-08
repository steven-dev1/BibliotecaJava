/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz SENA
 */
public class modelLibros {

    public static Connection conexion() {
        Conexion o = new Conexion();
        Connection con = o.getConexion();
        return con;
    }

    public static int addLibro(Libro libro) {
        Connection con = conexion();
        String sql = "INSERT INTO libros (titulo, autor, anioPublicacion, estado) VALUES (?,?,?,?)";
        int response = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getAutor());
            st.setString(3, libro.getAnioPublicacion());
            st.setBoolean(4, libro.isEstado());
            
            response = st.executeUpdate();
        } catch (SQLException error) {
            System.out.println("No se pudo registrar el libro: "+error);
        }
        return response;
    }

    public static List<Libro> findLibroxTitulo(String titulo) {
        Connection con = conexion();
        List<Libro> listLibros = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT * FROM libros WHERE titulo = ?";
        int libros = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, titulo);
            rs = st.executeQuery();
            while (rs.next()) {
                Libro lib = new Libro();
                lib.setTitulo(rs.getString("titulo"));
                lib.setAutor(rs.getString("autor"));
                lib.setAnioPublicacion(rs.getString("anioPublicacion"));
                listLibros.add(lib);
                libros++;
            }
            
            if (libros == 0){
                listLibros = null;
            }
            
        } catch (SQLException ex) {
            System.out.println("No se encontraron los datos: " + ex);
        }

        return listLibros;
    }
    
    public static List<Libro> findLibroxAutor(String autor) {
        Connection con = conexion();
        List<Libro> listLibros = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT * FROM libros WHERE autor = ?";
        int libros = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, autor);
            rs = st.executeQuery();
            while (rs.next()) {
                Libro lib = new Libro();
                lib.setTitulo(rs.getString("titulo"));
                lib.setAutor(rs.getString("autor"));
                lib.setAnioPublicacion(rs.getString("anioPublicacion"));
                listLibros.add(lib);
                libros++;
            }
            
            if (libros == 0){
                listLibros = null;
            }
            
        } catch (SQLException ex) {
            System.out.println("No se encontraron los datos: " + ex);
        }

        return listLibros;
    }
}
