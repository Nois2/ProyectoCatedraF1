package escritorio.Controller;
import escritorio.Model.Class.Empleado;
import escritorio.Model.ConexionToDB;
import escritorio.Model.Sesion;

import java.sql.*;


public class LoginController {
    public boolean login(String email, String password) {
        ConexionToDB cn = new ConexionToDB();
        String consulta = "SELECT * FROM Empleados WHERE mail = '" + email + "' AND passwd = '" + password + "'";
        ResultSet rs = cn.EjecutarConsultas(consulta);

        try {
            if (rs != null && rs.next()) {
                Empleado emp = new Empleado(
                        rs.getInt("PK_idEmpleado"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("mail"),
                        rs.getString("passwd"),
                        rs.getInt("FK_empleadoEncargado"),
                        rs.getInt("FK_idNivelDeAcceso")
                );
                Sesion.SESION = emp;
                return true;
            } else {
                // Usuario no encontrado o contraseña incorrecta
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            return false;
        } finally {
            // Asegúrate de cerrar la conexión y liberar recursos
            cn.cerrarConexion();
        }
    }


}
