/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static n field_f;
    int field_a;
    static tn field_e;
    static int field_b;
    static jp field_c;
    static String field_d;
    static boolean field_g;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 != -9669) {
            field_d = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10, boolean param11) {
        ac.a(param10, param7, param11, param9, param6, param5, param1, param4, param0, (byte) -113, param8, param2, 16777215, param3);
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 >= -35) {
            return false;
        }
        return sh.a(true, 104, param0, 10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new n();
        field_d = "Build: Adds a row of bricks to the top of the level.";
    }
}
