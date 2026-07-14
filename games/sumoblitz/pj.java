/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pj extends ms {
    static ts field_n;
    pj field_m;
    pj field_o;
    static int[] field_k;
    static int[] field_q;
    static long field_p;
    long field_l;

    final void c(int param0) {
        if (((pj) this).field_o != null) {
          if (param0 != -5106) {
            field_q = null;
            ((pj) this).field_o.field_m = ((pj) this).field_m;
            ((pj) this).field_m.field_o = ((pj) this).field_o;
            ((pj) this).field_m = null;
            ((pj) this).field_o = null;
            return;
          } else {
            ((pj) this).field_o.field_m = ((pj) this).field_m;
            ((pj) this).field_m.field_o = ((pj) this).field_o;
            ((pj) this).field_m = null;
            ((pj) this).field_o = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void d(int param0) {
        field_n = null;
        field_k = null;
        if (param0 <= 27) {
            return;
        }
        field_q = null;
    }

    protected pj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[1];
        field_p = 20000000L;
        field_k = new int[13];
        field_n = new ts(9, 0, 4, 1);
    }
}
