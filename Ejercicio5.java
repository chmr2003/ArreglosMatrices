public class Ejercicio15 {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Ana", "Luis", "María"}; // Nombres de los trabajadores
        int[] sueldos = {1000, 1200, 1100, 1300}; // Sueldos respectivos

        // Paso 1: Calcular el sueldo promedio
        int suma = 0;
        for (int sueldo : sueldos) {
            suma += sueldo;
        }
        double promedio = (double) suma / sueldos.length;
        
        System.out.println("Sueldo promedio: " + promedio);
        
        // Paso 2: Encontrar la menor diferencia con el promedio
        double diferenciaMinima = Double.MAX_VALUE;
        for (int sueldo : sueldos) {
            double diferencia = Math.abs(sueldo - promedio);
            if (diferencia < diferenciaMinima) {
                diferenciaMinima = diferencia;
            }
        }

        // Paso 3: Imprimir los empleados con el sueldo más cercano al promedio
        System.out.print("Trabajadores con sueldo más cercano al promedio: ");
        for (int i = 0; i < sueldos.length; i++) {
            if (Math.abs(sueldos[i] - promedio) == diferenciaMinima) {
                System.out.print(nombres[i] + " ");
            }
        }
    }
}
