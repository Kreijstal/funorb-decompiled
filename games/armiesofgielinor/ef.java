/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends Exception {
    static String[] field_d;
    static int field_c;
    int field_b;
    static String field_a;

    final static void b(int param0) {
        ro.field_lb = null;
        bv.field_w = null;
        og.field_p = null;
        vs.field_e = null;
        jf.field_C = null;
        pr.field_g = null;
        kl.field_a = null;
        cq.field_u = null;
        if (param0 != -1) {
            ef.b(95);
        }
    }

    ef(int param0) {
        this.field_b = param0;
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6, String param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param1 > 24) {
              L1: {
                if (0 != we.field_f.field_yb) {
                  if (!bb.field_a) {
                    if (vi.field_d) {
                      np.k(86);
                      break L1;
                    } else {
                      hf.field_c = true;
                      if (!ArmiesOfGielinor.field_M) {
                        break L1;
                      } else {
                        np.k(86);
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (hf.field_c) {
                L2: {
                  ts.a(param7, param2, param4, 20, param0, param0, param5, 15676, param6);
                  eu.field_g.a(true, param3);
                  if (!param3) {
                    break L2;
                  } else {
                    L3: {
                      if (qf.field_e.field_yb == 0) {
                        break L3;
                      } else {
                        hf.field_c = false;
                        break L3;
                      }
                    }
                    if (-1 == (ed.field_e.field_yb ^ -1)) {
                      break L2;
                    } else {
                      rd.b(8445);
                      hf.field_c = false;
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("ef.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param7 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_c = 83;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_a = "Loading...";
    }
}
