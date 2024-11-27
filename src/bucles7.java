import java.util.Scanner;

public class bucles7 {
    public static void main(String[] args){
        int cant;

        Scanner cantidad_de_compras = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de facturas a las que desea aplicar el descuento: ");
        cant = cantidad_de_compras.nextInt();

        int[] compras = new int[cant];
    }
    public static void aplicar_descuento(int[] compras){
        int[] compras_con_descuento = new int[compras.length];
        int[] compras2 = new int[compras_con_descuento.length];

        for (int i = 0; i < compras.length; i++){
            if (compras[i] > 500){
                compras2[i] = compras[i];
            }
            compras_con_descuento[i] = compras2[i] - (int)(compras2[i] - 0.21);
            System.out.println(compras_con_descuento);
        }
    }
}
