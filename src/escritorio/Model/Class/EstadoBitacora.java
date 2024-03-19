package escritorio.Model.Class;

public class EstadoBitacora {
    private int idEstadoBitacora;
    private String nombreEstadoBitacora;
    private String descripcionEstadoBitacora;

    // Constructor
    public EstadoBitacora() {}

    public EstadoBitacora(int idEstadoBitacora, String nombreEstadoBitacora, String descripcionEstadoBitacora) {
        this.idEstadoBitacora = idEstadoBitacora;
        this.nombreEstadoBitacora = nombreEstadoBitacora;
        this.descripcionEstadoBitacora = descripcionEstadoBitacora;
    }

    // Getters y Setters
    public int getIdEstadoBitacora() {
        return idEstadoBitacora;
    }

    public void setIdEstadoBitacora(int idEstadoBitacora) {
        this.idEstadoBitacora = idEstadoBitacora;
    }

    public String getNombreEstadoBitacora() {
        return nombreEstadoBitacora;
    }

    public void setNombreEstadoBitacora(String nombreEstadoBitacora) {
        this.nombreEstadoBitacora = nombreEstadoBitacora;
    }

    public String getDescripcionEstadoBitacora() {
        return descripcionEstadoBitacora;
    }

    public void setDescripcionEstadoBitacora(String descripcionEstadoBitacora) {
        this.descripcionEstadoBitacora = descripcionEstadoBitacora;
    }
}
