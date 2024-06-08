import Controlador.AutomovilDAO;
import conexionBD.ConexionBD;
import vista.VentanaLogin;

public class Main {

    ConexionBD conexion = ConexionBD.getConexionInstancia();
    AutomovilDAO automovilDAO= new AutomovilDAO();

    VentanaLogin ventanaLogin = new VentanaLogin();


}
