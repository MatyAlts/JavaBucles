import java.util.Scanner;

public class bucles4 {
    public static void main(String[] args){
        String[] clientes = {"Juan", "Carlos", "María", "Pedro", "Valentina"};
        int[] compras = {15,2,33,20,1};

        calcular_descuento(clientes, compras);
    }
    public static void calcular_descuento(String[] clientes, int[] compras){

        Scanner lectura = new Scanner(System.in);
        int precio;

        for (int i = 0; i < compras.length; i++){
            if (compras[i] > 10){
                System.out.println(clientes[i]+ " Por favor ingrese el precio de su compra en $: ");
                precio = lectura.nextInt();

                int total = precio - (int)(precio * 0.10);

                System.out.println("El total a pagar es de $"+total);
            }
        }
    }
}
