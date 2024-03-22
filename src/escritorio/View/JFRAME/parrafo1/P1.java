package escritorio.View.JFRAME.parrafo1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1 extends JFrame {
    private JButton agregarFuncionalidadButton;
    private JButton corregirDatosButton;
    private JButton btnCrearProyecto;
    private JPanel pnlInicial;

    public P1(){
        super.setTitle("Bienvenido al sistema");
        this.setContentPane(pnlInicial);
        this.setSize(800,500);
        this.setVisible(true);

        btnCrearProyecto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreaUnProyecto CreaProyecto = new CreaUnProyecto();
                P1.this.setVisible(false);
                CreaProyecto.setVisible(true);

            }
        });
    }
}
