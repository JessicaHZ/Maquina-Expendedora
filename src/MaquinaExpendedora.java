import java.util.ArrayList;
import java.util.List;

public class MaquinaExpendedora {
    private List<Billete> billetes;
    private Impresora impresora;
    private Monedero monedero;
    private Billete billeteSeleccionado;
    private double dineroInsertado;

    public MaquinaExpendedora() {
        impresora = new Impresora();
        monedero = new Monedero(100); // dinero inicial en la máquina
        billetes = new ArrayList<>();

        // Carga de billetes iniciales
        billetes.add(new Billete(1, "Billete Zona 1", 5.0, 1));
        billetes.add(new Billete(2, "Billete Zona 2", 8.0, 2));
        billetes.add(new Billete(3, "Billete Zona 3", 10.0, 3));
    }

    public void mostrarBilletes() {
        System.out.println("=== Tipos de billetes disponibles ===");
        for (Billete b : billetes) {
            System.out.println(b);
        }
    }

    public void seleccionarBillete(int id) {
        for (Billete b : billetes) {
            if (b.getId() == id) {
                billeteSeleccionado = b;
                System.out.println("Has seleccionado: " + b);
                return;
            }
        }
        System.out.println("Billete no encontrado.");
    }

    public void insertarDinero(double cantidad) {
        dineroInsertado += cantidad;
        System.out.println("Has introducido $" + cantidad);
    }

    public void expenderBillete() {
        if (billeteSeleccionado == null) {
            System.out.println("No se ha seleccionado ningún billete.");
            return;
        }
        if (dineroInsertado < billeteSeleccionado.getPrecio()) {
            System.out.println("Dinero insuficiente. Inserta más dinero.");
            return;
        }

        if (impresora.imprimirYExpulsarBillete(billeteSeleccionado.getTipoPapel())) {
            double cambio = dineroInsertado - billeteSeleccionado.getPrecio();
            if (cambio > 0) {
                monedero.suministrar((int)cambio);
            }
            System.out.println("Billete expedido correctamente.");
            dineroInsertado = 0;
        }
    }

    public void modoMantenimiento() {
        System.out.println("=== Modo mantenimiento ===");
        System.out.println("Recargando impresora y monedero...");
        impresora.recargarTinta();
        monedero.agregarDinero(50);
    }
}
