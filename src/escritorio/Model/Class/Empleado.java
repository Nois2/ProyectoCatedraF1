package escritorio.Model.Class;

public class Empleado {
    private int idEmpleado;
    private String nombres;
    private String apellidos;
    private String mail;
    private String passwd;
    private int empleadoEncargado;
    private int idNivelDeAcceso;

    // Constructor
    public Empleado() {}

    public Empleado(int idEmpleado, String nombres, String apellidos, String mail, String passwd, int empleadoEncargado, int idNivelDeAcceso) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mail = mail;
        this.passwd = passwd;
        this.empleadoEncargado = empleadoEncargado;
        this.idNivelDeAcceso = idNivelDeAcceso;
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getEmpleadoEncargado() {
        return empleadoEncargado;
    }

    public void setEmpleadoEncargado(int empleadoEncargado) {
        this.empleadoEncargado = empleadoEncargado;
    }

    public int getIdNivelDeAcceso() {
        return idNivelDeAcceso;
    }

    public void setIdNivelDeAcceso(int idNivelDeAcceso) {
        this.idNivelDeAcceso = idNivelDeAcceso;
    }
}
