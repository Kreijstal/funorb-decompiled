/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_c;
    static int[] field_d;
    static String[] field_b;
    static int field_a;

    final static ma a(dj param0, int param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        ma stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = param0.a(param1, (byte) 41);
            var3 = var4;
            if (var4 != null) {
              field_a = -35;
              stackOut_3_0 = new ma(var4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ma) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("vk.A(");
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
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    public static void a() {
        int var1 = 22;
        field_d = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static on a(byte param0, byte[] param1) {
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
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        Object stackIn_6_0 = null;
        on stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        on stackOut_19_0 = null;
        Object stackOut_5_0 = null;
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
              int incrementValue$12 = var2_int;
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
            int incrementValue$13 = var2_int;
            var2_int++;
            var5 = md.a(incrementValue$13, param1, 91);
            int incrementValue$14 = var2_int;
            var2_int++;
            var6 = md.a(incrementValue$14, param1, 75);
            var32 = new int[4];
            var28 = var32;
            var24 = var28;
            var20 = var24;
            var7 = var20;
            var33 = new int[4];
            var29 = var33;
            var25 = var29;
            var21 = var25;
            var8 = var21;
            if (param0 <= -22) {
              var9 = 0;
              L2: while (true) {
                if (4 <= var9) {
                  int incrementValue$15 = var2_int;
                  var2_int++;
                  var9 = md.a(incrementValue$15, param1, 86);
                  int incrementValue$16 = var2_int;
                  var2_int++;
                  var10 = md.a(incrementValue$16, param1, 55);
                  int incrementValue$17 = var2_int;
                  var2_int++;
                  var11 = md.a(incrementValue$17, param1, 107);
                  int incrementValue$18 = var2_int;
                  var2_int++;
                  var12 = md.a(incrementValue$18, param1, 76);
                  var30 = new int[var12][var11];
                  var14 = 0;
                  L3: while (true) {
                    if (var14 >= var12) {
                      int incrementValue$19 = var2_int;
                      var2_int++;
                      var14 = md.a(incrementValue$19, param1, 79);
                      var31 = new int[4 * var14];
                      var27 = var31;
                      var23 = var27;
                      var19 = var23;
                      var15 = var19;
                      var16 = 0;
                      L4: while (true) {
                        if (4 * var14 <= var16) {
                          stackOut_19_0 = new on(var30, var31, var3, var5, var6, var32, var33, var9, var10, var4 != 0);
                          stackIn_20_0 = stackOut_19_0;
                          break L0;
                        } else {
                          int incrementValue$20 = var2_int;
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
                          int incrementValue$21 = var2_int;
                          var2_int++;
                          var30[var14][var15_int] = md.a(incrementValue$21, param1, 94);
                          var15_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  int incrementValue$22 = var2_int;
                  var2_int++;
                  var7[var9] = md.a(incrementValue$22, param1, 59);
                  int incrementValue$23 = var2_int;
                  var2_int++;
                  var8[var9] = md.a(incrementValue$23, param1, 119);
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (on) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("vk.C(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    static {
    }
}
