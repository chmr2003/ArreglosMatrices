// Ejercicio 9: Contar ocurrencias de un número
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] arreglo = {4, 6, 8, 2, 6, 9, 6, 1};
        int x = 6, count = 0;
        for (int num : arreglo) {
            if (num == x) count++;
        }
        System.out.println("El número " + x + " aparece " + count + " veces.");
    }
}