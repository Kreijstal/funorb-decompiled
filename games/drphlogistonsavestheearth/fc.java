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
        Object var12 = null;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              var5 = 0;
              if (param1 == -44) {
                break L1;
              } else {
                var12 = null;
                fc.a(92, (nl) null, 82);
                break L1;
              }
            }
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              if (var7 <= var8) {
                stackOut_42_0 = var5;
                stackIn_43_0 = stackOut_42_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var9 = param2.charAt(var8);
                    if (var8 != 0) {
                      break L4;
                    } else {
                      if (var9 == 45) {
                        var4_int = 1;
                        var8++;
                        break L3;
                      } else {
                        if (var9 != 43) {
                          break L4;
                        } else {
                          if (param0) {
                            var8++;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 65) {
                        break L7;
                      } else {
                        if (90 < var9) {
                          break L7;
                        } else {
                          var9 -= 55;
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if (var9 < 97) {
                        break L8;
                      } else {
                        if (122 < var9) {
                          break L8;
                        } else {
                          var9 -= 87;
                          break L5;
                        }
                      }
                    }
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
                  }
                  if (var9 >= 10) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0 != 0;
                  } else {
                    L9: {
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var10 = var6 * 10 - -var9;
                    if (var6 != var10 / 10) {
                      stackOut_35_0 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      return stackIn_36_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L3;
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("fc.A(").append(param0).append(44).append(param1).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + 10 + 41);
        }
        return stackIn_43_0 != 0;
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
            throw ie.a((Throwable) (Object) runtimeException, "fc.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
