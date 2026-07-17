/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ew {
    static String field_b;
    static ou field_e;
    static int[] field_a;
    static je field_d;
    static String field_c;

    final static nj a(byte param0, wk param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        nj var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        nj stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.field_y;
              var3 = param1.field_v;
              var4 = param1.field_B;
              var5 = var2_int >> 2;
              var6 = var3 >> 2;
              if (param0 == 107) {
                break L1;
              } else {
                var21 = null;
                rn discarded$1 = ew.a((String) null, (byte) 84);
                break L1;
              }
            }
            var7 = new nj(var5, var6);
            var25 = var7.field_B;
            var24 = var25;
            var23 = var24;
            var22 = var23;
            var8 = var22;
            var9 = 0;
            L2: while (true) {
              if (~var3 >= ~var9) {
                stackOut_23_0 = (nj) var7;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                var10 = var9 * var2_int;
                var11 = var5 * (var9 >> 2);
                var12 = 0;
                L3: while (true) {
                  if (~var2_int >= ~var12) {
                    var9 += 4;
                    continue L2;
                  } else {
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                    var18 = 0;
                    L4: while (true) {
                      if (var18 >= 4) {
                        L5: {
                          var18 = var17 << 4;
                          if (var18 <= 255) {
                            break L5;
                          } else {
                            var18 = 255;
                            break L5;
                          }
                        }
                        L6: {
                          if (var17 == 0) {
                            var25[var11] = 0;
                            break L6;
                          } else {
                            var8[var11] = oe.c(oe.c(rn.a(var14 / var17, 16711680), oe.c(var18 << 24, rn.a(255, var15 / var17))), rn.a(var16 / var17, 65280));
                            break L6;
                          }
                        }
                        var11++;
                        var12 += 4;
                        var10 += 4;
                        continue L3;
                      } else {
                        var19 = 0;
                        L7: while (true) {
                          if (var19 >= 4) {
                            var18++;
                            continue L4;
                          } else {
                            L8: {
                              var13 = var4[var19 + var2_int * var18 + var10];
                              if (var13 != 0) {
                                var17++;
                                var15 = var15 + (var13 & 255);
                                var16 = var16 + (65280 & var13);
                                var14 = var14 + (16711680 & var13);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var19++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("ew.A(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return stackIn_24_0;
    }

    abstract jm a(int param0);

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static rn a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String[] var4 = null;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        rn var8 = null;
        int var9 = 0;
        rn stackIn_3_0 = null;
        rn stackIn_7_0 = null;
        rn stackIn_11_0 = null;
        rn stackIn_17_0 = null;
        rn stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_6_0 = null;
        rn stackOut_10_0 = null;
        rn stackOut_19_0 = null;
        rn stackOut_16_0 = null;
        rn stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (var2_int > 255) {
                stackOut_6_0 = el.field_e;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3 = 82 / ((param1 - 50) / 49);
                var4 = dj.a(32, '.', param0);
                if (var4.length < 2) {
                  stackOut_10_0 = hv.field_N;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var5 = var4;
                  var6 = 0;
                  L1: while (true) {
                    if (var5.length <= var6) {
                      stackOut_19_0 = mb.a(var4[-1 + var4.length], -19);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      var7 = var5[var6];
                      var8 = sb.a(var7, (byte) -107);
                      if (var8 != null) {
                        stackOut_16_0 = (rn) var8;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = hv.field_N;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ew.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
        return stackIn_20_0;
    }

    abstract int b(int param0, int param1);

    abstract byte[] a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Start Game";
        field_a = new int[8192];
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
