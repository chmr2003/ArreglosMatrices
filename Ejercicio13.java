// Ejercicio 13: Separar mayores y menores a la media
public class Ejercicio13 {
    public static void main(String[] args) {
        int[] A = {5, 8, 12, 3, 7, 10};
        double media = 0;
        for (int num : A) media += num;
        media /= A.length;
        System.out.print("Mayores que la media: ");
        for (int num : A) if (num > media) System.out.print(num + " ");
        System.out.print("\nMenores que la media: ");
        for (int num : A) if (num < media) System.out.print(num + " ");
    }
}