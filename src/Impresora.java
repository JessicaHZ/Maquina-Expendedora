public class Impresora {
    private boolean tieneTinta;
    private int tipoPapelActual;

    public Impresora() {
        this.tieneTinta = true; // se asume que inicia con tinta
        this.tipoPapelActual = 1;
    }

    public boolean tieneTinta() {
        return tieneTinta;
    }

    public void recargarTinta() {
        tieneTinta = true;
        System.out.println("La impresora ha sido recargada con tinta.");
    }

    public boolean imprimirYExpulsarBillete(int tipoPapel) {
        if (!tieneTinta) {
            System.out.println("No hay tinta disponible para imprimir.");
            return false;
        }
        System.out.println("Imprimiendo billete en papel tipo " + tipoPapel + "...");
        return true;
    }

}
