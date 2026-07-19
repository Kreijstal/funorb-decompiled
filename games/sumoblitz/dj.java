/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends ms {
    mf field_q;
    static String field_o;
    static String[] field_r;
    static hr field_l;
    static int field_n;
    ms field_k;
    int field_p;
    static Object field_m;

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        var2 = 90 / ((30 - param0) / 44);
        if (-2 != (param1 ^ -1)) {
          if (param1 == 7) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        boolean discarded$2 = false;
        field_l = null;
        if (param0 != 1022768328) {
          discarded$2 = dj.a(-56, -102);
          field_o = null;
          field_m = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_m = null;
          field_r = null;
          return;
        }
    }

    dj(mf param0, ms param1) {
        try {
            this.field_q = param0;
            this.field_p = param0.g();
            this.field_k = param1;
            this.field_q.f(128 + this.field_p * kr.field_c >> 1022768328);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Full screen";
        field_r = new String[]{"All scores", "My scores", "Best each"};
    }
}
