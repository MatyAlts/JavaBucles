import java.util.Scanner;

/**
 Ejercicio 5: Cálculo de horas extras
 Una empresa desea calcular las horas extras trabajadas por sus empleados.
 Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
 Instrucciones:
 •	Pide al usuario ingresar el número de empleados.
 •	Usa un bucle para ingresar las horas trabajadas por cada empleado.
 •	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");
        int cantEmpleados = 0;
        do{
            try{
                cantEmpleados = Integer.parseInt(sc.next());
                if(cantEmpleados < 0){
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println("Ingrese un numero valido:");
            }
        } while (cantEmpleados <= 0);
        int[] horasEmpleados = new int[cantEmpleados];
        for (int i = 0; i < horasEmpleados.length; i++) {
            do {
                try {
                    System.out.println("Ingrese la cantidad de horas para su empleado numero " + (i+1) + ":");
                    horasEmpleados[i] = Integer.parseInt(sc.next());
                } catch (Exception e) {
                    System.out.println("Ingrese un numero valido");
                }
            } while (horasEmpleados[i] <= 0);
        }
        for (int i = 0; i < horasEmpleados.length; i++) {
            if (horasEmpleados[i] > 40) {
                System.out.println("El empleado numero " + (i+1) + " tiene: " + (horasEmpleados[i]-40) + " horas extras");
            }
        }
    }
}