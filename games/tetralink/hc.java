/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends mc {
    static int field_p;
    static nk field_v;
    static boolean[] field_u;
    static int[] field_s;
    static char[] field_o;
    static int field_q;
    static String field_r;
    static hl field_n;
    int field_t;

    final static de a(int param0, byte param1, ah param2, int param3, ah param4) {
        RuntimeException var5 = null;
        de stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        de stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (ia.a(param3, param2, param0, -81)) {
              L1: {
                if (param1 == 74) {
                  break L1;
                } else {
                  field_o = null;
                  break L1;
                }
              }
              stackOut_5_0 = t.a(false, param4.a(-3, param3, param0));
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hc.B(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final static boolean c(int param0) {
        field_r = null;
        if (!qj.c(124)) {
            return false;
        }
        if (0 != (8 & dh.field_e)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_o = null;
        field_s = null;
        field_r = null;
        int var1 = 17 % ((param0 - -38) / 54);
        field_u = null;
        field_v = null;
        field_n = null;
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_7_0 = null;
        String stackOut_5_0 = null;
        var5 = TetraLink.field_J;
        var1 = "(" + mh.field_g + " " + lk.field_sb + " " + md.field_A + ") " + ua.field_c;
        if (0 < rl.field_d) {
          var1 = var1 + ":";
          var2 = 0;
          L0: while (true) {
            if (var2 < rl.field_d) {
              stackOut_5_0 = var1 + 32;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 == 0) {
                L1: {
                  L2: {
                    var1 = stackIn_7_0;
                    var3 = kb.field_q.field_u[var2] & 255;
                    var4 = var3 >> 4;
                    var3 = var3 & 15;
                    if (var4 < 10) {
                      break L2;
                    } else {
                      var4 += 55;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4 += 48;
                  break L1;
                }
                L3: {
                  L4: {
                    if (var3 < 10) {
                      break L4;
                    } else {
                      var3 += 55;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 += 48;
                  break L3;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
                var2++;
                continue L0;
              } else {
                return stackIn_6_0;
              }
            } else {
              return var1;
            }
          }
        } else {
          return var1;
        }
    }

    private hc() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var16 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param4 == -32263) {
                break L1;
              } else {
                boolean discarded$1 = hc.c(-55);
                break L1;
              }
            }
            L2: while (true) {
              param2--;
              if (0 > param2) {
                break L0;
              } else {
                var17 = param1;
                var10_array = var17;
                var11 = param5;
                var12 = param7;
                var13 = param6;
                var14 = param3;
                var15 = (var17[var11] & 16711422) >> 1;
                var10_array[var11] = pl.a(var14 >> 17, 255) + (pl.a(33423361, var12) >> 1) + (pl.a(var13 >> 9, 65280) + var15);
                param7 = param7 + param0;
                param6 = param6 + param8;
                param3 = param3 + param9;
                param5++;
                if (var16 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("hc.C(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_s = new int[4];
        field_u = new boolean[64];
        field_r = "You need to play 1 more rated game to unlock this option.";
    }
}
