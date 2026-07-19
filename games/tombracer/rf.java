/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static String field_b;
    static String field_a;
    static String[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -19) {
            return;
        }
        field_a = null;
    }

    final static long b(byte param0) {
        if (param0 != -121) {
            return 20L;
        }
        return -ue.field_s + bva.b((byte) -107);
    }

    final static String a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        int stackIn_14_0 = 0;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        String stackOut_16_0 = null;
        String stackOut_20_0 = null;
        String stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        String stackOut_23_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            if (!fs.a(param0, var6)) {
              stackOut_2_0 = pk.field_v;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ae.field_g != 2) {
                stackOut_6_0 = db.field_j;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!ue.a(param1, 0)) {
                  L1: {
                    if (param0) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L1;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L1;
                    }
                  }
                  if (dda.a(stackIn_14_0 != 0, param1)) {
                    stackOut_16_0 = gl.a((byte) 119, ce.field_w, new String[]{param1});
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (ii.field_a < 100) {
                        break L2;
                      } else {
                        if (wla.field_ub > 0) {
                          break L2;
                        } else {
                          stackOut_20_0 = bq.field_b;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (-201 < (ii.field_a ^ -1)) {
                      if (qaa.a(2180, param1)) {
                        stackOut_27_0 = gl.a((byte) 119, vra.field_c, new String[]{param1});
                        stackIn_28_0 = stackOut_27_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var5 = ql.field_k;
                        var5.k(param2, -2988);
                        var5.field_h = var5.field_h + 1;
                        var4 = var5.field_h;
                        var5.i(0, 0);
                        var5.a(param1, false);
                        var5.d(var5.field_h + -var4, (byte) 40);
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    } else {
                      stackOut_23_0 = bq.field_b;
                      stackIn_24_0 = stackOut_23_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  stackOut_9_0 = iia.field_q;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L3;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0;
                    } else {
                      return (String) ((Object) stackIn_30_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_a = "Reset penalty <%0>";
        field_b = "Find opponent";
        field_c = new String[]{"Title", "Game", "Win", "Lose"};
    }
}
