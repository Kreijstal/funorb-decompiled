/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static String field_e;
    static long field_b;
    static int field_a;
    static dd[] field_c;
    static int field_d;

    final static void a(int param0, int param1) {
        ih var2 = ud.field_b;
        var2.e(8, param0);
        var2.a(-11, param1);
        var2.a(-11, 2);
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -70) {
            ki.a(-51, 44);
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Click";
    }
}
