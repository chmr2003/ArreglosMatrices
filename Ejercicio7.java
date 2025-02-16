// Ejercicio 7: Separar pares e impares
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = {10, 3, 4, 5, 6, 7, 8};
        for (int num : numeros) {
            if (num % 2 == 0) System.out.println("Par: " + num);
            else System.out.println("Impar: " + num);
        }
    }
}