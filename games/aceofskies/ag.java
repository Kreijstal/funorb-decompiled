/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ag extends wt {
    static String field_o;
    boolean field_t;
    static sa field_n;
    volatile boolean field_p;
    static int field_r;
    boolean field_q;
    static int field_s;

    abstract byte[] a(boolean param0);

    final static void a(int param0, int param1, uc param2) {
        dl var3 = q.field_p;
        var3.g(64, param0);
        var3.b(-1336879960, param1);
        var3.b(-1336879960, 0);
        var3.a(((uc) param2).field_n, param1 ^ 23388);
        var3.b(-1336879960, ((uc) param2).field_j);
        var3.b(-1336879960, ((uc) param2).field_m);
    }

    abstract int e(int param0);

    ag() {
        ((ag) this).field_p = true;
    }

    public static void a(byte param0) {
        if (param0 != 34) {
            field_r = -109;
            field_n = null;
            field_o = null;
            return;
        }
        field_n = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Return to game";
    }
}
