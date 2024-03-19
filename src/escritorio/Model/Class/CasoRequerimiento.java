package escritorio.Model.Class;

public class CasoRequerimiento {
    private int idCasoRequerimiento;
    private String tituloCasoRequerimiento;
    private int porcentajeAvance;
    private int idEstadoRequerimiento;
    private int idEmpleado;
    private int idProyecto;

    // Constructor
    public CasoRequerimiento(int idCasoRequerimiento, String tituloCasoRequerimiento, int porcentajeAvance,
                             int idEstadoRequerimiento, int idEmpleado, int idProyecto) {
        this.idCasoRequerimiento = idCasoRequerimiento;
        this.tituloCasoRequerimiento = tituloCasoRequerimiento;
        this.porcentajeAvance = porcentajeAvance;
        this.idEstadoRequerimiento = idEstadoRequerimiento;
        this.idEmpleado = idEmpleado;
        this.idProyecto = idProyecto;
    }

    // Getters and setters
    public int getIdCasoRequerimiento() {
        return idCasoRequerimiento;
    }

    public void setIdCasoRequerimiento(int idCasoRequerimiento) {
        this.idCasoRequerimiento = idCasoRequerimiento;
    }

    public String getTituloCasoRequerimiento() {
        return tituloCasoRequerimiento;
    }

    public void setTituloCasoRequerimiento(String tituloCasoRequerimiento) {
        this.tituloCasoRequerimiento = tituloCasoRequerimiento;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public int getIdEstadoRequerimiento() {
        return idEstadoRequerimiento;
    }

    public void setIdEstadoRequerimiento(int idEstadoRequerimiento) {
        this.idEstadoRequerimiento = idEstadoRequerimiento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
}
