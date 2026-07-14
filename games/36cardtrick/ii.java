/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static int[] field_b;
    static sg field_e;
    static String field_f;
    static int field_c;
    static boolean field_d;
    static volatile boolean field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 4308) {
            field_c = 119;
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    final static void a(dh param0, int param1, int param2) {
        if (param2 != 8192) {
            return;
        }
        vb.field_c.a((qb) (Object) param0, 27362);
        ke.a(param0, param1, 21719);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_f = "Quit";
        field_e = new sg();
        field_a = true;
    }
}
