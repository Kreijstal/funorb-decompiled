/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj extends rc {
    static pk field_q;
    static int field_m;
    int field_n;
    static qk field_p;
    static int field_o;

    abstract boolean g(int param0);

    abstract Object e(byte param0);

    fj(int param0) {
        ((fj) this).field_n = param0;
    }

    final static boolean f() {
        if (hj.field_a < 10) {
            return false;
        }
        if (mi.field_C < 13) {
            return false;
        }
        return true;
    }

    public static void e() {
        field_p = null;
        field_q = null;
    }

    final static void a(byte param0, rh param1, boolean param2, rh param3, rh param4) {
        try {
            ih.field_c = bf.a((byte) 86, "");
            int var5_int = 103;
            ih.field_c.a((byte) -126, false);
            ha.a((byte) 103, param1, param4, param3);
            int discarded$0 = -121;
            qh.h();
            kd.field_b = uf.field_l;
            si.field_g = uf.field_l;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "fj.H(" + 114 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 4;
    }
}
