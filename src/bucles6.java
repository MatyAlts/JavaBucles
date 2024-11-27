import java.util.Scanner;

public class bucles6 {
    public static void main(String[] args){
        int cant = 0;

        Scanner lectura = new Scanner(System.in);
        Scanner factura = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de facturas a las que desee calcularle los impuestos: ");
        cant = lectura.nextInt();

        double[] facturas = new double[cant];

        for (int i = 0; i < cant; i++){
            System.out.println("Por favor ingrese el valor de la factura en $: ");
            facturas[i] = factura.nextInt();
        }

        calcular_inpuesto(facturas);
    }
    public static void calcular_inpuesto(double[] facturas){
        double[] fact_con_impuesto = new double[facturas.length];

        for (int i = 0; i < facturas.length; i++){
            fact_con_impuesto[i] = facturas[i] * 1.21;
        }
        System.out.println("Este es el precio de todas las facturas en $: ");
        System.out.println(fact_con_impuesto);
    }
}
