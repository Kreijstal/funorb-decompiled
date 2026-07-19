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
        double var11_double = 0.0;
        RuntimeException var11 = null;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double[] var19 = null;
        double[] var20 = null;
        double[] var21 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            param3[0] = param6;
            param3[1] = param4;
            param3[2] = param2;
            var11_double = (double)(-param6 + param1);
            var13 = (double)(-param4 + param5);
            var15 = (double)(-param2 + param7);
            if (!param0) {
              var17 = Math.sqrt(var13 * var13 + var11_double * var11_double + var15 * var15);
              param3[9] = (int)(var11_double / var17 * 65536.0);
              param3[11] = (int)(var15 / var17 * 65536.0);
              param3[10] = (int)(65536.0 * (var13 / var17));
              var21 = new double[3];
              var20 = var21;
              var19 = var20;
              var19[0] = -((double)param10 * var15) + var13 * (double)param9;
              var19[1] = var15 * (double)param8 - var11_double * (double)param9;
              var19[2] = var11_double * (double)param10 - (double)param8 * var13;
              var17 = Math.sqrt(var21[2] * var21[2] + (var21[1] * var21[1] + var21[0] * var21[0]));
              param3[5] = (int)(var21[2] / var17 * tg.field_f);
              param3[3] = (int)(var21[0] / var17 * tg.field_f);
              param3[4] = (int)(var21[1] / var17 * tg.field_f);
              var19[0] = -(var15 * (double)param3[4]) + (double)param3[5] * var13;
              var19[1] = -(var11_double * (double)param3[5]) + (double)param3[3] * var15;
              var19[2] = -(var13 * (double)param3[3]) + (double)param3[4] * var11_double;
              var17 = Math.sqrt(var21[2] * var21[2] + (var21[0] * var21[0] + var21[1] * var21[1]));
              param3[6] = (int)(var21[0] / var17 * tg.field_f);
              param3[7] = (int)(var21[1] / var17 * tg.field_f);
              param3[8] = (int)(var21[2] / var17 * tg.field_f);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var11);
            stackOut_4_1 = new StringBuilder().append("hn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
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
        field_u = (String[][]) null;
        field_r = null;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_u = new String[][]{new String[]{"Paint blocks purple!"}, new String[]{"Coins = Points!!"}, new String[]{"Fan = Highjump!"}, new String[]{"Double Tap jump = use jetpack!", "Glue Block = No jump!"}, new String[]{"Teleport to reach top!", "Break cracked blocks to finish!"}, new String[]{"Press <img=14> / <img=15> rotate camera!", "Land on bomb block to detonate!"}, new String[]{"Press <img=6> / <img=13> to use dynamite!", "Stars are checkpoints for the level!"}, new String[]{"Skull block = Death!", "Collect 1-Up for extra life!"}, new String[]{"Use up blue paint!", "Compass = level view!"}, new String[]{"Puller block will attract you!", "Paint phasing block when solid!"}};
            field_r = new int[256];
            var1 = 0;
            L0: while (true) {
              if ((var1 ^ -1) <= -257) {
                field_o = 0;
                field_n = -1;
                field_v = 45;
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_r[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (-2 == (var0 & 1 ^ -1)) {
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
}
