public class App {
    public static void main(String[] args) throws Exception {
        // 1. Creación de los tres vuelos solicitados
        Vuelo vuelo1 = new Vuelo("MS89", "Bogota", "Barcelona", 5);
        Vuelo vuelo2 = new Vuelo("MJ17", "Cartagena", "Punta Cana", 8);
        Vuelo vuelo3 = new Vuelo("DI04", "Medellin", "Ciudad de Mexico", 10);

        // --- PRUEBAS CON EL VUELO 1 ---
        System.out.println("\nPRUEBAS CON EL VUELO " + vuelo1.getNumero());
        System.out.println("Información inicial del vuelo:");
        vuelo1.mostrarInfo();
        
        System.out.println("\nEstado inicial de los asientos:");
        vuelo1.mostrarAsientos();

        System.out.println("\nEmbarcando pasajeros:");
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A2");
        vuelo1.embarcar("A3");

        System.out.println("\nIntento de embarcar en un asiento ocupado:");
        vuelo1.embarcar("A1");

        System.out.println("\nEstado de los asientos después del embarque:");
        vuelo1.mostrarAsientos();

        System.out.println("\nDesembarcando pasajeros:");
        vuelo1.desembarcar("A1");

        System.out.println("\nEstado de los asientos después del desembarque:");
        vuelo1.mostrarAsientos();


        // --- PRUEBAS CON EL VUELO 2 ---
        System.out.println("\nPRUEBAS CON EL VUELO " + vuelo2.getNumero());
        System.out.println("Información inicial del vuelo:");
        vuelo2.mostrarInfo();

        System.out.println("\nEmbarcando pasajeros en " + vuelo2.getNumero() + ":");
        vuelo2.embarcar("A1");
        vuelo2.embarcar("A2");
        vuelo2.embarcar("A3");
        vuelo2.embarcar("A4");
        vuelo2.embarcar("A5");
        vuelo2.embarcar("A6");
        vuelo2.embarcar("A7");
        vuelo2.embarcar("A8");

        System.out.println("\nIntento de embarcar en un asiento inexistente:");
        vuelo2.embarcar("A12");

        System.out.println("\nEstado actual de los asientos en " + vuelo2.getNumero() + ":");
        vuelo2.mostrarAsientos();

        System.out.println("\nDesembarcando pasajero del asiento A6:");
        vuelo2.desembarcar("A6");

        System.out.println("\nIntento de liberar un asiento que ya está libre:");
        vuelo2.desembarcar("A6");


        // --- PRUEBAS CON EL VUELO 3 ---
        System.out.println("\n PRUEBAS CON EL VUELO " + vuelo3.getNumero());
        System.out.println("Información inicial del vuelo:");
        vuelo3.mostrarInfo();

        System.out.println("\nLlenando algunos asientos del vuelo hacia " + vuelo3.getDestino() + ":");
        vuelo3.embarcar("A1");
        vuelo3.embarcar("A4");
        vuelo3.embarcar("A9");
        vuelo3.embarcar("A10");

        System.out.println("\nDesembarcando pasajeros de los asientos A4 y A9:");
        vuelo3.desembarcar("A4");
        vuelo3.desembarcar("A9");

        System.out.println("\nDesembarcando pasajero del asiento A2 asiento no ocupado:");
        vuelo3.desembarcar("A2");


        System.out.println("\nEstado final de los asientos en " + vuelo3.getNumero() + ":");
        vuelo3.mostrarAsientos();
    }
}
