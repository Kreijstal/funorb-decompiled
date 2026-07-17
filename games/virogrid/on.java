/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static java.math.BigInteger field_a;
    static e field_b;
    static boolean field_d;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            ao.field_Gb = true;
            pa.field_o.field_V = param1;
            var2_int = ca.field_M.field_c;
            var3 = ca.field_M.field_b;
            var4 = pa.field_o.field_C.a(param1, 272, pa.field_o.field_fb);
            var5 = 7 + var3 / 2 - (110 - -(var4 / 2));
            jj.field_a.a((var2_int + -320) / 2, var3 - (120 - -(var5 * 2)), 320, (byte) -128, var5);
            jj.field_a.field_vb = ne.a(jj.field_a.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
            pa.field_o.a(24, -44 + jj.field_a.field_ub, jj.field_a.field_K - 48, (byte) -71, 16);
            nk.field_H.a(120, 24, 80, (byte) -101, -24 + (-20 + jj.field_a.field_ub));
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "on.C(" + 106 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var1 = -118;
        if (32 >= ag.field_c) {
            qe.a((byte) 56, 0);
        } else {
            var2 = ag.field_c % 32;
            if (var2 == 0) {
                var2 = 32;
            }
            qe.a((byte) 104, ag.field_c - var2);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = new java.math.BigInteger("65537");
    }
}
