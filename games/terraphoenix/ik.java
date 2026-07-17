/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int[] field_c;
    static int field_b;
    static String field_a;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
    }

    final static void a(fa param0, byte param1) {
        ci var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new ci(param0.a("final_frame.jpg", "", -21653), (java.awt.Component) (Object) ae.field_G);
            var3 = var2.field_r;
            var4 = var2.field_t;
            ja.c((byte) 88);
            hd.field_l = new ci(var3, var4 * 3 / 4);
            hd.field_l.a();
            var2.d(0, 0);
            ib.field_Y = new ci(var3, var4 - hd.field_l.field_t);
            ib.field_Y.a();
            int var5 = 0;
            var2.d(0, -hd.field_l.field_t);
            ib.field_Y.field_v = hd.field_l.field_t;
            ij.a(false);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ik.A(" + (param0 != null ? "{...}" : "null") + 44 + 100 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[12];
        field_a = "Log in";
    }
}
