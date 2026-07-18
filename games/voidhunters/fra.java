/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fra {
    static String field_c;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2147483647) {
            fra.a(52);
        }
    }

    final static boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        int var17 = 0;
        int stackIn_22_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 2147483647;
            var5 = -2147483648;
            var6 = 2147483647;
            var7 = -2147483648;
            var8 = 0;
            L1: while (true) {
              if (var8 >= param0.length) {
                if (em.a(5220, var5, param1, var7, param3, var4_int, var6)) {
                  L2: {
                    var8 = param3;
                    var9 = param1;
                    var10 = param3 + -(var4_int - -var5 >> 1);
                    var11 = -(var6 + var7 >> 1) + param1;
                    if (Math.abs(var10) < Math.abs(var11)) {
                      if (0 < var10) {
                        var8 = var8 + (var5 - var4_int);
                        break L2;
                      } else {
                        var8 = var8 - (var5 + -var4_int);
                        break L2;
                      }
                    } else {
                      if (var11 > 0) {
                        var9 = var9 + (-var6 + var7);
                        break L2;
                      } else {
                        var9 = var9 - (var7 - var6);
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var10 = 0;
                    var17 = 0;
                    var11 = var17;
                    if (var17 >= param0.length) {
                      break L3;
                    } else {
                      L4: {
                        var12 = param0[var17];
                        var13 = param0[1 + var17];
                        var14 = param0[(2 + var17) % param0.length];
                        var15 = param0[(var17 - -3) % param0.length];
                        if (-1 == ng.a(8, param1, (byte) 93, param3, var14, var8, var13, var12, var15, var9)) {
                          var17 += 2;
                          break L4;
                        } else {
                          var10++;
                          break L4;
                        }
                      }
                      var17 += 2;
                      var17 += 2;
                      break L3;
                    }
                  }
                  L5: {
                    if (var10 % 2 != 1) {
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L5;
                    } else {
                      stackOut_36_0 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      break L5;
                    }
                  }
                  break L0;
                } else {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0 != 0;
                }
              } else {
                L6: {
                  var9 = param0[var8];
                  if (var5 < var9) {
                    var5 = var9;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var10 = param0[1 + var8];
                  if (var9 >= var4_int) {
                    break L7;
                  } else {
                    var4_int = var9;
                    break L7;
                  }
                }
                L8: {
                  if (var10 > var7) {
                    var7 = var10;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var6 > var10) {
                    var6 = var10;
                    var8 += 2;
                    break L9;
                  } else {
                    var8 += 2;
                    break L9;
                  }
                }
                var8 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("fra.C(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ',' + 2 + ',' + param3 + ')');
        }
        return stackIn_38_0 != 0;
    }

    final static int a() {
        int var1 = 5;
        int discarded$0 = 27546;
        return sea.a(-19) - seb.a() / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
        field_b = 50;
        field_c = "This option cannot be combined with the current '<%0>' setting.";
    }
}
