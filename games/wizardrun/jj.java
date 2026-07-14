/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static o[] field_a;
    static gb field_b;
    static String field_c;
    static rj field_d;

    final static void b(int param0) {
        int var1 = 0;
        int var2 = wizardrun.field_H;
        pe.field_y.a(5);
        for (var1 = 0; var1 < 32; var1++) {
            pc.field_k[var1] = 0L;
        }
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            ql.field_b[var1] = 0L;
        }
        uh.field_c = param0;
    }

    final static String a(boolean param0) {
        if (!param0) {
            return null;
        }
        return dh.field_c;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
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
