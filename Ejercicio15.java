// Ejercicio 15: Trabajadores con sueldo promedio
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] sueldos = {1000, 1200, 1100, 1300};
        int suma = 0;
        for (int sueldo : sueldos) suma += sueldo;
        double promedio = (double) suma / sueldos.length;
        System.out.print("Trabajadores con sueldo promedio: ");
        for (int sueldo : sueldos) if (Math.abs(sueldo - promedio) < 0.01) System.out.print(sueldo + " ");
    }
}