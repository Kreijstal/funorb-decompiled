/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class woa extends od {
    byte[] field_k;
    static String field_l;

    final static void a(int param0, cga param1) {
        try {
            aba.field_a.b((byte) -86, (vg) (Object) param1);
            wj.a(param1, 4, -118);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "woa.A(" + 4 + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final static void a(int param0, cn param1, cn param2) {
        jma.field_j = param1;
        try {
            dk.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "woa.C(" + -122 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    woa(byte[] param0) {
        try {
            ((woa) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "woa.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Email address is unavailable";
    }
}
