// Ejercicio 6: Ganancias por vivienda
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] alquileres = {500, 700, 800};
        double[] porcentajes = {10, 15, 12};
        for (int i = 0; i < alquileres.length; i++) {
            double ganancia = alquileres[i] * (porcentajes[i] / 100);
            System.out.println("Ganancia vivienda " + (i+1) + ": " + ganancia);
        }
    }
}