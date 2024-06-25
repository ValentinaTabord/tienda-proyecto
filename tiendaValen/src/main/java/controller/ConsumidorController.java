/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConsumidorDAO;
import model.Consumidor;
import views.ConsumidorView;
import java.util.List;
import java.util.Scanner;


public class ConsumidorController {
    
    private ConsumidorDAO consumidorDAO;
    private Scanner scanner;

    public ConsumidorController() {
        consumidorDAO = new ConsumidorDAO();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de consumidor ---");
            System.out.println("1. Crear consumidor");
            System.out.println("2. Ver consumidores");
            System.out.println("3. Actualizar consumidores");
            System.out.println("4. Eliminar consumidor");
            System.out.println("5. Verificar consumidor");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    crearConsumidor();
                    break;
                case 2:
                    leerConsumidores();
                    break;
                case 3:
                    actualizarConsumidor();
                    break;
                case 4:
                    eliminarConsumidor();
                    break;
                case 5:
                    verificConsumidores();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
    }

    private void crearConsumidor() {
        System.out.print("Ingrese el nombre del consumidor: ");
        String nombre = scanner.nextLine();
        Consumidor consumidor = new Consumidor(0, nombre);
        consumidorDAO.crearConsumidor(consumidor);
        ConsumidorView.mostrarMensaje("Cosnumidor creado exitosamente.");
    }

    private void leerConsumidores() {
        List<Consumidor> consumidores = consumidorDAO.leerConsumidor();
        ConsumidorView.mostrarConsumidores(consumidores);
    }

    private void actualizarConsumidor() {
        leerConsumidores();
        System.out.print("\nIngrese el ID del consumidor que desea actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre del consumidor: ");
        String nuevoNombre = scanner.nextLine();
        Consumidor consumidor = new Consumidor (id, nuevoNombre);
        consumidorDAO.actualizarConsumidor(consumidor);
        ConsumidorView.mostrarMensaje("Consumidor actualizado exitosamente.");
    }

    private void eliminarConsumidor() {
        leerConsumidores();
        System.out.print("\nIngrese el ID del cosnumidor que desea eliminar: ");
        int id = scanner.nextInt();
        consumidorDAO.eliminarConsumidor(id);
        ConsumidorView.mostrarMensaje("consumidor eliminado exitosamente.");
    }
    
    private void verificConsumidores() {
        leerConsumidores();
        System.out.print("\nIngrese el ID del consumidor que desea verificar: ");
        int id = scanner.nextInt();
        int resp = consumidorDAO.verificConsumidores(id);
        if (resp == 1) {
            ConsumidorView.mostrarMensaje("Consumidor verificado exitosamente.");
        } else {

            ConsumidorView.mostrarMensaje("Consumidor no existe");
        }
    }    
    
}