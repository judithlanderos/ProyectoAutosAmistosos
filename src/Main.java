import Controlador.AutomovilDAO;
import conexionBD.ConexionBD;
import vista.VentanaLogin;

import javax.swing.*;

public class Main {

    ConexionBD conexion = ConexionBD.getConexionInstancia();
    AutomovilDAO automovilDAO= new AutomovilDAO();

    VentanaLogin ventanaLogin = new VentanaLogin();


    public static void main(String[] args) {

    }
}
