public class bucles2 {
    public static void main(String[] args){
        String[] articulos = {"Televisor", "Celular", "Laptop", "Tablet"};

        int[] stock = {5,0,12,4,25};

        generar_reporte_stock(articulos, stock);
    }
    public static void generar_reporte_stock(String[] articulos, int[] stock){
        for (int i = 0; i < articulos.length; i++){
            if (stock[i] < 5){
                System.out.println("El producto "+articulos[i]+" tiene bajas existencias");
            }
        }
    }
}
