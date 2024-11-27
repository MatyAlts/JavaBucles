public class bucles3 {
    public static void main(String[] args){
        String[] clientes = {"Juan", "Carlos", "María", "Pedro", "Valentina"};
        int[] facturas_pendientes = {1000, 300, 700, 200, 150};

        enviar_facturas(clientes, facturas_pendientes);
    }
    public static void enviar_facturas(String[] clientes, int[] facturas_pendientes){
        for (int i = 0; i < clientes.length; i++){
            if (facturas_pendientes[i] > 500){
                System.out.println("Le debe enviar facturas a " + clientes[i]);
            }
        }
    }
}
