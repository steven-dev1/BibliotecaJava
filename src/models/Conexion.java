/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Steven Gonzalez
 */
public class Conexion {
    private Connection conexion;
    private String usuario = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost/biblioteca?serverTimezone=UTC";

    public Conexion() {
         try {
             conexion = DriverManager.getConnection(url, usuario, password);
         } catch(SQLException error) {
             System.out.println("Error en la conexion: "+error.getMessage());
         }
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    
    
}
