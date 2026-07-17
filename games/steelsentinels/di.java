/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static wk field_f;
    static int field_g;
    static String field_e;
    static int field_d;
    static int field_h;
    static int field_a;
    static boolean field_b;
    static int[] field_c;

    final static void a(byte param0) {
        ln.field_a = 0;
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        if (param0 != -1) {
            field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_d = -1;
        field_b = false;
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1};
    }
}
