/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends ms {
    int field_u;
    static int field_k;
    static ri[] field_l;
    static int field_n;
    int field_t;
    int field_p;
    int[] field_v;
    int field_r;
    int field_s;
    static int field_q;
    static ri field_o;
    int field_m;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 480) {
            rl.a(99);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final void a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7) {
        ((rl) this).field_v = param2;
        ((rl) this).field_r = param5;
        ((rl) this).field_s = param6;
        if (param4 >= -53) {
            return;
        }
        try {
            ((rl) this).field_p = param7;
            ((rl) this).field_u = param3;
            ((rl) this).field_m = param1;
            ((rl) this).field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "rl.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    rl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 480;
    }
}
