package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaLogin extends JFrame {
    private JPanel panelLogin;
    private JTextField txtusuario;
    private JPasswordField password;
    private JLabel lblUsuario, lblTitulo;
    private JLabel lblpassword;


    public VentanaLogin(){
        setTitle("VENTANA LOGIN");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelLogin = new JPanel();
        panelLogin.setLayout(null);
        setLayout(new BorderLayout());
        add(panelLogin);

        lblTitulo = new JLabel("INICIO SESION");
        lblTitulo.setBounds(100,20,100,25);
        panelLogin.add(lblTitulo);

        lblUsuario = new JLabel("USUARIO");
        lblUsuario.setBounds(50, 50, 80, 25);
        panelLogin.add(lblUsuario);
        txtusuario = new JTextField(20);
        txtusuario.setBounds(140, 50, 100, 25);
        panelLogin.add(txtusuario);

        lblpassword = new JLabel("CONTRASEÑA");
        lblpassword.setBounds(50, 90, 80, 25);
        panelLogin.add(lblpassword);
        password = new JPasswordField(20);
        password.setBounds(140, 90, 100, 25);
        panelLogin.add(password);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }
}
