/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fgb extends fh {
    static gnb field_k;
    static llb field_l;
    static long[] field_m;

    public static void a(int param0) {
        field_l = null;
        if (param0 != 8) {
            field_m = null;
            field_k = null;
            field_m = null;
            return;
        }
        field_k = null;
        field_m = null;
    }

    fgb() {
    }

    final static void a(int param0, int param1, lsa param2) {
        faa var3 = null;
        Object var4 = null;
        if (param0 <= 13) {
          var4 = null;
          fgb.a(-2, -20, (lsa) null);
          var3 = dpa.field_p;
          var3.h(24335, param1);
          var3.c(0, param2.field_g);
          var3.a(param2.field_d, true);
          return;
        } else {
          var3 = dpa.field_p;
          var3.h(24335, param1);
          var3.c(0, param2.field_g);
          var3.a(param2.field_d, true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new gnb(8);
    }
}
