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
        Object var4 = null;
        oj.field_O[param1] = param0;
        if (param2 <= 40) {
          var4 = null;
          ga.a((int[]) null, -31, 97);
          fh.field_y[param1] = new fo(param1);
          return;
        } else {
          fh.field_y[param1] = new fo(param1);
          return;
        }
    }

    public static void m(int param0) {
        Object var2 = null;
        field_ib = null;
        field_jb = null;
        if (param0 != 11840) {
          var2 = null;
          ga.a((int[]) null, 11, 116);
          field_hb = null;
          return;
        } else {
          field_hb = null;
          return;
        }
    }

    final void a(boolean param0, iq param1) {
        super.a(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = 12;
        field_ib = "Waiting for models";
        field_gb = 50;
    }
}
