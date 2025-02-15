// Ejercicio 4: Encontrar el mayor valor de dos arreglos
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] edades1 = {23, 45, 12};
        int[] edades2 = {34, 56, 67};
        int mayor= Math.max(maxArray(edades1), maxArray(edades2));
        System.out.println("Mayor edad: " + mayor);
    }
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }
}