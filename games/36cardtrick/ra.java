/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static de field_a;
    static int field_e;
    static rc field_d;
    static cc field_b;
    static int field_c;

    final static void a(int param0, vg param1, byte param2, int param3) {
        try {
            dh.field_k = param0;
            if (param2 != -106) {
                field_b = null;
            }
            ij.field_f = param1;
            eg.field_d = param3;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ra.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 250;
        field_a = new de(12, 0, 1, 0);
        field_c = 0;
    }
}
