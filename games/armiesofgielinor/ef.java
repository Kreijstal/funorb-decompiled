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
        ((ef) this).field_b = param0;
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6, String param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                      break L1;
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
                    if (ed.field_e.field_yb == 0) {
                      break L2;
                    } else {
                      rd.b(8445);
                      hf.field_c = false;
                      return;
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("ef.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param7 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading...";
    }
}
