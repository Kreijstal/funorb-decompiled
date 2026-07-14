/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static boolean field_c;
    static boolean field_d;
    static String field_b;
    static boolean field_a;

    final static boolean a(bf param0, boolean param1, String param2, int param3, String param4, boolean param5, String param6) {
        qc var8 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (dn.field_q != vn.field_g) {
          return false;
        } else {
          var8 = new qc(bo.field_F, param0);
          bo.field_F.b((hm) (Object) var8, 48);
          if (!ei.d(1000)) {
            L0: {
              gf.field_a = param3;
              if (!param5) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            hf.field_a = stackIn_11_0 != 0;
            nf.field_y = null;
            mf.field_b = param4;
            dn.field_q = dg.field_o;
            tf.field_h = param6;
            kl.field_o = param2;
            if (param1) {
              return false;
            } else {
              return true;
            }
          } else {
            var8.s(248);
            if (param1) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 32153) {
            field_a = false;
        }
    }

    final static lm a(int param0) {
        if (param0 != -16055) {
            e.b(108);
            if (dn.field_q == vn.field_g) {
                throw new IllegalStateException();
            }
            if (!(ia.field_y != dn.field_q)) {
                dn.field_q = vn.field_g;
                return nf.field_y;
            }
            return null;
        }
        if (dn.field_q == vn.field_g) {
            throw new IllegalStateException();
        }
        if (!(ia.field_y != dn.field_q)) {
            dn.field_q = vn.field_g;
            return nf.field_y;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = true;
    }
}
