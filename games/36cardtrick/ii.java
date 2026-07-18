/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static int[] field_b;
    static sg field_e;
    static String field_f;
    static int field_c;
    static boolean field_d;
    static volatile boolean field_a;

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_e = null;
    }

    final static void a(dh param0, int param1, int param2) {
        try {
            vb.field_c.a((qb) (Object) param0, 27362);
            ke.a(param0, 4, 21719);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ii.B(" + (param0 != null ? "{...}" : "null") + ',' + 4 + ',' + 8192 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_f = "Quit";
        field_e = new sg();
        field_a = true;
    }
}
