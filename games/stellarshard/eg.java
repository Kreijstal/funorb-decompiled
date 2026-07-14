/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static String[] field_a;
    static int field_d;
    static String field_c;
    static oj field_b;

    public static void b(int param0) {
        if (param0 > -85) {
            eg.b(42);
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = stellarshard.field_B;
        if (param0 > -26) {
            eg.b(12);
        }
        for (var1 = 0; (var1 ^ -1) > -3001; var1++) {
            if (!(null != wk.field_b[var1])) {
                return var1;
            }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Change display name";
        field_b = new oj();
    }
}
