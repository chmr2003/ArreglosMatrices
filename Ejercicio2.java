// Ejercicio 2: Neto a pagar de empleados
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] sueldos = {1000, 1200, 1100};
        int[] asignaciones = {200, 150, 180};
        int[] deducciones = {100, 90, 80};
        for (int i = 0; i < sueldos.length; i++) {
            int neto = sueldos[i] + asignaciones[i] - deducciones[i];
            System.out.println("Empleado " + (i+1) + " Neto: " + neto);
        }
    }

    @Override
    public String toString() {
        return "Ejercicio2 []";
    }
}