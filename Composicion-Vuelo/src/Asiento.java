public class Asiento {
    private String codigo;
    private boolean ocupado;

    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

    public void ocupar() {
    if (ocupado) {
        System.out.println("El asiento " + codigo + " esta ocupado.");
        } else {
            ocupado = true;
            System.out.println("El asiento " + codigo + " ha sido ocupado.");
        }
    }

    public void liberar() {
    if (ocupado) {
        ocupado = false;
        System.out.println("El asiento " + codigo + " ha sido liberado.");
    } else {
            System.out.println("El asiento " + codigo + " ya estaba libre.");
    }
    }

    public void mostrarEstado() {
        System.out.println("El asiento " + codigo + (ocupado ? " está ocupado." : " está libre."));
    }


}