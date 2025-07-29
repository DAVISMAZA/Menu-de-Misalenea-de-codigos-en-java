public class ContadorNumeros {
    public static void main(String[] args) {
        int[] numeros = {10, -5, 0, 20, -15, 0, 30};
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}