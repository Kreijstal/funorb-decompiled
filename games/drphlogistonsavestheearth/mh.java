/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static vj field_a;
    static int field_b;
    static he[] field_g;
    static String field_e;
    static int field_f;
    static int field_d;
    static nh field_c;

    final static void a(int param0, byte param1, vb param2) {
        lh var3 = null;
        try {
            int var4 = -117 % ((-28 - param1) / 32);
            var3 = nj.field_p;
            var3.d(param0, -18392);
            var3.c(5, (byte) -99);
            var3.c(0, (byte) -88);
            var3.c(param2.field_i, -17402);
            var3.c(param2.field_h, (byte) -127);
            var3.c(param2.field_m, (byte) -99);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "mh.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = "More suggestions";
    }
}
