package escritorio.View.JFRAME.parrafo1;

import escritorio.Controller.P1Controller;
import escritorio.Model.Sesion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreaUnProyecto extends JFrame{
    private JTextField txtDescripcionProyecto;
    private JTextField txtNombreProyecto;
    private JTextField txtURLpdf;
    private JButton btnAtras;
    private JButton btnCrearProyecto;
    private JPanel pnlCrearSistema;

    public CreaUnProyecto(){
        super.setTitle("Bienvenido al sistema");
        this.setSize(800,500);
        this.setContentPane(pnlCrearSistema);
        this.setVisible(true);
        P1Controller p = new P1Controller();
        btnCrearProyecto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto
                String valorTxt1 = txtNombreProyecto.getText();
                String valorTxt2 = txtDescripcionProyecto.getText();
                String valorTxt3 = txtURLpdf.getText();

                // Validar que los campos no estén vacíos
                if (!valorTxt1.isEmpty() && !valorTxt2.isEmpty() && !valorTxt3.isEmpty()) {
                    String mensaje = p.sp_JefeDeAreaFuncional_CrearNuevoSistema(Sesion.SESION.getIdEmpleado(), valorTxt1, valorTxt3, valorTxt2);
                    System.out.println(Sesion.SESION.getIdEmpleado());
                    if ("Proyecto creado correctamente.".equals(mensaje)) {
                        // Mostrar mensaje con JOptionPane
                        JOptionPane.showMessageDialog(null, "Datos enviados correctamente:\n" +
                                "Nombre del Proyecto: " + valorTxt1 + "\n" +
                                "Descripción del proyecto: " + valorTxt2 + "\n" +
                                "URL PDF: " + valorTxt3);
                    } else {
                        // Mostrar mensaje de error si hay un error en el procedimiento almacenado
                        JOptionPane.showMessageDialog(null, mensaje + "USTED NO ES JEFE DE AREA DE AREA FUNCIONAL", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    // Mostrar mensaje de error si algún campo está vacío
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
