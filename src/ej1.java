import java.util.Scanner;

public class ej1 {
    public static void main(String[] args){
        String fecha;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Por favor ingrese la fecha de su cumpleaños dd mm yyyy");
        fecha = lectura.next();

        String[] date = fecha.split("/");

        int dia, mes;

        dia = Integer.parseInt(date[0]);
        mes = Integer.parseInt(date[1]);

        if ((dia >= 20 && dia <= 31 && mes == 1) || (dia <= 18 && dia >= 29 && mes == 2)){
            System.out.println("Su signo es Acuario y esta es tu frase: ");
            System.out.println("Tu originalidad es tu superpoder; nunca dejes de ser tú mismo.");
        } else if ((dia >= 22 && dia <= 31 && mes == 12) || (dia >= 1 && dia <= 19 && mes == 1)) {
            System.out.println("Su signo es Capricornio y su frase es: ");
            System.out.println("La disciplina te llevará lejos; cada paso cuenta en tu camino.");
        } else if ((dia >= 19 && dia <= 29 && mes == 2)||(dia >= 20 && dia <= 31 && mes == 3)) {
            System.out.println("Su signo es Piscis y esta es tu frase: ");
            System.out.println("Tu intuición es un faro en la oscuridad; confía en ella.");
        } else if ((dia >= 22 && dia <= 31 && mes == 11) || (dia >= 21 && dia <= 31 && mes == 12)) {
            System.out.println("Su signo es Sagitario y esta es tu frase: ");
            System.out.println("La libertad es tu esencia; persigue tus sueños sin ataduras");
        } else if ((dia >= 23 && dia <= 31 && mes == 10)||(dia >= 1 && dia <= 21 && mes == 11)) {
            System.out.println("Su signo es Escorpio y esta es tu frase :");
            System.out.println("La profundidad de tus emociones te da poder; úsalo sabiamente.");
        } else if ((dia >= 23 && dia <= 31 && mes == 9) || (dia >= 1 && dia <= 22 && mes == 10)) {
            System.out.println("Su signo es Libra y su frase es: ");
            System.out.println("La armonía es tu camino; busca siempre el equilibrio en todo");
        } else if ((dia >= 23 && dia <= 31 && mes == 8) || (dia >= 1 && dia <= 22 && mes == 9)) {
            System.out.println("Su signo es Virgo y su frase es: ");
            System.out.println("La atención al detalle puede transformar lo cotidiano en extraordinario.");
        } else if ((dia >= 23 && dia <= 31 && mes == 7) || (dia >= 1 && dia <= 22 && mes == 8)) {
            System.out.println("Su signo es Leo y su frase es: ");
            System.out.println("Tu luz brilla con fuerza; no dudes en mostrarla al mundo.");
        } else if ((dia >= 21 && dia <= 31 && mes == 6) || (dia >= 1 && dia <= 22 && mes == 7)) {
            System.out.println("Su signo es Cáncer y su frase es: ");
            System.out.println("El hogar es donde está tu corazón; cuídalo con amor.");
        } else if ((dia >= 21 && dia <= 31 && mes == 5) || (dia >= 1 && dia <= 20 && mes == 6)) {
            System.out.println("Su signo es Géminis y su frase es: ");
            System.out.println("Tu curiosidad es una ventana al mundo; nunca dejes de explorar.");
        } else if ((dia >= 20 && dia <= 31 &&  mes == 4) || (dia >= 1 && dia <= 20 && mes == 5)){
            System.out.println("Su signo es Tauro y su frase es: ");
            System.out.println("La paciencia y la perseverancia son tus mejores aliados.");
        } else if ((dia >= 21 && dia <= 31 && mes == 3) || (dia >= 1 && dia <= 19 && mes == 4)) {
            System.out.println("Su signo es Aries y su frase es: ");
            System.out.println("La vida es una aventura; lánzate a ella sin miedo.");
        }
    }
}
