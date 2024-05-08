/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Libro;
import models.modelLibros;
import views.Principal;

/**
 *
 * @author Aprendiz SENA
 */
public class controllerLibros implements ActionListener {

    private Principal mainView;

    public controllerLibros(Principal mainView) {
        this.mainView = mainView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(mainView.addLibButton)) {
            String titulo = mainView.tituloToAdd.getText();
            String autor = mainView.autorToAdd.getText();
            boolean estado = true;
            if (!titulo.trim().equals("") || !autor.trim().equals("")) {
                Libro libro = new Libro();
                libro.setTitulo(titulo);
                libro.setAutor(autor);
                libro.setAnioPublicacion(LocalDate.now().toString());
                libro.setEstado(estado);

                int response = modelLibros.addLibro(libro);
                if (response > 0) {
                    JOptionPane.showMessageDialog(mainView, "El libro se agrego correctamente");
                } else {
                    JOptionPane.showMessageDialog(mainView, "Error al registrar");
                }
            }

        } else if(e.getSource().equals(mainView.btnBuscar)){
            int method = mainView.sltAutorTitulo.getSelectedIndex();
            String parametro = mainView.inputBuscar.getText();
            
            List<Libro> lista = null;
            
            if (method == 1) {
                lista = modelLibros.findLibroxTitulo(parametro);
            } else {
                lista = modelLibros.findLibroxAutor(parametro);
            }
            
            if (lista == null){
                JOptionPane.showMessageDialog(mainView, "No hay libros disponibles.");
            } else {
                DefaultTableModel modelo = (DefaultTableModel) mainView.tablaLibros.getModel();
                
                modelo.setRowCount(0);
                
                for (Libro libro : lista){
                    Object[] row = new Object[] {
                        libro.getTitulo(),
                        libro.getAutor(),
                        libro.getAnioPublicacion(),
                        libro.isEstado(),
                        new JButton("Prestar")
                    };
                    if(row[3].equals("1")) {
                        row[3] = "Disponible";
                    } else {
                        row[3] = "No disponible";
                    }
                    
                    this.mainView.tablaLibros.setRowHeight(30);
                    modelo.addRow(row);
                }
            }
        } 
    }

}
