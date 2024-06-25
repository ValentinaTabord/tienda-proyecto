/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import config.ConexionBD;
import dao.CategoriaDAO;
import model.Categoria;
import views.CategoriaView;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CategoriaController {
    
    private CategoriaDAO categoriaDAO;
    private Scanner scanner;

    public CategoriaController() {
        categoriaDAO = new CategoriaDAO();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Categorías ---");
            System.out.println("1. Crear categoría");
            System.out.println("2. Leer categorías");
            System.out.println("3. Actualizar categoría");
            System.out.println("4. Eliminar categoría");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    //crearCategoria();
                    break;
                case 2:
                    //leerCategorias();
                    break;
                case 3:
                    //actualizarCategoria();
                    break;
                case 4:
                    //eliminarCategoria();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
    }


    public void crearCategoriaVista(String nombre) {
        Categoria categoria = new Categoria(0, nombre);
        categoriaDAO.crearCategoria(categoria);
        CategoriaView.mostrarMensaje("Categoría creada exitosamente.");
    }


    
    public List <Categoria> leerCategoriasVista() {
        List<Categoria> categorias = categoriaDAO.leerCategorias();
        return categorias;
    }
    
  
    
    public void actualizarCategoriaVista(int Id, String nuevoNombre) {
        leerCategoriasVista();
        int categoria_id = Id;
        String Nombre = nuevoNombre;
        Categoria categoria = new Categoria(categoria_id, nuevoNombre);
        categoriaDAO.actualizarCategoria(categoria);
    }
    
 
    
    public void eliminarCategoriaVista(int Id) {
        leerCategoriasVista();
        int categoria_id = Id;
        categoriaDAO.eliminarCategoria(categoria_id);
    }

}