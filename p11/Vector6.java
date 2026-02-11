package p11;

public class Vector6 {
    static int[] v, w; 

    public static void main(String arg[]) {
        int repeticiones = Integer.parseInt(arg[0]);
        long t1, t2;

        System.out.println("Medición COINCIDENCIAS 1 (Cuadrático) - repeticiones = " + repeticiones);
        System.out.println("n\tTiempo");
        for (int n = 10000; n <= 81920000; n *= 2) {
            v = new int[n];
            w = new int[n];
            Vector1.rellena(v);
            Vector1.rellena(w);

            t1 = System.currentTimeMillis();
            for (int r = 1; r <= repeticiones; r++) {
                Vector1.coincidencias1(v, w); 
            }
            t2 = System.currentTimeMillis();
            
            System.out.println(n + "\t" + (t2 - t1));
            
            // Si el tiempo ya supera los  5 min, no seguimos aumentando n
            if ((t2 - t1) > 300000) break; 
        }
    }
}