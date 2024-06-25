/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tiendavalen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import controller.CategoriaController;
import controller.ProductoController;
import controller.ConsumidorController;
import controller.ProveedorController;
import javax.swing.JFrame;
import views.FormularioCategoria;

public class TiendaValen {

    public static void main(String[] args) {
        
        FormularioCategoria formulariocategoria = new FormularioCategoria ();
        formulariocategoria.setVisible (true);
        JFrame frame = new JFrame ("Tienda Valen");
        frame.getContentPane().add(formulariocategoria);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }
}


