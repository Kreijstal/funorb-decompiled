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
        dl var3 = null;
        try {
            var3 = q.field_p;
            var3.g(64, param0);
            var3.b(-1336879960, param1);
            var3.b(-1336879960, 0);
            var3.a(param2.field_n, param1 ^ 23388);
            var3.b(-1336879960, param2.field_j);
            var3.b(-1336879960, param2.field_m);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ag.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int e(int param0);

    ag() {
        this.field_p = true;
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
        field_o = "Return to game";
    }
}
