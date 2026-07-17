/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static de field_a;
    static int field_e;
    static rc field_d;
    static cc field_b;
    static int field_c;

    final static void a(int param0, vg param1) {
        try {
            dh.field_k = 0;
            ij.field_f = param1;
            eg.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ra.A(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + -106 + 44 + 0 + 41);
        }
    }

    public static void a() {
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
