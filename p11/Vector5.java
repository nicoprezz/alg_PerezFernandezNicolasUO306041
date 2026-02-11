package p11;

public class Vector5 {
    static int[] v;

    public static void main(String arg[]) {
        int repeticiones = Integer.parseInt(arg[0]);
        long t1, t2;
        int[] m = new int[2]; // Para guardar posicion y valor del maximo

        System.out.println("Medición de MÁXIMO - repeticiones = " + repeticiones);
        System.out.println("n\tTiempo");
        for (int n = 10000; n <= 81920000; n *= 2) {
            v = new int[n];
            Vector1.rellena(v);

            t1 = System.currentTimeMillis();
            for (int r = 1; r <= repeticiones; r++) {
                Vector1.maximo(v, m); 
            }
            t2 = System.currentTimeMillis();
            
            System.out.println(n + "\t" + (t2 - t1));
        }
        System.out.println("\nFin de la medicion de tiempos *****");
    }
}