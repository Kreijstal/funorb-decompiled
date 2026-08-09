/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends cb {
    static ea field_l;
    static ea[] field_k;
    static int field_j;
    static String field_i;

    public static void f(int param0) {
        if (param0 != -27836) {
            wj.g(-60);
        }
        field_k = null;
        field_l = null;
        field_i = null;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1 >= 1) {
                break L1;
              } else {
                field_j = 99;
                break L1;
              }
            }
            if (Character.isISOControl(param0)) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (fg.a(-1975005818, param0)) {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = mf.field_f;
                var7 = var8;
                var6 = var7;
                var2 = var6;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var8.length) {
                    var2 = ml.field_c;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2.length) {
                        stackIn_26_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param0) {
                          stackIn_23_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var8[var3];
                    if ((param0 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "wj.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              return stackIn_26_0 != 0;
            }
          }
        }
    }

    final static boolean g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1_int = 17 / ((param0 - 60) / 57);
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -36) {
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (th.field_b[var2][cm.field_o]) {
                    if (!d.a(var2, cm.field_o, (byte) 68)) {
                      stackIn_8_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "wj.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 10 % ((49 - param0) / 56);
            if (this.a(param1, 5) == fg.field_d) {
              stackIn_3_0 = vd.field_r;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_3_0;
    }

    final ag a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        ag stackIn_5_0 = null;
        ag stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 5) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((byte) 97, (String) null);
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param0);
            if (!oi.a(-19804, var5)) {
              stackIn_5_0 = fg.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var6 = (CharSequence) ((Object) param0);
                var3_int = md.a(var6, true);
                if (-1 <= (var3_int ^ -1)) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -131) {
                    break L2;
                  } else {
                    return sc.field_a;
                  }
                }
              }
              stackIn_10_0 = fg.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("wj.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_10_0;
        }
    }

    wj(ui param0) {
        super(param0);
    }

    static {
        field_k = new ea[4];
        field_i = "Suggested names: ";
    }
}
