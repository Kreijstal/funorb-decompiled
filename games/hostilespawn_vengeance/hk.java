/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends am {
    static String field_k;
    static bd field_h;
    static boolean field_q;
    int field_r;
    int field_p;
    int field_o;
    int[] field_i;
    int field_n;
    static String field_l;
    int field_j;
    int field_m;

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_n = param2;
            this.field_p = param7;
            if (param3 != -12131) {
                hk.c(39);
            }
            this.field_o = param4;
            this.field_r = param5;
            this.field_j = param0;
            this.field_i = param1;
            this.field_m = param6;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "hk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    hk() {
    }

    public static void c(int param0) {
        if (param0 != -20150) {
          hk.c(76);
          field_l = null;
          field_k = null;
          field_h = null;
          return;
        } else {
          field_l = null;
          field_k = null;
          field_h = null;
          return;
        }
    }

    static {
        field_q = true;
        field_k = "<img=0> open TAC-COM";
        field_l = "Play the game without logging in just yet";
    }
}
