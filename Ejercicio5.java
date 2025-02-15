// Ejercicio 5: Total gastado en productos
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] precios = {10, 20, 30};
        int[] cantidades = {2, 3, 1};
        int total = 0;
        for (int i = 0; i < precios.length; i++) {
            total += precios[i] * cantidades[i];
        }
        System.out.println("Total gastado: " + total);
    }
}
