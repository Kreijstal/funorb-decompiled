/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue implements cg {
    static String field_d;
    static int field_b;
    static gk field_a;
    static String field_c;

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (de.a(param0, -17321)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var6 = oj.field_h;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var7 = cm.field_S;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L2: while (true) {
                      if (var8 >= var7.length) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        var4 = var7[var8];
                        if (param0 == var4) {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2_ref, "ue.D(" + param0 + ',' + 78 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final static void a(boolean param0) {
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        nh var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 94) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              var6_int = param2.field_o + param4;
              var7 = param2.field_m + param3;
              aj.a(param2.field_w, var6_int, var7, param2.field_k, 106);
              var8 = ja.field_n[1];
              if (!(param2 instanceof hf)) {
                break L2;
              } else {
                if (!((hf) (Object) param2).field_A) {
                  break L2;
                } else {
                  var8.a(1 + var6_int - -(-var8.field_z + param2.field_w >> 1), var7 - (-1 - (param2.field_k - var8.field_C >> 1)), 256);
                  break L2;
                }
              }
            }
            L3: {
              if (!param2.a(true)) {
                break L3;
              } else {
                ce.a(-4 + param2.field_k, 2 + var6_int, -16579, param2.field_w + -4, 2 + var7);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("ue.J(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = 0;
          var3 = vb.field_n;
          if (var3 >= 5) {
            if (105 > var3) {
              var2 = (var3 * 16384 + -40960) / 220;
              break L0;
            } else {
              if (120 > var3) {
                var3 = 120 - var3;
                var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          if (param1 >= 56) {
            break L1;
          } else {
            ue.a(-50, (byte) 118);
            break L1;
          }
        }
        L2: {
          var5 = 0;
          if (param0 != 3) {
            break L2;
          } else {
            var4 = -1;
            break L2;
          }
        }
        L3: {
          if (param0 == 1) {
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (5 == param0) {
            var4 = -1;
            var5 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 != 6) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if (param0 == 7) {
              break L8;
            } else {
              if (8 != param0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param0 != 11) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param0 == 12) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param0 == 13) {
            var5 = -1;
            var4 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (14 != param0) {
            break L12;
          } else {
            var4 = -1;
            var5 = 1;
            break L12;
          }
        }
        L13: {
          if (15 == param0) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        lc.field_u = ja.a(var4 * var2, var5 * var2, 32767);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
