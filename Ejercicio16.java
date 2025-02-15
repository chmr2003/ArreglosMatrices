// Ejercicio 16: Información de profesores
public class Ejercicio16 {
    public static void main(String[] args) {
        String[] profesores = {"Ana", "Luis", "Carlos", "Marta"};
        int[] edades = {45, 30, 50, 40};
        int menor = edades[0], mayor = edades[0];
        String profMenor = profesores[0], profMayor = profesores[0];
        int suma = 0;
        for (int i = 0; i < edades.length; i++) {
            suma += edades[i];
            if (edades[i] < menor) { menor = edades[i]; profMenor = profesores[i]; }
            if (edades[i] > mayor) { mayor = edades[i]; profMayor = profesores[i]; }
        }
        double promedio = suma / (double) edades.length;
        System.out.println("Edad promedio: " + promedio);
        System.out.println("Profesor más joven: " + profMenor);
        System.out.println("Profesor con mayor edad: " + profMayor);
    }
}