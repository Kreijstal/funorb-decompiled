/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static int field_a;
    static String field_b;
    static db[] field_c;

    final static void a(java.math.BigInteger param0, wf param1, java.math.BigInteger param2, byte param3, wf param4) {
        try {
            if (param3 != 111) {
                field_b = null;
            }
            tg.a(param0, param4.field_h, param2, (byte) 84, param1, 0, param4.field_j);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "wc.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
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
        field_b = "Open in popup window";
    }
}
