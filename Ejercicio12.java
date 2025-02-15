// Ejercicio 12: Posiciones de un número en un arreglo
public class Ejercicio12 {
    public static void main(String[] args) {
        int[] A = {4, 6, 8, 2, 6, 9, 6, 1};
        int x = 6;
        System.out.print("Posiciones: ");
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) System.out.print((i+1) + " ");
        }
    }
}