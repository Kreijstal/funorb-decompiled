/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends da {
    int field_s;
    static int field_r;
    static int[] field_o;
    static ra field_m;
    int field_n;
    static int[] field_k;
    int field_q;
    int[] field_j;
    int field_p;
    int field_i;
    int field_l;

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_k = null;
    }

    final void a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7) {
        if (param4 != -8) {
            return;
        }
        try {
            ((kd) this).field_p = param0;
            ((kd) this).field_j = param2;
            ((kd) this).field_s = param3;
            ((kd) this).field_n = param6;
            ((kd) this).field_q = param5;
            ((kd) this).field_i = param7;
            ((kd) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "kd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    kd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[8192];
        field_k = new int[5];
    }
}
