import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n==== MENÚ PRINCIPAL DE PROGRAMAS ====");
            System.out.println("--- Programas del Primer Parcial ---");
            System.out.println("1.  Adivinar Número (Juego)");
            System.out.println("2.  Calculadora Básica");
            System.out.println("3.  Contar Dígitos de un Número Entero");
            System.out.println("4.  Contar Números Pares e Impares");
            System.out.println("5.  División de Dos Números");
            System.out.println("6.  Imprimir Números del Uno al Diez");
            System.out.println("7.  Multiplicación de Dos Números");
            System.out.println("8.  Números Primos (1-100)");
            System.out.println("9.  Suma de los Números del 1 al N");
            System.out.println("10. Resta de Dos Números");
            System.out.println("11. Suma de Dos Números");
            System.out.println("12. Suma de Dígitos de Números (100-110)");
            System.out.println("13. Tabla de Multiplicar de un Número");
            System.out.println("14. Triángulo de Asteriscos (Pirámide)");
            System.out.println("15. Números Perfectos (1-1000)");
            System.out.println("\n--- Programas del Segundo Parcial ---");
            System.out.println("16. Promedio de Calificaciones Aprobadas ");
            System.out.println("17. Clasificar un Número (Positivo/Negativo/Cero)");
            System.out.println("18. Contador de Números (Positivos/Negativos/Ceros)");
            System.out.println("19. Control de Acceso por Edad o Permiso");
            System.out.println("20. Registro de Estudiantes (Promedio y Estado)");
            System.out.println("21. Juego de Adivinanza (Version 2)");
            System.out.println("22. Número Misterioso (Juego con Intentos)");
            System.out.println("23. Números Capicua en un Rango");
            System.out.println("24. Cálculo de Area y Perimetro de Rectangulo");
            System.out.println("25. Gestión de Empleados (Salario y Estado)");
            System.out.println("26. Clasificación de Persona por Edad");
            System.out.println("27. Conversor de Temperaturas");
            System.out.println("28. Sumar Números hasta Introducir Cero");
            System.out.println("\n0.  Salir del Programa");
            System.out.print("Elige una opción: ");
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                System.out.println("\n------------------------------------");
                switch (opcion) {
                    case 1:
                        AdivinarNumero.main(null);
                        break;
                    case 2:
                        Calculadora.main(null);
                        break;
                    case 3:
                        contar_digitos_numentero.main(null);
                        break;
                    case 4:
                        contar_paresimpares.main(null);
                        break;
                    case 5:
                        division.main(null);
                        break;
                    case 6:
                        imprimir_numerosdel_unoaldiez.main(null);
                        break;
                    case 7:
                        multiplicacion.main(null);
                        break;
                    case 8:
                        numeros_primos.main(null);
                        break;
                    case 9:
                        NumerosN.main(null);
                        break;
                    case 10:
                        resta.main(null);
                        break;
                    case 11:
                        suma.main(null);
                        break;
                    case 12:
                        SumaDigitos.main(null);
                        break;
                    case 13:
                        TablaMultiplicar.main(null);
                        break;
                    case 14:
                        triangulo_asteriscos.main(null);
                        break;
                    case 15:
                        NumerosPerfectos.main(null);
                        break;
                    case 16:
                        Aprobados.main(null);
                        break;
                    case 17:
                        ClasificadorNumeros.main(null);
                        break;
                    case 18:
                        ContadorNumeros.main(null);
                        break;
                    case 19:
                        ControlDeAcceso.main(null);
                        break;
                    case 20:
                        RegistroEstudiantes.main(null);
                        break;
                    case 21:
                        JuegoAdivinanza.main(null);
                        break;
                    case 22:
                        NumeroMisterios.main(null);
                        break;
                    case 23:
                        NumerosCapicua.main(null);
                        break;
                    case 24:
                        ProgramaRectangulo.main(null);
                        break;
                    case 25:
                        GestionEmpleados.main(null);
                        break;
                    case 26:
                        ProgramaPersona.main(null);
                        break;
                    case 27:
                        ConversorTemperaturas.main(null);
                        break;
                    case 28:
                        SumarHastaCero.main(null);
                        break;
                    case 0:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                System.out.println("------------------------------------");

            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida, ingresa otro numero");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = -1; // Para que el bucle continúe
            } catch (Exception e) {
                System.out.println("Ocurrió un error al ejecutar el programa");
                System.out.println("Detalles del error: " + e.getMessage());
                opcion = -1;
            }

        } while (opcion != 0);

        scanner.close();
    }
}
