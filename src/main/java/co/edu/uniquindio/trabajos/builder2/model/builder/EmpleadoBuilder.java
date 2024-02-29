package co.edu.uniquindio.trabajos.builder2.model.builder;

import co.edu.uniquindio.trabajos.builder2.model.Contacto;
import co.edu.uniquindio.trabajos.builder2.model.Direccion;
import co.edu.uniquindio.trabajos.builder2.model.Empleado;
import co.edu.uniquindio.trabajos.builder2.model.Telefono;
import co.edu.uniquindio.trabajos.builder2.model.enums.TipoGenero;
import co.edu.uniquindio.trabajos.builder2.services.IBuilder;

import java.util.Collection;
import java.util.LinkedList;

public class EmpleadoBuilder implements IBuilder<Empleado> {
    private int edad;
    private String nombre;
    private TipoGenero tipoGenero;
    private Direccion direccion;
    private Telefono telefono;
    private Collection<Contacto> listaContactos = new LinkedList<>();

    public EmpleadoBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public EmpleadoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilder setTipoGenero(TipoGenero tipoGenero) {
        this.tipoGenero = tipoGenero;
        return this;
    }

    public EmpleadoBuilder setDireccion(Direccion direccion) {
        this.direccion = direccion;
        return this;
    }

    public EmpleadoBuilder setTelefono(Telefono telefono) {
        this.telefono = telefono;
        return this;
    }

    public EmpleadoBuilder setListaContactos(Contacto contacto) {
        this.listaContactos.add(contacto);
        return this;
    }

    public EmpleadoBuilder setListaContactos(Collection<Contacto> listaContactos) {
        this.listaContactos.addAll(listaContactos);
        return this;
    }

    @Override
    public Empleado build() {
        return new Empleado(edad, nombre, tipoGenero, direccion, telefono, listaContactos);
    }
}
