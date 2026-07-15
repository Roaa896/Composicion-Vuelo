public class Vuelo {
    private String numero;
    private String destino;
    private String origen;
    private int capMaxima;
    private Asiento[] asientos;

    public Vuelo(String numero, String destino, String origen){
        this.numero = numero;
        this.destino = destino;
        this.origen = origen;
    }

    public Vuelo(String numero, String destino, String origen, int capMaxima){
        this.numero = numero;
        this.destino = destino;
        this.origen = origen;
        this.capMaxima = capMaxima;

        asientos = new Asiento[capMaxima];

        for (int i = 0; i < capMaxima; i++){
            asientos[i] = new Asiento("A" + (i + 1));
        }
    }

    public String getNumero(){
        return this.numero;
    }

    public String getOrigen(){
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void mostrarInfo() {
        System.out.println("Número de vuelo: " + numero);
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Capacidad máxima: " + capMaxima);
    }

    public void mostrarAsientos() {
        System.out.println("Asientos del vuelo " + numero + ":");
        for (Asiento a : asientos) {
            a.mostrarEstado();
        }

    }
    
    public void embarcar(String codigoAsiento) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigoAsiento)) {
                a.ocupar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe en este vuelo." + numero + ".");
    }

    public void desembarcar(String codigoAsiento) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigoAsiento)) {
                a.liberar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe en este vuelo." + numero + ".");
    }
}
