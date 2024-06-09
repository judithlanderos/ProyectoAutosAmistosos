package Controlador;

import conexionBD.ConexionBD;
import modelo.Automovil;

import java.sql.*;
import java.util.ArrayList;

public class AutomovilDAO {
     ConexionBD conexionBD = ConexionBD.getConexionInstancia();

    public void agregarAutomovil(String idAutomovil, String modelo, double precioLista, String fechaFabricacion, String placa, String idCliente, String idMarca) {
        int cantidadAutomoviles = contarAutomovilesPorId(idAutomovil);
        if (cantidadAutomoviles > 0) {
            System.out.println("El ID del automóvil ya está en uso. Por favor, elija un ID diferente.");
            return;
        }
        try {
            String sql = "INSERT INTO automovil (modelo, precio_lista, fecha_fabricacion, placa, Cliente_idCliente, Marca_idMarca) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexionBD.getConexion().prepareStatement(sql);
            statement.setString(1, modelo);
            statement.setDouble(2, precioLista);
            statement.setString(3, fechaFabricacion);
            statement.setString(4, placa);
            statement.setString(5, idCliente);
            statement.setString(6, idMarca);
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Automóvil agregado correctamente.");
            } else {
                System.out.println("Error al agregar el automóvil.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int contarAutomovilesPorId(String idAutomovil) {

        int cantidad = 0;
        try {
            String sql = "SELECT COUNT(*) FROM automovil WHERE idAutomovil = ?";
            PreparedStatement statement = conexionBD.getConexion().prepareStatement(sql);
            statement.setString(1, idAutomovil);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                cantidad = resultSet.getInt(1);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cantidad;
    }
    public void eliminarAutomovil(String placa) {
        try {
            String sql = "DELETE FROM automovil WHERE placa = ?";
            PreparedStatement statement = conexionBD.getConexion().prepareStatement(sql);
            statement.setString(1, placa);
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Automóvil eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún automóvil con la placa especificada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarAutomovil(String placa, String nuevoModelo, double nuevoPrecioLista) {
        try {
            String sql = "UPDATE automovil SET modelo = ?, precio_lista = ? WHERE placa = ?";
            PreparedStatement statement = conexionBD.getConexion().prepareStatement(sql);
            statement.setString(1, nuevoModelo);
            statement.setDouble(2, nuevoPrecioLista);
            statement.setString(3, placa);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Automóvil actualizado correctamente.");
            } else {
                System.out.println("No se encontró ningún automóvil con la placa especificada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Automovil> consultarAutomoviles() {
        ArrayList<Automovil> listaAutomoviles = new ArrayList<>();
        try {
            Statement statement = conexionBD.getConexion().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM automovil");

            while (resultSet.next()) {
                String idAutomovil = resultSet.getString("idAutomovil");
                String modelo = resultSet.getString("modelo");
                double precioLista = resultSet.getDouble("precio_lista");
                String fechaFabricacion = resultSet.getString("fecha_fabricacion");
                String placa = resultSet.getString("placa");
                String clienteId = resultSet.getString("Cliente_idCliente");
                String marcaId = resultSet.getString("Marca_idMarca");

                Automovil automovil = new Automovil(idAutomovil, modelo, precioLista, fechaFabricacion, clienteId, placa, marcaId);
                listaAutomoviles.add(automovil);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAutomoviles;
    }

}
