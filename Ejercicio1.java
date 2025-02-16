// Ejercicio 1: Suma de N números
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma total: " + suma);
    }
}
