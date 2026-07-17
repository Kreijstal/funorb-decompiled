/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static nb field_a;
    static int field_b;

    final static int a(byte param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                stackOut_7_0 = var3_int;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  if (param2 == param1.charAt(var5)) {
                    var3_int++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("vs.A(").append(-117).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
        return stackIn_8_0;
    }

    public static void a() {
        field_a = null;
    }

    final static boolean b() {
        return ms.field_a;
    }

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        ub var5_ref_ub = null;
        int var5 = 0;
        int var6_int = 0;
        ub var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (kw.field_c == ga.field_j) {
            L0: {
              L1: {
                var4 = -96;
                var2_long = wq.a(-45);
                if (0 == jo.field_c) {
                  break L1;
                } else {
                  if (lq.field_b < 0) {
                    L2: {
                      var5_ref_ub = (ub) (Object) un.field_b.b(-99);
                      if (var5_ref_ub == null) {
                        break L2;
                      } else {
                        if (~var2_long >= ~var5_ref_ub.field_m) {
                          break L2;
                        } else {
                          var5_ref_ub.b(false);
                          gu.field_d = var5_ref_ub.field_k.length;
                          ig.field_a.field_p = 0;
                          var6_int = 0;
                          L3: while (true) {
                            if (var6_int >= gu.field_d) {
                              li.field_r = vb.field_I;
                              vb.field_I = ur.field_Q;
                              ur.field_Q = iw.field_a;
                              iw.field_a = var5_ref_ub.field_l;
                              stackOut_12_0 = 1;
                              stackIn_13_0 = stackOut_12_0;
                              return stackIn_13_0 != 0;
                            } else {
                              ig.field_a.field_n[var6_int] = var5_ref_ub.field_k[var6_int];
                              var6_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_15_0 = lq.field_b;
                    stackIn_17_0 = stackOut_15_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_14_0 = lq.field_b;
              stackIn_17_0 = stackOut_14_0;
              break L0;
            }
            L4: while (true) {
              L5: {
                if (stackIn_17_0 < 0) {
                  ig.field_a.field_p = 0;
                  if (ju.b(-1, 1)) {
                    lq.field_b = ig.field_a.i(255);
                    ig.field_a.field_p = 0;
                    gu.field_d = param0[lq.field_b];
                    break L5;
                  } else {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  }
                } else {
                  break L5;
                }
              }
              int discarded$1 = 119;
              if (lt.a()) {
                if (jo.field_c != 0) {
                  L6: {
                    var5 = jo.field_c;
                    if (0.0 == au.field_k) {
                      break L6;
                    } else {
                      var5 = (int)((double)var5 + fd.field_d.nextGaussian() * au.field_k);
                      if (var5 < 0) {
                        var5 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var6 = new ub((long)var5 + var2_long, lq.field_b, new byte[gu.field_d]);
                  var7 = 0;
                  L7: while (true) {
                    if (gu.field_d <= var7) {
                      un.field_b.a((ms) (Object) var6, (byte) 39);
                      lq.field_b = -1;
                      stackOut_16_0 = lq.field_b;
                      stackIn_17_0 = stackOut_16_0;
                      continue L4;
                    } else {
                      var6.field_k[var7] = ig.field_a.field_n[var7];
                      var7++;
                      continue L7;
                    }
                  }
                } else {
                  li.field_r = vb.field_I;
                  vb.field_I = ur.field_Q;
                  ur.field_Q = iw.field_a;
                  iw.field_a = lq.field_b;
                  lq.field_b = -1;
                  stackOut_27_0 = 1;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0 != 0;
                }
              } else {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                return stackIn_25_0 != 0;
              }
            }
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("vs.D(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + -126 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nb(0);
    }
}
