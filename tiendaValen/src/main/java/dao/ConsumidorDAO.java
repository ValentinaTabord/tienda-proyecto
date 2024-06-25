/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.ConexionBD;
import model.Consumidor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsumidorDAO {
    private Connection conexion;
    private ConexionBD conexionBD;

    public ConsumidorDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    }

    public void crearConsumidor(Consumidor consumidor) {
        String sql = "INSERT INTO Consumidores (nombre) VALUES (?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, consumidor.getNombre());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<Consumidor> leerConsumidor() {
        List<Consumidor> consumidores = new ArrayList<>();
        String sql = "SELECT * FROM consumidores";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                Consumidor consumidor = new Consumidor(id, nombre);
                consumidores.add(consumidor);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return consumidores;
    }

    public void actualizarConsumidor(Consumidor consumidor) {
        String sql = "UPDATE consumidores SET nombre = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, consumidor.getNombre());
            statement.setInt(2, consumidor.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarConsumidor(int id) {
        String sql = "DELETE FROM consumidores WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }
    
    public int verificConsumidores(int id) {
                String sql = "SELECT COUNT(*) AS cuenta FROM consumidores c WHERE c.id =?";
                int resultado = 0;
        try (PreparedStatement statement = conexion.prepareStatement(sql)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                resultado = resultSet.getInt("cuenta");
            }
        } catch (SQLException e) {
                System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return resultado;
        }

    public void cerrarConexion() {
        conexionBD.closeConexion(conexion);
    }
}