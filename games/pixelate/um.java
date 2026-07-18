/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends fa {
    static int field_k;
    static int field_r;
    static String field_o;
    byte[] field_n;
    static fb field_q;
    static volatile long field_m;
    static String[] field_l;
    boolean field_p;

    final static void a(int param0, int param1, wg param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10) {
        RuntimeException var11 = null;
        ae[] var11_array = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ae[] var17 = null;
        ae[] var18 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          var17 = new ae[8];
          var18 = var17;
          var11_array = var18;
          var12 = 0;
          L0: while (true) {
            if (var12 >= 8) {
              L1: {
                if (param2.field_f[8] > 0) {
                  w.a(param10, param8 + -param0, var18[1], param4 - param7, var18[0], var18[2], var18[3], param6, (byte) -43, param9);
                  break L1;
                } else {
                  w.a(param10, param8 - param0, var18[4], param4 - param7, var18[5], var18[7], var18[6], param6, (byte) -38, param9);
                  break L1;
                }
              }
              L2: {
                if (param5 <= -85) {
                  break L2;
                } else {
                  um.a(-74);
                  break L2;
                }
              }
              L3: {
                if (param2.field_f[7] <= 0) {
                  w.a(param10, param3 + -param1, var18[7], -param0 + param8, var18[3], var18[2], var18[6], param6, (byte) -104, param9);
                  break L3;
                } else {
                  w.a(param10, param3 - param1, var18[4], -param0 + param8, var18[0], var18[1], var18[5], param6, (byte) -125, param9);
                  break L3;
                }
              }
              if (param2.field_f[6] > 0) {
                w.a(param10, param4 - param7, var18[4], param3 - param1, var18[6], var18[2], var18[0], param6, (byte) -118, param9);
                return;
              } else {
                w.a(param10, param4 - param7, var18[1], param3 - param1, var18[3], var18[7], var18[5], param6, (byte) -96, param9);
                return;
              }
            } else {
              L4: {
                if ((1 & var12) == 0) {
                  stackOut_5_0 = param0;
                  stackIn_6_0 = stackOut_5_0;
                  break L4;
                } else {
                  stackOut_4_0 = param8;
                  stackIn_6_0 = stackOut_4_0;
                  break L4;
                }
              }
              L5: {
                var13 = stackIn_6_0;
                if ((var12 & 2) == 0) {
                  stackOut_8_0 = param7;
                  stackIn_9_0 = stackOut_8_0;
                  break L5;
                } else {
                  stackOut_7_0 = param4;
                  stackIn_9_0 = stackOut_7_0;
                  break L5;
                }
              }
              L6: {
                var14 = stackIn_9_0;
                if ((var12 & 4) != 0) {
                  stackOut_11_0 = param3;
                  stackIn_12_0 = stackOut_11_0;
                  break L6;
                } else {
                  stackOut_10_0 = param1;
                  stackIn_12_0 = stackOut_10_0;
                  break L6;
                }
              }
              var15 = stackIn_12_0;
              var11_array[var12] = new ae(var13 * 2 + -2 << 12, var14 * 2 - 2 << 12, var15 * 2 - 2 << 12);
              var17[var12] = param2.a(var17[var12], (byte) 83);
              var12++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var11;
            stackOut_25_1 = new StringBuilder().append("um.B(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final static tc a(fm param0, fm param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        tc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (rk.a(param4, false, param0, param2)) {
              int discarded$2 = -17;
              stackOut_3_0 = kf.a(param1.a(param2, param4, true));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("um.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + 121 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_o = null;
        int var1 = -127 / ((param0 - 74) / 32);
        field_q = null;
        field_l = null;
    }

    um() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0L;
        field_l = new String[]{"You can also use the '<col=ffff00>W</col>', '<col=ffff00>A</col>', '<col=ffff00>S</col>' and '<col=ffff00>D</col>' keys to move your piece.<br>Press '<col=ffff00>X</col>' to rotate your piece."};
    }
}
