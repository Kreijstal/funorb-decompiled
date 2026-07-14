/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static String field_c;
    static int[] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 > -45) {
            hl.a((byte) 46);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static double[] a(double param0, double[] param1, boolean param2, int param3, boolean param4, boolean param5, double param6, double param7, hc param8, double[] param9, double[] param10) {
        int[] var14 = null;
        int[] var15 = null;
        double[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        double[] var20 = null;
        double[] var21 = null;
        double[] var22 = null;
        double[] var23 = null;
        var18 = Torquing.field_u;
        var19 = new int[]{6, 3, 3, 6};
        var14 = var19;
        var15 = new int[]{2, 2, 1, 1};
        dk.a(param9, 0, mf.field_z, 0, param9.length);
        if (param3 == -6076) {
          var23 = new double[13];
          var22 = var23;
          var21 = var22;
          var20 = var21;
          var16 = var20;
          dk.a(param9, 0, var16, 0, param9.length);
          bd.c(0);
          var17 = 0;
          L0: while (true) {
            if (4 > var17) {
              L1: {
                kp.a(param7, 72, param6, mf.field_z, param8);
                gm.a(param4, param10, -128, param6, param1, param0, param5, mf.field_z, hf.field_b, param2);
                if (1 == qd.field_d) {
                  break L1;
                } else {
                  if ((qd.field_d ^ -1) == -4) {
                    break L1;
                  } else {
                    ap.a(param0 / (double)var19[var17], hf.field_b, var23);
                    ap.a(param9, param0 / (double)var15[var17], hf.field_b, mf.field_z);
                    df.a(param3 ^ -6073, mf.field_z);
                    var17++;
                    continue L0;
                  }
                }
              }
              ap.a(mf.field_z, param0, hf.field_b, var23);
              aj.a((byte) -56, param2, param9, param7);
              df.a(3, var23);
              return var16;
            } else {
              aj.a((byte) -56, param2, param9, param7);
              df.a(3, var23);
              return var16;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_c = "<col=2>Note:</col> for the gyro key to work, you must have collected a gyroscope, as described below.";
    }
}
