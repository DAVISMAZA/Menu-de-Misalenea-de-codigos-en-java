import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==== MEN� PRINCIPAL DE PROGRAMAS ====");
            System.out.println("--- Programas del Primer Parcial ---");
            System.out.println("1.  Adivinar N�mero (Juego)");
            System.out.println("2.  Calculadora B�sica");
            System.out.println("3.  Contar D�gitos de un N�mero Entero");
            System.out.println("4.  Contar N�meros Pares e Impares");
            System.out.println("5.  Divisi�n de Dos N�meros");
            System.out.println("6.  Imprimir N�meros del Uno al Diez");
            System.out.println("7.  Multiplicaci�n de Dos N�meros");
            System.out.println("8.  N�meros Primos (1-100)");
            System.out.println("9.  Suma de los N�meros del 1 al N");
            System.out.println("10. Resta de Dos N�meros");
            System.out.println("11. Suma de Dos N�meros");
            System.out.println("12. Suma de D�gitos de N�meros (100-110)");
            System.out.println("13. Tabla de Multiplicar de un N�mero");
            System.out.println("14. Tri�ngulo de Asteriscos (Pir�mide)");
            System.out.println("15. N�meros Perfectos (1-1000)");

            System.out.println("\n--- Programas del Segundo Parcial ---");
            System.out.println("16. Promedio de Calificaciones Aprobadas (Array)");
            System.out.println("17. Clasificar un N�mero (Positivo/Negativo/Cero)");
            System.out.println("18. Contador de N�meros (Positivos/Negativos/Ceros en Array)");
            System.out.println("19. Control de Acceso por Edad o Permiso");
            System.out.println("20. Registro de Estudiantes (Promedio y Estado)");
            System.out.println("21. Juego de Adivinanza (Versi�n 2)");
            System.out.println("22. N�mero Misterioso (Juego con Intentos)");
            System.out.println("23. N�meros Capic�a en un Rango");
            System.out.println("24. C�lculo de �rea y Per�metro de Rect�ngulo");
            System.out.println("25. Gesti�n de Empleados (Salario y Estado)");
            System.out.println("26. Clasificaci�n de Persona por Edad");
            System.out.println("27. Conversor de Temperaturas");
            System.out.println("28. Sumar N�meros hasta Introducir Cero");

            System.out.println("\n0.  Salir del Programa");
            System.out.print("Elige una opci�n: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de l�nea

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
                        System.out.println("Saliendo del programa. �Hasta luego!");
                        break;
                    default:
                        System.out.println("Opci�n no v�lida. Por favor, ingresa un n�mero del 0 al 28.");
                        break;
                }
                System.out.println("------------------------------------");

            } catch (InputMismatchException e) {
                System.out.println("Entrada inv�lida. Por favor, ingresa un n�mero.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = -1; // Para que el bucle contin�e
            } catch (Exception e) {
                System.out.println("Ocurri� un error al ejecutar el programa. Aseg�rate de que todos los archivos .java est�n en la misma carpeta y compilados.");
                System.out.println("Detalles del error: " + e.getMessage());
                opcion = -1;
            }

        } while (opcion != 0);

        scanner.close();
    }
}
