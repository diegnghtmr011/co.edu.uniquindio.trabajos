package co.edu.uniquindio.trabajos.builder;

import co.edu.uniquindio.trabajos.builder.model.Cliente;

public class MainBuilder {
    public static void main(String[] args) {
        crearCliente();

    }

    private static void crearCliente() {
        Cliente cliente = new Cliente("Juan",
                "Arias", "12312312",
                23, 50.4, 145);

        Cliente cliente2 = new Cliente("Juan",
                "Arias", "12312312",
                23, 50.4, 145);

        Cliente cliente3 = new Cliente();
        cliente3.setNombre("ana");
        cliente3.setApellido("perez");
        cliente3.setCedula("1095934594353");

        Cliente cliente4 = new Cliente();
        cliente4.setNombre("ana");
        cliente4.setApellido("perez");
        cliente4.setCedula("1095934594353");

    }
}
