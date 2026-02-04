package p0;

import java.util.Arrays; // Necesario para rellenar el array con 'true'

public class JavaA4 {

    /**
     * Algoritmo A4: Criba de Eratóstenes.
     * En lugar de dividir, marcamos en una tabla los "no primos" (falsos).
     */
    public static void primosA4(int n) {
        boolean[] listaNumeros = new boolean[n + 1];
        Arrays.fill(listaNumeros, true);
        
        // 0 y 1 no son primos
        listaNumeros[0] = false;
        listaNumeros[1] = false;

        int x = 2;
        while ((long)x * x <= n) {
            if (listaNumeros[x]) {
                for (int paso = 2 * x; paso <= n; paso += x) {
                    listaNumeros[paso] = false;
                }
            }
            x++;
        }

        int contPrimos = 0;
        for (int i = 2; i <= n; i++) {
            if (listaNumeros[i]) {
                contPrimos++;
            }
        }
        
        System.out.println("Hasta " + n + "  hay " + contPrimos + " primos");
    }

    public static void main(String[] args) {
        System.out.println("TIEMPOS DEL ALGORITMO A4 (JAVA)");
        
        int n = 5000;
        
        for (int casos = 0; casos < 15; casos++) {
            
            long t1 = System.currentTimeMillis();
            
            primosA4(n);
            
            long t2 = System.currentTimeMillis();
            
            System.out.println("n=" + n + "*** tiempo =" + (t2 - t1) + " milisegundos)");
            
            n = n * 2;
        }
    }
}