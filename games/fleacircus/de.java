/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    byte[] field_p;
    int field_f;
    int field_g;
    int field_d;
    static rh field_h;
    int field_c;
    static vg field_b;
    int field_e;
    byte[] field_i;
    int field_m;
    static il[] field_n;
    static String field_o;
    int field_l;
    static String field_j;
    static java.math.BigInteger field_k;
    static dd field_a;

    public static void a(int param0) {
        field_o = null;
        field_n = null;
        field_a = null;
        field_j = null;
        if (param0 != 0) {
            de.a(38);
        }
        field_b = null;
        field_h = null;
        field_k = null;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 88) {
            field_h = null;
        }
        gb.a(si.field_R);
        int var4 = param1 * 16;
        int var5 = 16 * param3;
        gb.a(var4, var5, var4 - -16, var5 + 16);
        se.field_a[param2].f(0, 0);
        gb.b(si.field_R);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_n = new il[255];
        field_o = "That name is not available";
        for (var0 = 0; var0 < field_n.length; var0++) {
            field_n[var0] = new il();
        }
        field_j = "Waiting for fonts";
        field_k = new java.math.BigInteger("65537");
    }
}
