package escritorio.Controller;

import escritorio.Model.ConexionToDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class P1Controller {
    public P1Controller(){

    }
    public String sp_JefeDeAreaFuncional_CrearNuevoSistema(int idEmpleado, String NombreProyecto, String RutaDelDocumentoGuardado, String DescripcionDelProyecto) {
        String mensaje = "";

        ConexionToDB cn = new ConexionToDB();

        try {
            // Construyendo la consulta SQL con los parámetros proporcionados
            String consulta = "CALL sp_JefeDeAreaFuncional_CrearNuevoSistema(" + idEmpleado + ", '" + NombreProyecto + "', '" + RutaDelDocumentoGuardado + "', '" + DescripcionDelProyecto + "', @mensaje)";

            // Ejecutar la consulta y obtener el resultado
            ResultSet rs = cn.EjecutarConsultas(consulta);
            ResultSet rPro = cn.EjecutarConsultas("SELECT @mensaje");


            // Obtener el mensaje de salida del procedimiento almacenado
            if (rPro != null && rPro.next()) {
                mensaje = rPro.getString(1);
            }

            // Cerrar la conexión
            cn.cerrarConexion();

            return mensaje;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            cn.cerrarConexion();
            return "mensaje";

        } finally {
            cn.cerrarConexion();
        }
    }

    /*
    CALL sp_JefeDeAreaFuncional_CrearNuevoSistema(2, 'Nuevo Proyecto', 'ruta_documento.pdf', 'Descripción del proyecto', @mensaje);
    SELECT @mensaje;

     */

    public static void main(String[] args){
        P1Controller p = new P1Controller();
        System.out.println(p.sp_JefeDeAreaFuncional_CrearNuevoSistema(2,"Juan","www.google.com","Fase 1"));

    }
}
