/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static byte[][] field_b;
    static volatile int field_a;
    static String field_d;
    static String field_c;

    final static void a(float param0, boolean param1, boolean param2, String param3) {
        try {
            if (!(null != md.field_i)) {
                md.field_i = new vc(tm.field_l, vd.field_X);
                tm.field_l.a(0, (fi) (Object) md.field_i);
            }
            md.field_i.a(param0, false, param2, param3);
            df.c();
            ci.b(true, -127);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "sm.B(" + param0 + 44 + 1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[250][];
        field_d = "By win %";
        field_a = -1;
        field_c = "Match by...";
    }
}
