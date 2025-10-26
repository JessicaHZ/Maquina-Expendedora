import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        Scanner sc = new Scanner(System.in);

        maquina.mostrarBilletes();

        System.out.print("Selecciona el ID del billete: ");
        int id = sc.nextInt();
        maquina.seleccionarBillete(id);

        System.out.print("Introduce la cantidad de dinero: ");
        double dinero = sc.nextDouble();
        maquina.insertarDinero(dinero);

        maquina.expenderBillete();

        sc.close();
    }
}
