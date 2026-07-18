/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static long[] field_b;
    static qr field_c;
    static int field_a;

    final static void a(int[] param0, int[] param1, byte param2) {
        try {
            eo.a(param0, param1, param1.length - 1, true, 0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "nm.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 47 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
    }
}
