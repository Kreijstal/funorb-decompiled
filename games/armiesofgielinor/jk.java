/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jk {
    static me field_b;
    static String field_a;

    final static int[] a(int param0, int[] param1, int param2, int[] param3) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1.length == param3.length) {
          L0: {
            if (param3.length != 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = stackIn_5_0;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (param1.length != 0) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          if ((stackIn_8_0 | stackIn_8_1) == 0) {
            var4 = new int[param0 * param3.length];
            var5 = 0;
            L2: while (true) {
              if (param3.length <= var5) {
                L3: {
                  if (param2 >= 122) {
                    break L3;
                  } else {
                    field_a = null;
                    break L3;
                  }
                }
                return var4;
              } else {
                var6 = 16711680 & param3[var5];
                var7 = param3[var5] & 65280;
                var8 = param3[var5] & 255;
                var9 = param1[var5] & 16711680;
                var10 = 65280 & param1[var5];
                var11 = 255 & param1[var5];
                var12 = 0;
                L4: while (true) {
                  if (var12 >= param0) {
                    var5++;
                    continue L2;
                  } else {
                    var13 = 16711680 & (-var12 + param0) * var6 / param0 + var12 * var9 / param0;
                    var14 = 65280 & var10 * var12 / param0 + (-var12 + param0) * var7 / param0;
                    var15 = var12 * var11 / param0 - -((-var12 + param0) * var8 / param0) & 255;
                    var4[param0 * var5 + var12] = oe.c(oe.c(var15, var13), var14);
                    var12++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        int var1 = 15 % ((48 - param0) / 35);
        field_b = null;
        field_a = null;
    }

    final static el b(int param0) {
        try {
            Throwable var1 = null;
            el stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            el stackOut_2_0 = null;
            if (param0 > 64) {
              try {
                stackOut_2_0 = (el) Class.forName("sv").newInstance();
                stackIn_3_0 = stackOut_2_0;
              } catch (java.lang.Throwable decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return (el) (Object) stackIn_3_0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hide tutorial";
        field_b = new me(0, 2, 2, 1);
    }
}
