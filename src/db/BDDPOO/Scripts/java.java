package db.BDDPOO.Scripts;

public class Proyecto {

    private int idEstadoRequerimiento;
    private String nombreRequerimiento;
    private String descripcionDeEstadoRequerimiento;

    // Constructor
    public EstadoRequerimiento() {}

    // Getters y Setters
    public int getIdEstadoRequerimiento() {
        return idEstadoRequerimiento;
    }

    public void setIdEstadoRequerimiento(int idEstadoRequerimiento) {
        this.idEstadoRequerimiento = idEstadoRequerimiento;
    }

    public String getNombreRequerimiento() {
        return nombreRequerimiento;
    }

    public void setNombreRequerimiento(String nombreRequerimiento) {
        this.nombreRequerimiento = nombreRequerimiento;
    }

    public String getDescripcionDeEstadoRequerimiento() {
        return descripcionDeEstadoRequerimiento;
    }

    public void setDescripcionDeEstadoRequerimiento(String descripcionDeEstadoRequerimiento) {
        this.descripcionDeEstadoRequerimiento = descripcionDeEstadoRequerimiento;
    }
}
