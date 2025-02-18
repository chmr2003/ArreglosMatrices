public class SueldosPromedio {
    public static String nombresSueldos(String[] nombres, int[] sueldos) {
        int suma = 0;

        // Calcular la suma de los sueldos
        for (int i = 0; i < sueldos.length; i++) {
            suma += sueldos[i];
        }

        // Calcular el sueldo promedio
        double promedio = (double) suma / sueldos.length;

        // Variables para almacenar los nombres de quienes tienen sueldo >= promedio
        String resultado = "";
        int contador = 0;

        // Buscar quienes tienen sueldo mayor o igual al promedio
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] >= promedio) {
                resultado += nombres[i] + "\n";
                contador++;
            }
        }

        // Agregar el resultado final
        resultado += "Fueron " + contador + " los empleados con sueldo mayor o igual al promedio.";

        return resultado+"\npromedio: "+promedio;
    }

    public static void main(String[] args) {
        // Datos de prueba
        String[] nombres = {"A", "B", "C", "D", "E"};
        int[] sueldos = {100, 200, 150, 200, 100};

        // Llamar a la función y mostrar el resultado
        System.out.println(nombresSueldos(nombres, sueldos));
    }
}
