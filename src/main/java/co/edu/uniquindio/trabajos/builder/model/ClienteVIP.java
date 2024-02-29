package co.edu.uniquindio.trabajos.builder.model;

public class ClienteVIP extends Cliente{
    private String dirrecion;
    private EstadoCivil estadoCivil;
    private String correo;

    public ClienteVIP(String nombre, String apellido, String cedula, int edad, double peso, double estatura, String dirrecion, EstadoCivil estadoCivil, String correo) {
        super(nombre, apellido, cedula, edad, peso, estatura);
        this.dirrecion = dirrecion;
        this.estadoCivil = estadoCivil;
        this.correo = correo;
    }

    public ClienteVIP() {
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
