/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String[] field_d;
    static String field_e;
    static int field_a;
    static he[] field_b;
    static int field_c;

    public static void a() {
        field_b = null;
        field_d = null;
        field_e = null;
    }

    final static void a(vj param0, int param1, vj param2) {
        try {
            ce.field_a = param2;
            sb.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "gd.B(" + (param0 != null ? "{...}" : "null") + 44 + 255 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[255];
        field_e = "Alternatively, click";
    }
}
