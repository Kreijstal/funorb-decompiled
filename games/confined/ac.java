/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static double[] field_c;
    static volatile boolean field_a;
    static int field_b;

    public static void a(byte param0) {
        if (param0 != -54) {
            ac.a(false);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(boolean param0) {
        kc.field_o = false;
        bg.field_a = null;
        bj.field_m = param0 ? true : false;
        da.field_e = null;
        va.field_b = null;
        gh.field_k = false;
        ji.field_e = null;
        qf.field_e = false;
        hh.field_d = null;
        rh.field_X = 0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        ii.a((java.awt.Component) (Object) param0, 30);
        if (param1 >= -72) {
          return;
        } else {
          L0: {
            fa.a(false, (java.awt.Component) (Object) param0);
            if (null != jc.field_c) {
              jc.field_c.a((java.awt.Component) (Object) param0, 4);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_c = new double[]{-708.0, -328.0, 156.0, 704.0, -344.0, 156.0, -744.0, 308.0, 260.0, 740.0, 292.0, 260.0};
    }
}
