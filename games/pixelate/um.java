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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae[] var11 = null;
        RuntimeException var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ae[] var17 = null;
        ae[] var18 = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          var17 = new ae[8];
          var18 = var17;
          var11 = var18;
          var12 = 0;
          L0: while (true) {
            if (-9 >= (var12 ^ -1)) {
              L1: {
                if ((param2.field_f[8] ^ -1) < -1) {
                  w.a(param10, param8 + -param0, var18[1], param4 - param7, var18[0], var18[2], var18[3], param6, (byte) -43, param9);
                  break L1;
                } else {
                  w.a(param10, param8 - param0, var17[4], param4 - param7, var17[5], var17[7], var17[6], param6, (byte) -38, param9);
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
              if ((param2.field_f[6] ^ -1) < -1) {
                w.a(param10, param4 - param7, var18[4], param3 - param1, var18[6], var18[2], var18[0], param6, (byte) -118, param9);
                return;
              } else {
                w.a(param10, param4 - param7, var18[1], param3 - param1, var18[3], var18[7], var18[5], param6, (byte) -96, param9);
                return;
              }
            } else {
              L4: {
                if (-1 == (1 & var12 ^ -1)) {
                  stackIn_8_0 = param0;
                  break L4;
                } else {
                  stackIn_8_0 = param8;
                  break L4;
                }
              }
              L5: {
                var13 = stackIn_8_0;
                if ((var12 & 2) == 0) {
                  stackIn_11_0 = param7;
                  break L5;
                } else {
                  stackIn_11_0 = param4;
                  break L5;
                }
              }
              L6: {
                var14 = stackIn_11_0;
                if (-1 != (var12 & 4 ^ -1)) {
                  stackIn_14_0 = param3;
                  break L6;
                } else {
                  stackIn_14_0 = param1;
                  break L6;
                }
              }
              var15 = stackIn_14_0;
              var11[var12] = new ae(var13 * 2 + -2 << 1723923724, var14 * 2 - 2 << -1870995476, var15 * 2 - 2 << -1920762580);
              var17[var12] = param2.a(var17[var12], (byte) 83);
              var12++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var11_ref);

            stackIn_29_1 = new StringBuilder().append("um.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final static tc a(fm param0, fm param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        tc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 54) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            if (rk.a(param4, false, param0, param2)) {
              stackIn_6_0 = kf.a(param1.a(param2, param4, true), -17);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("um.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tc) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
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
        field_m = 0L;
        field_l = new String[]{"You can also use the '<col=ffff00>W</col>', '<col=ffff00>A</col>', '<col=ffff00>S</col>' and '<col=ffff00>D</col>' keys to move your piece.<br>Press '<col=ffff00>X</col>' to rotate your piece."};
    }
}
