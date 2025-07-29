import java.util.Scanner;

public class contar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un n�mero entero: ");
        int numero = scanner.nextInt();

        int contador = 0;
        int temp = numero;

        if (temp == 0) {
            contador = 1;
        } else {
            // Original might not have handled negative numbers properly for digit counting
            if (temp < 0) {
                temp = -temp;
            }
            while (temp > 0) {
                temp /= 10;
                contador++;
            }
        }
        System.out.println("El n�mero " + numero + " tiene " + contador + " d�gito(s).");
        // scanner.close() was likely missing
    }
}
