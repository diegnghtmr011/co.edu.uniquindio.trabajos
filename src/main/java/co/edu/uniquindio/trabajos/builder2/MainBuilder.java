package co.edu.uniquindio.trabajos.builder2;

import co.edu.uniquindio.trabajos.builder2.model.Contacto;
import co.edu.uniquindio.trabajos.builder2.model.Direccion;
import co.edu.uniquindio.trabajos.builder2.model.Empleado;
import co.edu.uniquindio.trabajos.builder2.model.Telefono;
import co.edu.uniquindio.trabajos.builder2.model.builder.ContactoBuilder;
import co.edu.uniquindio.trabajos.builder2.model.builder.DireccionBuilder;
import co.edu.uniquindio.trabajos.builder2.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.trabajos.builder2.model.builder.TelefonoBuilder;
import co.edu.uniquindio.trabajos.builder2.model.enums.TipoGenero;
import co.edu.uniquindio.trabajos.builder2.model.enums.TipoTelefono;

public class MainBuilder {
    public static void main(String[] args) {
    crearEmpleado();

    }

    private static void crearEmpleado() {
        Telefono telefonoContacto = new TelefonoBuilder()
                .setNumeroTelefono("3001234567")
                .setTipoTelefono(TipoTelefono.CELULAR)
                .build();

        Direccion direccionContacto = new DireccionBuilder()
                .setDireccion("Calle 123 #45-67")
                .setCiudad("Armenia")
                .setPais("Colombia")
                .setCodigoPostal("630001")
                .build();

        Contacto contacto = new ContactoBuilder()
                .setNombre("Pablo Escobar")
                .setTelefono(telefonoContacto)
                .setDireccion(direccionContacto)
                .build();

        Telefono telefonoEmpleado = new TelefonoBuilder()
                .setNumeroTelefono("3009876543")
                .setTipoTelefono(TipoTelefono.FIJO)
                .build();

        Direccion direccionEmpleado = new DireccionBuilder()
                .setDireccion("Avenida Siempre Viva 123")
                .setCiudad("Medellin")
                .setPais("Colombia")
                .setCodigoPostal("050021")
                .build();

        Empleado empleado = new EmpleadoBuilder()
                .setNombre("Juan Esteban Aristizábal Vásquez")
                .setEdad(35)
                .setTipoGenero(TipoGenero.MASCULINO)
                .setDireccion(direccionEmpleado)
                .setTelefono(telefonoEmpleado)
                .setListaContactos(contacto)
                .build();

        System.out.println(empleado);
    }

}
