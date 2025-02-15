// Ejercicio 11: Separar negativos, ceros y positivos
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] A = {-3, -1, 0, 4, 6, -2, 0, 9};
        System.out.print("Negativos: ");
        for (int num : A) {
            if (num < 0) System.out.print(num + " ");
        }
        System.out.print("\nCeros: ");
        for (int num : A) {
            if (num == 0) System.out.print(num + " ");
        }
        System.out.print("\nPositivos: ");
        for (int num : A) {
            if (num > 0) System.out.print(num + " ");
        }
    }
}