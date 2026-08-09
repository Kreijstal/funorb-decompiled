/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jk {
    static me field_b;
    static String field_a;

    final static int[] a(int param0, int[] param1, int param2, int[] param3) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        int[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
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
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1.length == param3.length) {
              L1: {
                if (param3.length != 0) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              L2: {


                if (param1.length != 0) {

                  stackIn_9_1 = 0;
                  break L2;
                } else {

                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              if ((stackIn_6_0 | stackIn_9_1) == 0) {
                var4 = new int[param0 * param3.length];
                var5 = 0;
                L3: while (true) {
                  if (param3.length <= var5) {
                    L4: {
                      if (param2 >= 122) {
                        break L4;
                      } else {
                        field_a = (String) null;
                        break L4;
                      }
                    }
                    stackIn_21_0 = (int[]) (var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var6 = 16711680 & param3[var5];
                    var7 = param3[var5] & 65280;
                    var8 = param3[var5] & 255;
                    var9 = param1[var5] & 16711680;
                    var10 = 65280 & param1[var5];
                    var11 = 255 & param1[var5];
                    var12 = 0;
                    L5: while (true) {
                      if (var12 >= param0) {
                        var5++;
                        continue L3;
                      } else {
                        var13 = 16711680 & (-var12 + param0) * var6 / param0 + var12 * var9 / param0;
                        var14 = 65280 & var10 * var12 / param0 + (-var12 + param0) * var7 / param0;
                        var15 = var12 * var11 / param0 - -((-var12 + param0) * var8 / param0) & 255;
                        var4[param0 * var5 + var12] = oe.c(oe.c(var15, var13), var14);
                        var12++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4_ref);

            stackIn_24_1 = new StringBuilder().append("jk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (int[]) ((Object) stackIn_11_0);
        } else {
          return stackIn_21_0;
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
            if (param0 > 64) {
              try {
                L0: {
                  stackIn_3_0 = (el) (Class.forName("sv").newInstance());
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return (el) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Hide tutorial";
        field_b = new me(0, 2, 2, 1);
    }
}
