/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        int var1 = -91 % ((param0 - 3) / 48);
        field_b = null;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                stackOut_38_0 = var5;
                stackIn_39_0 = stackOut_38_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4_int = 1;
                        var8++;
                        break L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (90 < var9) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (122 < var9) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0 != 0;
                  }
                  if (var9 >= 10) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0 != 0;
                  } else {
                    L8: {
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var6 * 10 - -var9;
                    if (var6 != var10 / 10) {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("fc.A(").append(true).append(',').append(-44).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + 10 + ')');
        }
        return stackIn_39_0 != 0;
    }

    final static void a(int param0, nl param1, int param2) {
        lh var5 = null;
        int var4 = 0;
        try {
            var5 = nj.field_p;
            var5.d(param2, -18392);
            var5.field_j = var5.field_j + 1;
            var4 = var5.field_j;
            var5.c(1, (byte) -126);
            var5.c(param1.field_j, (byte) -95);
            var5.b((byte) -63, param1.field_l);
            var5.a(param1.field_h, (byte) 122);
            var5.a(param1.field_p, (byte) -2);
            if (param0 > -1) {
                fc.a(113);
            }
            var5.a(param1.field_q, (byte) -117);
            var5.a(param1.field_k, (byte) 104);
            int discarded$0 = var5.d(var4, (byte) 9);
            var5.b(var5.field_j + -var4, (byte) 87);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "fc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
