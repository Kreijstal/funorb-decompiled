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

    final static void a(boolean param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        double var11_double = 0.0;
        RuntimeException var11 = null;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double[] var19 = null;
        double[] var20 = null;
        double[] var21 = null;
        double[] var22 = null;
        double[] var23 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
            param3[0] = -140;
            param3[1] = param4;
            param3[2] = param2;
            var11_double = (double)(140 + param1);
            var13 = (double)(-param4 + param5);
            var15 = (double)(-param2 + param7);
            if (!param0) {
              var17 = Math.sqrt(var13 * var13 + var11_double * var11_double + var15 * var15);
              param3[9] = (int)(var11_double / var17 * 65536.0);
              param3[11] = (int)(var15 / var17 * 65536.0);
              param3[10] = (int)(65536.0 * (var13 / var17));
              var23 = new double[3];
              var22 = var23;
              var21 = var22;
              var20 = var21;
              var19 = var20;
              var19[0] = -((double)-1 * var15) + var13 * (double)0;
              var19[1] = var15 * (double)0 - var11_double * (double)0;
              var19[2] = var11_double * (double)-1 - (double)0 * var13;
              var17 = Math.sqrt(var23[2] * var23[2] + (var23[1] * var23[1] + var23[0] * var23[0]));
              param3[5] = (int)(var23[2] / var17 * tg.field_f);
              param3[3] = (int)(var23[0] / var17 * tg.field_f);
              param3[4] = (int)(var23[1] / var17 * tg.field_f);
              var19[0] = -(var15 * (double)param3[4]) + (double)param3[5] * var13;
              var19[1] = -(var11_double * (double)param3[5]) + (double)param3[3] * var15;
              var19[2] = -(var13 * (double)param3[3]) + (double)param3[4] * var11_double;
              var17 = Math.sqrt(var23[2] * var23[2] + (var23[0] * var23[0] + var23[1] * var23[1]));
              param3[6] = (int)(var23[0] / var17 * tg.field_f);
              param3[7] = (int)(var23[1] / var17 * tg.field_f);
              param3[8] = (int)(var23[2] / var17 * tg.field_f);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var11;
            stackOut_4_1 = new StringBuilder().append("hn.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param4 + 44 + param5 + 44 + -140 + 44 + param7 + 44 + 0 + 44 + 0 + 44 + -1 + 41);
        }
    }

    private hn() throws Throwable {
        throw new Error();
    }

    public static void a() {
        field_s = null;
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
          if (var1 >= 256) {
            field_o = 0;
            field_n = -1;
            field_v = 45;
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_r[var1] = var0;
                var1++;
                continue L0;
              } else {
                L2: {
                  if ((var0 & 1) == 1) {
                    var0 = -306674912 ^ var0 >>> 1;
                    break L2;
                  } else {
                    var0 = var0 >>> 1;
                    break L2;
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        }
    }
}
