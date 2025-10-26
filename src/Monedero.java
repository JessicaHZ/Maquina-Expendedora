public class Monedero {
    private int dineroDisponible;

    public Monedero(int dineroInicial) {
        this.dineroDisponible = dineroInicial;
    }

    public boolean esPosibleSuministrar(int monto) {
        return dineroDisponible >= monto;
    }

    public void suministrar(int cantidad) {
        if (esPosibleSuministrar(cantidad)) {
            dineroDisponible -= cantidad;
            System.out.println("Se entregó $" + cantidad + " de cambio.");
        } else {
            System.out.println("No hay suficiente dinero para entregar cambio.");
        }
    }

    public void devolverDineroIntroducido(int cantidad) {
        System.out.println("Devolviendo $" + cantidad + " al cliente.");
    }

    public void agregarDinero(int cantidad) {
        dineroDisponible += cantidad;
    }

}
