/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends pi {
    int field_t;
    static int field_u;
    static String[][] field_v;
    int field_o;
    static boolean field_p;
    int field_q;
    int field_r;
    int field_s;
    static int field_x;
    static int field_w;
    int[] field_y;
    int field_n;

    public static void a() {
        field_v = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        ((nk) this).field_q = param5;
        ((nk) this).field_s = param0;
        ((nk) this).field_o = param6;
        ((nk) this).field_r = param1;
        if (param3 != 0) {
            return;
        }
        try {
            ((nk) this).field_y = param7;
            ((nk) this).field_t = param2;
            ((nk) this).field_n = param4;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "nk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    nk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[][]{new String[1]};
        field_w = 0;
        field_p = false;
    }
}
