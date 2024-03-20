package escritorio.View.JFRAME;
import escritorio.Controller.LoginController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JButton button1;
    private JButton btnIniciarSesion;
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JPanel pnlPrincipal;
    private JLabel lblTitulo;

    public Login(){
        super.setTitle("Bienvenido al sistema");
        this.setContentPane(pnlPrincipal);
        this.setSize(500,300);
        this.setVisible(true);
        LoginController controlador = new LoginController();
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean respuesta = controlador.login(txtEmail.getText(), new String(txtPassword.getPassword()));
                if(respuesta){
                    JOptionPane.showMessageDialog(null,"Iniciaste Sesion");
                }
                else {
                    JOptionPane.showMessageDialog(null,"ERROR");

                }

            }
        });
    }
}
