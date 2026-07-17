/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static ff field_a;
    static o field_c;
    static i field_b;
    static volatile int field_d;
    static String field_e;

    public static void b() {
        field_c = null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0) {
        fb.field_a = false;
        int discarded$5 = te.field_N.j(255);
        if (param0 != 2) {
            u.a(-98);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = new ff(0, 2, 2, 1);
        field_e = "Back";
    }
}
