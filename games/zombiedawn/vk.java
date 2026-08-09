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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = new ma(var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("vk.A(");

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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        on stackIn_6_0 = null;
        on stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var17 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2_int = 1;
              incrementValue$0 = var2_int;
              var2_int++;
              var3 = md.a(incrementValue$0, param1, 49);
              var4 = 0;
              if (0 != (4096 & var3)) {
                var4 = 1;
                var3 = var3 & -4097;
                break L1;
              } else {
                break L1;
              }
            }
            incrementValue$1 = var2_int;
            var2_int++;
            var5 = md.a(incrementValue$1, param1, 91);
            incrementValue$2 = var2_int;
            var2_int++;
            var6 = md.a(incrementValue$2, param1, 75);
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
                  incrementValue$3 = var2_int;
                  var2_int++;
                  var9 = md.a(incrementValue$3, param1, 86);
                  incrementValue$4 = var2_int;
                  var2_int++;
                  var10 = md.a(incrementValue$4, param1, 55);
                  incrementValue$5 = var2_int;
                  var2_int++;
                  var11 = md.a(incrementValue$5, param1, 107);
                  incrementValue$6 = var2_int;
                  var2_int++;
                  var12 = md.a(incrementValue$6, param1, 76);
                  var27 = new int[var12][var11];
                  var14 = 0;
                  L3: while (true) {
                    if (var14 >= var12) {
                      incrementValue$7 = var2_int;
                      var2_int++;
                      var14 = md.a(incrementValue$7, param1, 79);
                      var23 = new int[4 * var14];
                      var19 = var23;
                      var15 = var19;
                      var16 = 0;
                      L4: while (true) {
                        if (4 * var14 <= var16) {
                          stackIn_20_0 = new on(var27, var23, var3, var5, var6, var24, var25, var9, var10, var4 != 0);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          incrementValue$8 = var2_int;
                          var2_int++;
                          var15[var16] = md.a(incrementValue$8, param1, 76);
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
                          incrementValue$9 = var2_int;
                          var2_int++;
                          var27[var14][var15_int] = md.a(incrementValue$9, param1, 94);
                          var15_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  incrementValue$10 = var2_int;
                  var2_int++;
                  var7[var9] = md.a(incrementValue$10, param1, 59);
                  incrementValue$11 = var2_int;
                  var2_int++;
                  var8[var9] = md.a(incrementValue$11, param1, 119);
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackIn_6_0 = (on) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("vk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
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
