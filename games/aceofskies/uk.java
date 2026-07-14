/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends wf {
    int field_m;
    static int field_e;
    int field_h;
    int field_i;
    int field_l;
    int field_n;
    static dq field_j;
    static int field_g;
    static km field_f;
    int field_k;

    final static boolean a(byte param0) {
        if (param0 != -5) {
            return true;
        }
        return 250 < it.field_c ? true : false;
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 250) {
            field_e = -101;
            field_f = null;
            return;
        }
        field_f = null;
    }

    private uk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new dq();
    }
}
