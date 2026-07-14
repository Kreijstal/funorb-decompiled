/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka implements fg {
    static hd field_c;
    static String field_d;
    static boolean field_b;
    static int field_a;

    final static void a(int param0, int param1, byte param2) {
        et.field_b = true;
        if (vl.a(false)) {
            return;
        }
        si.field_k = param1;
        ag.field_h = param0;
        if (param2 >= -68) {
            return;
        }
        fp.field_e = 2;
    }

    final static void a(int param0, String param1) {
        vp.field_p = param1;
        if (param0 != 2) {
            ka.a(122, 101, (byte) 60);
        }
    }

    public static void a(int param0) {
        if (param0 != 19044) {
            field_c = null;
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_d = "last week's Diamond Division winners: ";
    }
}
