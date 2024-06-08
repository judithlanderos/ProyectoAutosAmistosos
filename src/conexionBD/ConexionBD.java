package conexionBD;

import java.sql.*;

public class ConexionBD {
    private Connection conexion;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    //private Statement statement;
    /* NOTA: Es preferible utilizar PreparedStatement para evitar
         SQL INJECTION
     */
    private static ConexionBD conexionInstancia;

    public Connection getConexion() {
        return conexion;
    }

    private ConexionBD(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/autosamistosos"; //direccion de a que se conecta a mysql
            conexion = DriverManager.getConnection(URL,  "root",  "judilth@3");
            System.out.println("Yeeeeiiiii ya casi soy ISC");
        }catch(ClassNotFoundException e){
            // throw new RuntimeException(e);
            System.out.println("Error en el DRIVER");
        } catch (SQLException e) {
            System.out.println("Error en la URL");
        }

    }

    public static ConexionBD getConexionInstancia(){
        if(conexionInstancia == null){

        }

    }

    //Metodos para operaciones ABCC (ALTAS, BAJAS, CAMBIOS, CONSULTAS )
    //(DataManipulation Languaje)
    public boolean ejecutarInstruccionDML(String instruccionSQL) throws SQLException {
        try {
            preparedStatement = conexion.prepareStatement(instruccionSQL);
            return preparedStatement.executeUpdate() >= 1;
        } finally {
            cerrarRecursos();
        }
    }

    //metodo para consultas
    public ResultSet ejecutarConsultaSQL(String instruccionSQL) throws SQLException {
        try {
            preparedStatement = conexion.prepareStatement(instruccionSQL);
            resultSet = preparedStatement.executeQuery();
            return resultSet;
        } finally {

        }
    }
    private void cerrarRecursos() {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar los recursos de la base de datos");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConexionBD conexionBD = ConexionBD.getConexionInstancia();

    }
}//class
