/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends fa {
    static int field_s;
    static String field_p;
    int field_w;
    static int field_r;
    int field_q;
    static byte[][][] field_o;
    int field_l;
    static u field_k;
    static int field_n;
    int[] field_t;
    int field_u;
    int field_v;
    int field_m;

    public static void e(int param0) {
        field_k = null;
        field_p = null;
        if (param0 != -32301) {
            return;
        }
        field_o = (byte[][][]) null;
    }

    final void a(int[] param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        try {
            this.field_w = param3;
            this.field_t = param0;
            this.field_l = param1;
            this.field_v = param6;
            this.field_m = param5;
            this.field_q = param7;
            this.field_u = param2;
            if (param4 >= -99) {
                int[] var10 = (int[]) null;
                this.a((int[]) null, 104, -115, 98, (byte) -50, -62, -94, 1);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        ql.field_m = -1;
        sd.field_N = false;
    }

    jd() {
    }

    static {
        field_p = "Waiting for extra data";
        field_s = 0;
        field_n = 0;
    }
}
