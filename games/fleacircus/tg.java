/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static fc field_h;
    static double[] field_b;
    static boolean field_g;
    static int field_d;
    static double[] field_c;
    static fh field_f;
    static boolean field_j;
    static String field_a;
    static long field_k;
    static la field_i;
    static e field_e;

    final static int a(ad param0, int param1, ad param2) {
        if (param1 != 0) {
            return -87;
        }
        Object var4 = null;
        return ak.a(0, 15021, false, param2, 0, (String) null, param0);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_c = null;
        field_h = null;
        field_e = null;
        field_b = null;
        field_i = null;
        if (!param0) {
            tg.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new fc();
        field_g = true;
        field_b = new double[65536];
        field_c = new double[65536];
        for (var0 = 0; 65536 > var0; var0++) {
            field_b[var0] = Math.sin((double)var0 * 3.141592653589793 / 32768.0);
            field_c[var0] = Math.cos(3.141592653589793 * (double)var0 / 32768.0);
        }
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_f = new fh(11, 0, 1, 2);
    }
}
