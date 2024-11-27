import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class bucles1 {
    public static void main(String[] args){
        int respuesta, venta, total;
        Scanner lectura = new Scanner(System.in);
        total = 0;

        do {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Desea añadir una venta? (1 = Si, 0= No)"));

            if (respuesta != 0){
                JOptionPane.showInputDialog("Ingrese el valor en $ de su venta");
                venta = lectura.nextInt();

                total = ventas(venta);
            }else {
                System.out.println("Saliendo del programa...");
            }

        }while (respuesta != 0);

        System.out.println("El total en ventas hasta ahora es de: $"+ total);
    }
    public static int ventas (int venta_realizada){
        String retorno = "Se añadio su venta";
        int total;

        ArrayList<Integer> ventas_mes = new ArrayList<>();

        ventas_mes.add(venta_realizada);

        total = 0;
        total += venta_realizada;

        return total;
    }
    public static void calcular_ingresos_mensuales(String[] args){

    }
}
