/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static String field_d;
    static gb field_g;
    static int field_c;
    static int field_f;
    static int[] field_b;
    static int field_e;

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_b = null;
        if (param0 != -62) {
            field_f = 72;
        }
    }

    final static db[] a(int param0) {
        db[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = wizardrun.field_H;
        var1 = new db[wb.field_f];
        if (param0 < 48) {
          return null;
        } else {
          var2 = 0;
          L0: while (true) {
            if (wb.field_f <= var2) {
              eb.a(0);
              return var1;
            } else {
              var1[var2] = new db(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], mf.field_j[var2], ic.field_b);
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
        field_c = 0;
    }
}
