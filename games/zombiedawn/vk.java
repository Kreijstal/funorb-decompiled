/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_c;
    static int[] field_d;
    static String[] field_b;
    static int field_a;

    final static ma a(dj param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        ma stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = param0.a(param1, (byte) 41);
            var3 = var4;
            if (var4 != null) {
              L1: {
                if (param2 == 0) {
                  break L1;
                } else {
                  field_a = -35;
                  break L1;
                }
              }
              stackOut_5_0 = new ma(var4);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("vk.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ma) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(byte param0) {
        int var1 = 22 / ((-31 - param0) / 57);
        field_d = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static on a(byte param0, byte[] param1) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        on stackIn_6_0 = null;
        on stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        on stackOut_19_0 = null;
        on stackOut_5_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var17 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2_int = 1;
              incrementValue$12 = var2_int;
              var2_int++;
              var3 = md.a(incrementValue$12, param1, 49);
              var4 = 0;
              if (0 != (4096 & var3)) {
                var4 = 1;
                var3 = var3 & -4097;
                break L1;
              } else {
                break L1;
              }
            }
            incrementValue$13 = var2_int;
            var2_int++;
            var5 = md.a(incrementValue$13, param1, 91);
            incrementValue$14 = var2_int;
            var2_int++;
            var6 = md.a(incrementValue$14, param1, 75);
            var24 = new int[4];
            var20 = var24;
            var7 = var20;
            var25 = new int[4];
            var21 = var25;
            var8 = var21;
            if (param0 <= -22) {
              var9 = 0;
              L2: while (true) {
                if (4 <= var9) {
                  incrementValue$15 = var2_int;
                  var2_int++;
                  var9 = md.a(incrementValue$15, param1, 86);
                  incrementValue$16 = var2_int;
                  var2_int++;
                  var10 = md.a(incrementValue$16, param1, 55);
                  incrementValue$17 = var2_int;
                  var2_int++;
                  var11 = md.a(incrementValue$17, param1, 107);
                  incrementValue$18 = var2_int;
                  var2_int++;
                  var12 = md.a(incrementValue$18, param1, 76);
                  var27 = new int[var12][var11];
                  var14 = 0;
                  L3: while (true) {
                    if (var14 >= var12) {
                      incrementValue$19 = var2_int;
                      var2_int++;
                      var14 = md.a(incrementValue$19, param1, 79);
                      var23 = new int[4 * var14];
                      var19 = var23;
                      var15 = var19;
                      var16 = 0;
                      L4: while (true) {
                        if (4 * var14 <= var16) {
                          stackOut_19_0 = new on(var27, var23, var3, var5, var6, var24, var25, var9, var10, var4 != 0);
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          incrementValue$20 = var2_int;
                          var2_int++;
                          var15[var16] = md.a(incrementValue$20, param1, 76);
                          var16++;
                          continue L4;
                        }
                      }
                    } else {
                      var15_int = 0;
                      L5: while (true) {
                        if (var11 <= var15_int) {
                          var14++;
                          continue L3;
                        } else {
                          incrementValue$21 = var2_int;
                          var2_int++;
                          var27[var14][var15_int] = md.a(incrementValue$21, param1, 94);
                          var15_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  incrementValue$22 = var2_int;
                  var2_int++;
                  var7[var9] = md.a(incrementValue$22, param1, 59);
                  incrementValue$23 = var2_int;
                  var2_int++;
                  var8[var9] = md.a(incrementValue$23, param1, 119);
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackOut_5_0 = (on) null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("vk.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_20_0;
        }
    }

    static {
    }
}
