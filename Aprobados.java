public class Aprobados {
    public static void main(String[] args) {
        int[] calificaciones = {85, 67, 90, 72, 55, 100, 80};
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            // Se cambió > 70 por >= 70 para incluir el 70 como aprobado
            if (calificaciones[i] >= 70) {
                suma += calificaciones[i];  // acumular solo aprobados
                contador++;  // contar los aprobados
            }
        }
        // Validación para evitar división por cero
        if (contador > 0) {
            double promedio = (double) suma / contador; // conversión a decimal
            System.out.println("Promedio de calificaciones aprobadas: " + promedio);
        } else {
            System.out.println("No hay calificaciones aprobadas.");
        }
    }
}