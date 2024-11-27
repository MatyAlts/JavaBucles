public class bucles8 {
    public static void main(String[] args){
        String[] empleados = {"Juan", "Carlos", "María", "Pedro", "Valentina"};
        int[] horas_trabajadas = {40, 50, 20, 15, 35};


    }
    public static void calcular_pago_semanal(String[] empleados, int[] horas_trabajadas){
        int[] pago = new int[empleados.length];
        int[] salario = new int[empleados.length];

        for (int i = 0; i < empleados.length; i++){
            salario[i] = horas_trabajadas[i] * 15;
            System.out.println(empleados[i] + "debe cobrar : $" + salario);
        }
    }
}
