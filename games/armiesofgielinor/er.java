/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        L0: {
          L1: {
            if (~p.field_b == param0) {
              break L1;
            } else {
              if (!du.c(10)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          tb.d(7);
          p.field_b = 11;
          break L0;
        }
        dd.field_a = true;
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
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
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
        int stackOut_23_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (param1 <= -38) {
                break L1;
              } else {
                er.b(-89);
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                stackOut_37_0 = var5;
                stackIn_38_0 = stackOut_37_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var9 = param2.charAt(var8);
                    if (0 == var8) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L4;
                        } else {
                          if (!param0) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        var4_int = 1;
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (57 < var9) {
                          break L6;
                        } else {
                          var9 -= 48;
                          break L5;
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
                        if (var9 > 122) {
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
                  if (var9 < 10) {
                    L9: {
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var10 = var9 + 10 * var6;
                    if (var10 / 10 != var6) {
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      return stackIn_34_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L3;
                    }
                  } else {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0 != 0;
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
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("er.D(").append(param0).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + 10 + 41);
        }
        return stackIn_38_0 != 0;
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (!(null == rl.field_C)) {
            rl.field_C.k(0);
        }
        if (pq.field_a != null) {
            pq.field_a.i((byte) 2);
        }
        qh.a((byte) 124);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_c = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
