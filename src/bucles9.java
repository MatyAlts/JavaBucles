import java.util.Scanner;

public class bucles9 {
    public static void main(String[] args){
        int cant;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de precios que desea ingresar: ");
        cant = lectura.nextInt();

        int[] precios_originales = new int[cant];

        calcular_precio_final(precios_originales);
    }
    public static void calcular_precio_final(int[] precios_originales){
        int[] precio_final = new int [precios_originales.length];

        for (int i =0; i < precios_originales.length; i++){
            precio_final[i] = precios_originales[i] - (int)(precios_originales[i] * 0.10);
        }
    }
}
