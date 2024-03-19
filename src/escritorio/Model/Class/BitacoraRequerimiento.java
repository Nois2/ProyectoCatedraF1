package escritorio.Model.Class;

import java.util.Date;

public class BitacoraRequerimiento {
    private int idBitacoraRequerimiento;
    private String descripcionDeAvanceEnRequerimiento;
    private int porcentajeDeAvanceRealizadoEnBitacora;
    private Date fechaActualizacionRequerimiento;
    private int idEstadoBitacora;
    private int idCasoRequerimiento;

    // Constructor
    public BitacoraRequerimiento() {}

    public BitacoraRequerimiento(int idBitacoraRequerimiento, String descripcionDeAvanceEnRequerimiento, int porcentajeDeAvanceRealizadoEnBitacora, Date fechaActualizacionRequerimiento, int idEstadoBitacora, int idCasoRequerimiento) {
        this.idBitacoraRequerimiento = idBitacoraRequerimiento;
        this.descripcionDeAvanceEnRequerimiento = descripcionDeAvanceEnRequerimiento;
        this.porcentajeDeAvanceRealizadoEnBitacora = porcentajeDeAvanceRealizadoEnBitacora;
        this.fechaActualizacionRequerimiento = fechaActualizacionRequerimiento;
        this.idEstadoBitacora = idEstadoBitacora;
        this.idCasoRequerimiento = idCasoRequerimiento;
    }

    // Getters y Setters
    public int getIdBitacoraRequerimiento() {
        return idBitacoraRequerimiento;
    }

    public void setIdBitacoraRequerimiento(int idBitacoraRequerimiento) {
        this.idBitacoraRequerimiento = idBitacoraRequerimiento;
    }

    public String getDescripcionDeAvanceEnRequerimiento() {
        return descripcionDeAvanceEnRequerimiento;
    }

    public void setDescripcionDeAvanceEnRequerimiento(String descripcionDeAvanceEnRequerimiento) {
        this.descripcionDeAvanceEnRequerimiento = descripcionDeAvanceEnRequerimiento;
    }

    public int getPorcentajeDeAvanceRealizadoEnBitacora() {
        return porcentajeDeAvanceRealizadoEnBitacora;
    }

    public void setPorcentajeDeAvanceRealizadoEnBitacora(int porcentajeDeAvanceRealizadoEnBitacora) {
        this.porcentajeDeAvanceRealizadoEnBitacora = porcentajeDeAvanceRealizadoEnBitacora;
    }

    public Date getFechaActualizacionRequerimiento() {
        return fechaActualizacionRequerimiento;
    }

    public void setFechaActualizacionRequerimiento(Date fechaActualizacionRequerimiento) {
        this.fechaActualizacionRequerimiento = fechaActualizacionRequerimiento;
    }

    public int getIdEstadoBitacora() {
        return idEstadoBitacora;
    }

    public void setIdEstadoBitacora(int idEstadoBitacora) {
        this.idEstadoBitacora = idEstadoBitacora;
    }

    public int getIdCasoRequerimiento() {
        return idCasoRequerimiento;
    }

    public void setIdCasoRequerimiento(int idCasoRequerimiento) {
        this.idCasoRequerimiento = idCasoRequerimiento;
    }
}
