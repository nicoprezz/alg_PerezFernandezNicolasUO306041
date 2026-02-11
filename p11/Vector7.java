package p11;

public class Vector7 {
    static int[] v, w;

    public static void main(String arg[]) {
        int repeticiones = Integer.parseInt(arg[0]);
        long t1, t2;

        System.out.println("Medición COINCIDENCIAS 2 (Lineal) - repeticiones = " + repeticiones);
        System.out.println("n\tTiempo");
        for (int n = 10000; n <= 81920000; n *= 2) {
            v = new int[n];
            w = new int[n];
            Vector1.rellena(v);
            Vector1.rellena(w);

            t1 = System.currentTimeMillis();
            for (int r = 1; r <= repeticiones; r++) {
                Vector1.coincidencias2(v, w);
            }
            t2 = System.currentTimeMillis();
            
            System.out.println(n + "\t" + (t2 - t1));
        }
    }
}