package escritorio.Model.Class;

public class EstadoRequerimiento {
    private int idEstadoRequerimiento;
    private String nombreRequerimiento;
    private String descripcionDeEstadoRequerimiento;

    // Constructor
    public EstadoRequerimiento() {}

    public EstadoRequerimiento(int idEstadoRequerimiento, String nombreRequerimiento, String descripcionDeEstadoRequerimiento) {
        this.idEstadoRequerimiento = idEstadoRequerimiento;
        this.nombreRequerimiento = nombreRequerimiento;
        this.descripcionDeEstadoRequerimiento = descripcionDeEstadoRequerimiento;
    }

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
