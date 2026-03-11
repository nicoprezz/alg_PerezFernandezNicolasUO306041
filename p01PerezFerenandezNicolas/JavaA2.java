package p0;

public class JavaA2 {

    /**
     * Algoritmo A2: Devuelve si m es primo.
     * Mejora: En cuanto encuentra un divisor, devuelve false inmediatamente.
     */
    public static boolean esPrimo(int m) {
        // range(2, m) en Python es i < m en Java
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("TIEMPOS DEL ALGORITMO A2 (JAVA)");
        
        int n = 5000;
        
        for (int casos = 0; casos < 8; casos++) {
            
            long t1 = System.currentTimeMillis(); 
            
            int contPrimos = 0;
            for (int i = 2; i <= n; i++) {
                if (esPrimo(i)) {
                    contPrimos++;
                }
            }
            
            long t2 = System.currentTimeMillis();
            
            System.out.println("n=" + n + " *** tiempo =" + (t2 - t1) + " milisegundos (" + contPrimos + " primos)");
            
            n = n * 2; 
        }
    }
}