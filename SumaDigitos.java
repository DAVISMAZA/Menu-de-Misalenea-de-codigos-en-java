public class SumaDigitos {
    public static void main(String[] args) {
        for (int num = 100; num <= 110; num++) {
            int suma = 0;
            int temp = num;
            while (temp > 0) {
                suma += temp % 10;
                temp /= 10;
            }
            System.out.println("La suma de los dígitos de " + num + " es " + suma);
        }
    }
}