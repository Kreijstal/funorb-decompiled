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
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        int stackIn_14_0 = 0;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            if (!fs.a(param0, var6)) {
              stackIn_3_0 = pk.field_v;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ae.field_g != 2) {
                stackIn_7_0 = db.field_j;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!ue.a(param1, 0)) {
                  L1: {
                    if (param0) {
                      stackIn_14_0 = 0;
                      break L1;
                    } else {
                      stackIn_14_0 = 1;
                      break L1;
                    }
                  }
                  if (dda.a(stackIn_14_0 != 0, param1)) {
                    stackIn_17_0 = gl.a((byte) 119, ce.field_w, new String[]{param1});
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
                          stackIn_21_0 = bq.field_b;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (-201 < (ii.field_a ^ -1)) {
                      if (qaa.a(2180, param1)) {
                        stackIn_28_0 = gl.a((byte) 119, vra.field_c, new String[]{param1});
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
                        stackIn_30_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    } else {
                      stackIn_24_0 = bq.field_b;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = iia.field_q;
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
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("rf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L3;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
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
