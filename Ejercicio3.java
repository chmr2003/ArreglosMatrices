// Ejercicio 3: Sumar pares e impares
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int sumaPares = 0, sumaImpares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) sumaPares += num;
            else sumaImpares += num;
        }
        System.out.println("Suma Pares: " + sumaPares);
        System.out.println("Suma Impares: " + sumaImpares);
    }
}