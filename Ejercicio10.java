// Ejercicio 10: Suma de opuestos
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] A = {8, 5, 3, 10, 2, 8, 1};
        int[] B = new int[(A.length + 1) / 2];
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] + A[A.length - 1 - i];
        }
        System.out.print("Arreglo resultante: ");
        for (int num : B) System.out.print(num + " ");
    }
}