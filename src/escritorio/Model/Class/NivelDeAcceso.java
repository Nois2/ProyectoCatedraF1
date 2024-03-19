package escritorio.Model.Class;

public class NivelDeAcceso {
    private int idNivelDeAcceso;
    private String nombreNivelDeAcceso;
    private String funcionalidadDeNivelDeAcceso;


    // Constructor
    public NivelDeAcceso() {}
    public NivelDeAcceso(int idNivelDeAcceso, String nombreNivelDeAcceso, String funcionalidadDeNivelDeAcceso) {
        this.idNivelDeAcceso = idNivelDeAcceso;
        this.nombreNivelDeAcceso = nombreNivelDeAcceso;
        this.funcionalidadDeNivelDeAcceso = funcionalidadDeNivelDeAcceso;
    }

    // Getters y Setters
    public int getIdNivelDeAcceso() {
        return idNivelDeAcceso;
    }

    public void setIdNivelDeAcceso(int idNivelDeAcceso) {
        this.idNivelDeAcceso = idNivelDeAcceso;
    }

    public String getNombreNivelDeAcceso() {
        return nombreNivelDeAcceso;
    }

    public void setNombreNivelDeAcceso(String nombreNivelDeAcceso) {
        this.nombreNivelDeAcceso = nombreNivelDeAcceso;
    }

    public String getFuncionalidadDeNivelDeAcceso() {
        return funcionalidadDeNivelDeAcceso;
    }

    public void setFuncionalidadDeNivelDeAcceso(String funcionalidadDeNivelDeAcceso) {
        this.funcionalidadDeNivelDeAcceso = funcionalidadDeNivelDeAcceso;
    }
}
