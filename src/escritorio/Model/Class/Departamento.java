package escritorio.Model.Class;

public class Departamento {
    private int idDepartamento;
    private String nombreDepartamento;
    private int idEmpleado;

    // Constructor
    public Departamento() {}

    public Departamento(int idDepartamento, String nombreDepartamento, int idEmpleado) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.idEmpleado = idEmpleado;
    }

    // Getters y Setters
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
