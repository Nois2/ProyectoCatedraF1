package escritorio.Model.Class;

public class Proyecto {

    private int idProyecto;
    private String nombreProyecto;
    private String URLRequerimientoDocumentoPDF;
    private int idEmpleado;

    // Constructor
    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombreProyecto, String URLRequerimientoDocumentoPDF, int idEmpleado) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.URLRequerimientoDocumentoPDF = URLRequerimientoDocumentoPDF;
        this.idEmpleado = idEmpleado;
    }

    // Getters y Setters
    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getURLRequerimientoDocumentoPDF() {
        return URLRequerimientoDocumentoPDF;
    }

    public void setURLRequerimientoDocumentoPDF(String URLRequerimientoDocumentoPDF) {
        this.URLRequerimientoDocumentoPDF = URLRequerimientoDocumentoPDF;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
