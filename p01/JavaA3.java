package p0;

public class JavaA3 {

    /**
     * Algoritmo A3: Devuelve si m es primo.
     * Mejora: Solo busca divisores hasta la mitad (m / 2).
     */
    public static boolean esPrimo(int m) {
        for (int i = 2; i <= m / 2; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("TIEMPOS DEL ALGORITMO A3 (JAVA)");
        
        int n = 5000;
        
        for (int casos = 0; casos < 8; casos++) {
            
            long t1 = System.currentTimeMillis(); 
           
            int contPrimos = 1;
            
            for (int i = 3; i <= n; i += 2) {
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