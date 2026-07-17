/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static o[] field_a;
    static gb field_b;
    static String field_c;
    static rj field_d;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = wizardrun.field_H;
        try {
            pe.field_y.a(5);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                pc.field_k[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ql.field_b[var1_int] = 0L;
            }
            uh.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "jj.A(" + param0 + 41);
        }
    }

    final static String a(boolean param0) {
        return dh.field_c;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Type your age in years";
    }
}
