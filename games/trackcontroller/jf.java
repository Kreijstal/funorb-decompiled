/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends fc {
    int field_m;
    static String[] field_i;
    int field_k;
    static int field_j;
    static mk field_l;

    final static void e(int param0) {
        gh.field_k = false;
        vg.field_o = false;
        qc.b(-1, (byte) -42);
        rk.field_X = hf.field_f;
        fd.field_h = hf.field_f;
    }

    public static void d(int param0) {
        if (param0 != 640) {
            jf.d(-73);
            field_l = null;
            field_i = null;
            return;
        }
        field_l = null;
        field_i = null;
    }

    private jf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 640;
        field_l = new mk();
    }
}
