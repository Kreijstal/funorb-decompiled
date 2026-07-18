/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static ic field_b;
    static String field_e;
    static volatile int field_f;
    static pd field_c;
    static boolean[] field_d;
    static boolean field_a;

    final static void a(int param0, sc param1) {
        try {
            if (param0 != 0) {
                Object var3 = null;
                ei.a(-102, (sc) null);
            }
            di.a(param1, param0 ^ 109, true);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ei.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Offer unrated rematch";
        field_f = 0;
        field_a = false;
    }
}
