/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends li {
    byte[] field_p;
    int field_q;
    static String[][] field_u;
    static int[] field_r;
    static int field_w;
    static int[] field_s;
    static int field_v;
    static volatile int field_o;
    static int field_n;
    static boolean field_t;

    final static void a(boolean param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double[] var19 = null;
        double[] var20 = null;
        double[] var21 = null;
        double[] var22 = null;
        double[] var23 = null;
        param3[0] = param6;
        param3[1] = param4;
        param3[2] = param2;
        var11 = (double)(-param6 + param1);
        var13 = (double)(-param4 + param5);
        var15 = (double)(-param2 + param7);
        if (!param0) {
          var17 = Math.sqrt(var13 * var13 + var11 * var11 + var15 * var15);
          param3[9] = (int)(var11 / var17 * 65536.0);
          param3[11] = (int)(var15 / var17 * 65536.0);
          param3[10] = (int)(65536.0 * (var13 / var17));
          var23 = new double[3];
          var22 = var23;
          var21 = var22;
          var20 = var21;
          var19 = var20;
          var19[0] = -((double)param10 * var15) + var13 * (double)param9;
          var19[1] = var15 * (double)param8 - var11 * (double)param9;
          var19[2] = var11 * (double)param10 - (double)param8 * var13;
          var17 = Math.sqrt(var23[2] * var23[2] + (var23[1] * var23[1] + var23[0] * var23[0]));
          param3[5] = (int)(var23[2] / var17 * tg.field_f);
          param3[3] = (int)(var23[0] / var17 * tg.field_f);
          param3[4] = (int)(var23[1] / var17 * tg.field_f);
          var19[0] = -(var15 * (double)param3[4]) + (double)param3[5] * var13;
          var19[1] = -(var11 * (double)param3[5]) + (double)param3[3] * var15;
          var19[2] = -(var13 * (double)param3[3]) + (double)param3[4] * var11;
          var17 = Math.sqrt(var23[2] * var23[2] + (var23[0] * var23[0] + var23[1] * var23[1]));
          param3[6] = (int)(var23[0] / var17 * tg.field_f);
          param3[7] = (int)(var23[1] / var17 * tg.field_f);
          param3[8] = (int)(var23[2] / var17 * tg.field_f);
          return;
        } else {
          return;
        }
    }

    private hn() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_s = null;
        if (param0 < 10) {
            return;
        }
        field_u = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_u = new String[][]{new String[1], new String[1], new String[1], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2]};
        field_r = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 <= -257) {
            field_o = 0;
            field_n = -1;
            field_v = 45;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_r[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 == (var0 & 1)) {
                  var0 = -306674912 ^ var0 >>> 1631993793;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
