package Controlador;

import conexionBD.ConexionBD;

import java.sql.*;
import java.util.Scanner;

public class AutomovilDAO {
     ConexionBD conexion = new ConexionBD();

        public void agregarAutomovil () {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el modelo:");
                String modelo = scanner.nextLine();
                System.out.println("Ingrese el precio de lista:");
                double precioLista = scanner.nextDouble();
                System.out.println("Ingrese la fecha de fabricación (AAAA-MM-DD):");
                String fechaFabricacion = scanner.next();
                System.out.println("Ingrese la placa:");
                String placa = scanner.next();
                System.out.println("Ingrese el ID del cliente:");
                String idCliente = scanner.next();
                System.out.println("Ingrese el ID de la marca:");
                String idMarca = scanner.next();

                String sql = "INSERT INTO automovil (modelo, precio_lista, fecha_fabricacion, placa, Cliente_idCliente, Marca_idMarca) " +
                        "VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conexion.getConexion().prepareStatement(sql);
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

        public void eliminarAutomovil () {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese la placa del automóvil que desea eliminar:");
                String placa = scanner.next();

                String sql = "DELETE FROM automovil WHERE placa = ?";
                PreparedStatement statement = conexion.getConexion().prepareStatement(sql);
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

        public void actualizarAutomovil () {

        }

        public void consultarAutomoviles () {
            try {
                Statement statement = conexion.getConexion().createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM automovil");

                while (resultSet.next()) {
                    System.out.println("Modelo: " + resultSet.getString("modelo"));
                    System.out.println("Precio de lista: " + resultSet.getDouble("precio_lista"));
                    System.out.println("Fecha de fabricación: " + resultSet.getDate("fecha_fabricacion"));
                    System.out.println("Placa: " + resultSet.getString("placa"));
                    System.out.println("ID del cliente: " + resultSet.getString("Cliente_idCliente"));
                    System.out.println("ID de la marca: " + resultSet.getString("Marca_idMarca"));
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
