/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int[] field_f;
    static String[][] field_g;
    static String field_a;
    static String field_b;
    static String field_d;
    static String field_e;
    static ot[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0 == -72) {
            return;
        }
        ca.a((byte) -95);
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        var2.b(param1, (byte) 119);
        var2.a(124, 2);
        var2.a(105, 4);
        var2.a(124, cq.a(1315216324));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = Kickabout.field_G;
        try {
          L0: {
            L1: while (true) {
              param6--;
              if (0 > param6) {
                break L0;
              } else {
                var17 = param9;
                var10 = var17;
                var11 = param2;
                var12 = param4;
                var13 = param8;
                var14 = param3;
                var15 = 8355711 & var17[var11] >> 1;
                var10[var11] = qj.b(var13 >> 9, 65280) - -qj.b(var12 >> 1, 16711680) + qj.b(255, var14 >> 17) + var15;
                param8 = param8 + param1;
                param3 = param3 + param7;
                param2++;
                param4 = param4 + param0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10_ref;
            stackOut_6_1 = new StringBuilder().append("ca.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(545806977).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param9 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a(vc param0, int param1) {
        try {
            np.field_Jb.a((gn) (Object) new hk(param0, 37), param1 ^ 252);
            if (param1 != 255) {
                Object var3 = null;
                ca.a((vc) null, 5);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ca.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        if (param1 != 160) {
          if (param1 != 32) {
            L0: {
              if (param1 == 95) {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              } else {
                if (param1 != 45) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return stackIn_9_0 != 0;
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{3, 4, 3, 4, 5, 3, 4, 3, 3, 4, 3, 3, 4, 3, 3, 4, 5, 4, 4, 3, 1};
        field_b = "Macroing or use of bots";
        field_e = "You have not yet unlocked this option for use.";
        field_d = "Auction Info";
        field_a = "park";
    }
}
