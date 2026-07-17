/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        fk.a(105, fe.field_kb);
        if (param0 >= -76) {
            di.a((byte) -90);
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        return mg.field_f[param1 & 2047];
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 8070) {
            di.a(124);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Return to lobby";
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
        field_c = "Cancel";
    }
}
