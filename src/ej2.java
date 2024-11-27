import java.util.Scanner;

public class ej2 {
    public static void Ejercicio2(String[] args){
        float tiempo, kilos, ejercicio;
        float total_quemado = 0.0f;


        Scanner lectura = new Scanner(System.in);

        System.out.println("Por favor ingrese su peso en kilogramos");
        kilos = lectura.nextInt();
        System.out.println("Cuanto tiempo te ejercitas al dias? (en minutos)");
        tiempo = lectura.nextInt();
        System.out.println("Que deporte realiza? 1(correr), 2(natación), 3(bicicleta)");
        ejercicio = lectura.nextInt();


        if (ejercicio == 1){
            total_quemado = 10*kilos*(tiempo/60);
        } else if (ejercicio == 2) {
            total_quemado = 6*kilos*(tiempo/60);
        } else if (ejercicio == 3) {
            total_quemado = 12*kilos*(tiempo/60);
        }

        System.out.println("En total quemaste "+total_quemado+ "calorias");
    }
}
