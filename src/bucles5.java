import java.util.Scanner;

public class bucles5 {
    public static void main(String[] args){

        Scanner calif = new Scanner(System.in);
        Scanner respuesta = new Scanner(System.in);

        System.out.println("Por favor ingrese cuantas calificaciones desea evaluar: ");
        int cant = respuesta.nextInt();

        int[] calificaciones = new int[cant];
        for (int i = 0; i < cant; i++){
            System.out.println("Por favor ingrese la calificacaión número " + (i + 1) + ": (las calificaciones van del 1 al 5)");
            calificaciones[i] = calif.nextInt();
        }

        calcular_promedio_satisfaccion(calificaciones, cant);
    }
    public static void calcular_promedio_satisfaccion(int[] calificaciones, int cant){
        int promedio = 0, total = 0;

        for (int i = 0; i < cant; i++){
            promedio += calificaciones[i];
        }
        total = promedio / cant;

        System.out.println("El promedio de satisfacción con el servicio es de: " + total);
    }
}
