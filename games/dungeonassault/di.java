/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    String field_g;
    int field_h;
    int field_a;
    String field_c;
    String field_i;
    static boolean field_e;
    int field_f;
    int field_j;
    static String field_k;
    int field_b;
    static int field_d;
    static cn[] field_l;

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        ao var4_ref_ao = null;
        int var4 = 0;
        int var5_int = 0;
        ao var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            if (pd.field_A == qa.field_c) {
              L1: {
                if (param1 == -1) {
                  break L1;
                } else {
                  var8 = null;
                  boolean discarded$1 = di.a((int[]) null, -88);
                  break L1;
                }
              }
              L2: {
                var2_long = kd.c(-2456);
                if (pm.field_p == 0) {
                  break L2;
                } else {
                  if (0 <= pp.field_J) {
                    break L2;
                  } else {
                    var4_ref_ao = (ao) (Object) nl.field_e.e(-24172);
                    if (var4_ref_ao == null) {
                      break L2;
                    } else {
                      if (~var2_long < ~var4_ref_ao.field_l) {
                        var4_ref_ao.a(false);
                        nj.field_b = var4_ref_ao.field_m.length;
                        ra.field_c.field_o = 0;
                        var5_int = 0;
                        L3: while (true) {
                          if (var5_int >= nj.field_b) {
                            wl.field_f = oc.field_E;
                            oc.field_E = rd.field_C;
                            rd.field_C = hc.field_c;
                            hc.field_c = var4_ref_ao.field_j;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          } else {
                            ra.field_c.field_m[var5_int] = var4_ref_ao.field_m[var5_int];
                            var5_int++;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (pp.field_J >= 0) {
                    break L5;
                  } else {
                    ra.field_c.field_o = 0;
                    if (!oi.a(-12929, 1)) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      pp.field_J = ra.field_c.m(255);
                      ra.field_c.field_o = 0;
                      nj.field_b = param0[pp.field_J];
                      break L5;
                    }
                  }
                }
                if (!kh.d((byte) -117)) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                } else {
                  if (pm.field_p == 0) {
                    wl.field_f = oc.field_E;
                    oc.field_E = rd.field_C;
                    rd.field_C = hc.field_c;
                    hc.field_c = pp.field_J;
                    pp.field_J = -1;
                    stackOut_37_0 = 1;
                    stackIn_38_0 = stackOut_37_0;
                    break L0;
                  } else {
                    L6: {
                      var4 = pm.field_p;
                      if (qi.field_a != 0.0) {
                        var4 = (int)((double)var4 + bl.field_i.nextGaussian() * qi.field_a);
                        if (var4 < 0) {
                          var4 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var5 = new ao((long)var4 + var2_long, pp.field_J, new byte[nj.field_b]);
                    var6 = 0;
                    L7: while (true) {
                      if (nj.field_b <= var6) {
                        nl.field_e.a((ne) (Object) var5, false);
                        pp.field_J = -1;
                        continue L4;
                      } else {
                        var5.field_m[var6] = ra.field_c.field_m[var6];
                        var6++;
                        continue L7;
                      }
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
          L8: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("di.B(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L8;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param1 + 41);
        }
        return stackIn_38_0 != 0;
    }

    final void a(ec param0, int param1) {
        try {
            ((di) this).field_i = param0.a(-21030);
            if (param1 != -1) {
                Object var4 = null;
                ((di) this).a((ec) null, -21);
            }
            ((di) this).field_g = param0.a(-21030);
            ((di) this).field_c = param0.a(-21030);
            String discarded$0 = param0.a(param1 ^ 21029);
            ((di) this).field_j = rm.a(param0, 6065);
            int discarded$1 = rm.a(param0, 6065);
            int discarded$2 = rm.a(param0, param1 + 6066);
            ((di) this).field_a = param0.f(param1 + -101);
            ((di) this).field_f = param0.f(param1 ^ 125);
            ((di) this).field_h = param0.f(-117);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "di.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_k = "This password contains repeated characters, and would be easy to guess";
    }
}
