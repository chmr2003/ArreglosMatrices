// Ejercicio 8: Mayor, menor y repeticiones
public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {5, 1, 2, 5, 3, 1, 5};
        int mayor = numeros[0], menor = numeros[0], repMayor = 0, repMenor = 0;
        for (int num : numeros) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }
        for (int num : numeros) {
            if (num == mayor) repMayor++;
            if (num == menor) repMenor++;
        }
        System.out.println("Mayor: " + mayor + " (se repite " + repMayor + " veces)");
        System.out.println("Menor: " + menor + " (se repite " + repMenor + " veces)");
    }
}