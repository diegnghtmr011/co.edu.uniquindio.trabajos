package co.edu.uniquindio.trabajos.builder2.model.builder;

import co.edu.uniquindio.trabajos.builder2.model.Contacto;
import co.edu.uniquindio.trabajos.builder2.model.Direccion;
import co.edu.uniquindio.trabajos.builder2.model.Telefono;
import co.edu.uniquindio.trabajos.builder2.services.IBuilder;

public class ContactoBuilder implements IBuilder<Contacto>{
    private String nombre;
    private Telefono telefono;
    private Direccion direccion;

    public ContactoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ContactoBuilder setTelefono(Telefono telefono) {
        this.telefono = telefono;
        return this;
    }

    public ContactoBuilder setDireccion(Direccion direccion) {
        this.direccion = direccion;
        return this;
    }

    @Override
    public Contacto build() {
        return new Contacto(nombre, telefono, direccion);
    }
}
