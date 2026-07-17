/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends le {
    static boolean[] field_r;
    int field_u;
    static int field_h;
    int field_o;
    long[][] field_i;
    static int[] field_q;
    int field_s;
    String[][] field_m;
    static af field_l;
    boolean field_j;
    static String[] field_p;
    int[][] field_k;
    static vn[] field_t;
    static int[] field_n;

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            nm.field_a = true;
            var2 = "tuhstatbut";
            if (param0 <= 11) {
                jc.a(-108, (byte) -75);
            }
            var3 = "rvnadlm";
            var4 = -1L;
            pg.a(true, param1, var4, var2, var3);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "jc.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_l = null;
        field_p = null;
        field_q = null;
        field_t = null;
        field_r = null;
        if (param0 != 830) {
            jc.a(-14);
        }
    }

    final static void a(int param0, byte param1) {
        ch.field_b = param0;
        int var2 = 0;
    }

    jc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_q = new int[]{90, 450, 830, 1230, 1550, 1970, 2020};
        field_p = new String[16];
        field_l = new af();
    }
}
