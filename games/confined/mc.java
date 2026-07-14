/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static long field_a;
    static int field_c;
    static ln field_d;
    static boolean[] field_e;
    static double[] field_b;

    final static boolean a(int param0, int param1, mi param2, byte param3) {
        byte[] var4 = null;
        Object var5 = null;
        byte[] var6 = null;
        var6 = param2.a((byte) -2, param1, param0);
        var4 = var6;
        if (var6 == null) {
          return false;
        } else {
          if (param3 != 119) {
            var5 = null;
            boolean discarded$2 = mc.a(68, 108, (mi) null, (byte) -5);
            lc.a(false, var6);
            return true;
          } else {
            lc.a(false, var6);
            return true;
          }
        }
    }

    final static String a(int param0) {
        if (oe.field_Q == wh.field_fb) {
          return jb.field_o;
        } else {
          if (wh.field_fb == na.field_S) {
            return ee.field_F;
          } else {
            if (!fb.field_a.c(param0 ^ 17221)) {
              return ee.field_F;
            } else {
              if (param0 != 16) {
                return null;
              } else {
                return kj.field_c;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 58) {
          field_a = -117L;
          field_b = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new boolean[112];
        field_d = new ln();
        field_b = new double[]{16.0, -672.0, -16.0};
    }
}
