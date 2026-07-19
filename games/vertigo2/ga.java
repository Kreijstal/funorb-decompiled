/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends rl {
    static int[] field_jb;
    static int field_fb;
    static String field_ib;
    static int field_gb;
    static int[] field_hb;

    ga(sd param0, iq param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int[] param0, int param1, int param2) {
        try {
            oj.field_O[param1] = param0;
            if (param2 <= 40) {
                int[] var4 = (int[]) null;
                ga.a((int[]) null, -31, 97);
            }
            fh.field_y[param1] = new fo(param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ga.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void m(int param0) {
        int[] var2 = null;
        field_ib = null;
        field_jb = null;
        if (param0 != 11840) {
          var2 = (int[]) null;
          ga.a((int[]) null, 11, 116);
          field_hb = null;
          return;
        } else {
          field_hb = null;
          return;
        }
    }

    final void a(boolean param0, iq param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_fb = 12;
        field_ib = "Waiting for models";
        field_gb = 50;
    }
}
