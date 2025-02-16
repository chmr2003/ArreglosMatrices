// Ejercicio 14: Diferencia de elementos sucesivos
public class Ejercicio14 {
    public static void main(String[] args) {
        int[] A = {4, 6, 8, 2, 6, 9, 5, 1};
        int[] B = new int[A.length - 1];
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] - A[i+1];
        }
        System.out.print("Arreglo resultante: ");
        for (int num : B) System.out.print(num + " ");
    }
}