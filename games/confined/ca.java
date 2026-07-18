/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends rk {
    static bi field_r;
    int[] field_p;
    int field_m;
    static String field_q;
    static int[] field_n;
    static Boolean field_o;
    static String field_s;

    public static void b(int param0) {
        field_r = null;
        field_s = null;
        field_q = null;
        field_o = null;
        field_n = null;
    }

    private ca() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        if (da.field_h > 0) {
            ti.c(nl.field_c, nl.field_c + 64);
            nl.field_c = 64 + nl.field_c & 511;
            da.field_h = da.field_h - 64;
        }
    }

    final static void a(int param0, int param1) {
        int discarded$4 = oc.b(1);
        if (param1 != -1856653215) {
            ca.a(19, -59);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var0 = 0;
        int var2 = 0;
        field_q = "CONFINED";
        field_n = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
            var0 = var1;
            for (var2 = 0; 8 > var2; var2++) {
                if ((1 & var0) == 1) {
                    var0 = var0 >>> 1 ^ -306674912;
                } else {
                    var0 = var0 >>> 1;
                }
            }
            field_n[var1] = var0;
        }
        field_s = "Normal Difficulty";
    }
}
