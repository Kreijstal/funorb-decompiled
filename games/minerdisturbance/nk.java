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

    public static void a(int param0) {
        if (param0 != 0) {
            field_x = -23;
            field_v = (String[][]) null;
            return;
        }
        field_v = (String[][]) null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        this.field_q = param5;
        this.field_s = param0;
        this.field_o = param6;
        this.field_r = param1;
        if (param3 != 0) {
            return;
        }
        try {
            this.field_y = param7;
            this.field_t = param2;
            this.field_n = param4;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "nk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    nk() {
    }

    static {
        field_v = new String[][]{new String[]{"Gas is poisonous - without a gas mask, Moin will choke if he is exposed to it. Gas is also highly explosive, so be careful!"}};
        field_w = 0;
        field_p = false;
    }
}
