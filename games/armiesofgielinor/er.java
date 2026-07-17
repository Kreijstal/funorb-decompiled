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

    final static void b() {
        L0: {
          L1: {
            if (p.field_b == 10) {
              break L1;
            } else {
              int discarded$6 = 10;
              if (!du.c()) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          int discarded$7 = 7;
          tb.d();
          p.field_b = 11;
          break L0;
        }
        dd.field_a = true;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_32_0 = var5;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (0 == var8) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        var4_int = 1;
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 < var9) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
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
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  }
                  if (var9 < 10) {
                    L8: {
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var9 + 10 * var6;
                    if (var10 / 10 != var6) {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    }
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
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
            stackOut_34_0 = (RuntimeException) var4;
            stackOut_34_1 = new StringBuilder().append("er.D(").append(1).append(44).append(-108).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + 10 + 41);
        }
        return stackIn_33_0 != 0;
    }

    final static void a() {
        int var1 = 0;
        if (!(null == rl.field_C)) {
            rl.field_C.k(0);
        }
        if (pq.field_a != null) {
            pq.field_a.i((byte) 2);
        }
        int discarded$0 = 124;
        qh.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_c = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
