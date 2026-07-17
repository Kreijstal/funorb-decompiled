/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static boolean field_c;
    static java.applet.Applet field_d;
    static String field_e;
    static String field_b;
    static String field_a;
    static dd field_f;

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        ha var4_ref_ha = null;
        int var4 = 0;
        int var5_int = 0;
        ha var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          if (rh.field_k != fh.field_b) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            L0: {
              var2_long = lj.a((byte) -83);
              if (ja.field_P == 0) {
                break L0;
              } else {
                if (0 <= il.field_h) {
                  break L0;
                } else {
                  var4_ref_ha = (ha) (Object) bj.field_n.c((byte) 47);
                  if (var4_ref_ha == null) {
                    break L0;
                  } else {
                    if (~var4_ref_ha.field_q > ~var2_long) {
                      var4_ref_ha.c(-1);
                      pd.field_l = var4_ref_ha.field_r.length;
                      ae.field_a.field_i = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (pd.field_l <= var5_int) {
                          hc.field_j = rj.field_k;
                          rj.field_k = vi.field_a;
                          vi.field_a = be.field_a;
                          be.field_a = var4_ref_ha.field_n;
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          ae.field_a.field_k[var5_int] = var4_ref_ha.field_r[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            L2: {
              if (param0 <= -54) {
                break L2;
              } else {
                int discarded$2 = 0;
                int discarded$3 = tb.a((CharSequence) null);
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (il.field_h >= 0) {
                  break L4;
                } else {
                  ae.field_a.field_i = 0;
                  if (gi.a(1, true)) {
                    il.field_h = ae.field_a.f((byte) 47);
                    ae.field_a.field_i = 0;
                    pd.field_l = param1[il.field_h];
                    break L4;
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0 != 0;
                  }
                }
              }
              if (gf.b(-9)) {
                if (ja.field_P != 0) {
                  L5: {
                    var4 = ja.field_P;
                    if (g.field_u == 0.0) {
                      break L5;
                    } else {
                      var4 = (int)((double)var4 + jj.field_R.nextGaussian() * g.field_u);
                      if (var4 >= 0) {
                        break L5;
                      } else {
                        var4 = 0;
                        break L5;
                      }
                    }
                  }
                  var5 = new ha((long)var4 + var2_long, il.field_h, new byte[pd.field_l]);
                  var6 = 0;
                  L6: while (true) {
                    if (pd.field_l <= var6) {
                      bj.field_n.a(false, (lh) (Object) var5);
                      il.field_h = -1;
                      continue L3;
                    } else {
                      var5.field_r[var6] = ae.field_a.field_k[var6];
                      var6++;
                      continue L6;
                    }
                  }
                } else {
                  hc.field_j = rj.field_k;
                  rj.field_k = vi.field_a;
                  vi.field_a = be.field_a;
                  be.field_a = il.field_h;
                  il.field_h = -1;
                  stackOut_26_0 = 1;
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0 != 0;
                }
              } else {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("tb.C(").append(param0).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_e = null;
    }

    final static int a(CharSequence param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                int discarded$2 = 22861;
                var3 = rc.a(param0.charAt(var4)) + ((var3 << 5) + -var3);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("tb.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Right slope: ";
        field_b = "Tiles in the level (1/3)";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
