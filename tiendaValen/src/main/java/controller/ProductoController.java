/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import views.ProductoView;
import dao.ProductoDAO;
import model.Producto;
import views.ProductoView;
import java.util.List;
import java.util.Scanner;

public class ProductoController {
    private ProductoDAO productoDAO;
    private Scanner scanner;

    public ProductoController() {
        productoDAO = new ProductoDAO();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Productos ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Leer productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    leerProductos();
                    break;
                case 3:
                    actualizarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
    }

    private void crearProducto() {
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        float precio = scanner.nextFloat();
        System.out.print("\nIngrese el ID de la categoria que desea actualizar: ");
        int categoria_id = scanner.nextInt();
        Producto producto = new Producto(0, nombre, precio,categoria_id);
        productoDAO.crearProducto(producto);
        ProductoView.mostrarMensaje("Producto creado exitosamente.");
    }

    private void leerProductos() {
        List<Producto> productos = productoDAO.leerProductos();
        ProductoView.mostrarProductos(productos);
    }

    private void actualizarProducto() {
        leerProductos();
        System.out.print("\nIngrese el ID del producto que desea actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese el nuevo nombre del producto: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo precio del producto: ");
        float nuevoPrecio = scanner.nextFloat();
        System.out.print("\nIngrese el ID de la categoria al que desea añadir el producto: ");
        int categoria_id = scanner.nextInt();
        Producto producto = new Producto(id, nuevoNombre, nuevoPrecio, categoria_id);
        productoDAO.actualizarProducto(producto);
        ProductoView.mostrarMensaje("Producto actualizado exitosamente.");
    }

    private void eliminarProducto() {
        leerProductos();
        System.out.print("\nIngrese el ID del producto que desea eliminar: ");
        int id = scanner.nextInt();
        productoDAO.eliminarProducto(id);
        ProductoView.mostrarMensaje("Producto eliminado exitosamente.");
    }
}
