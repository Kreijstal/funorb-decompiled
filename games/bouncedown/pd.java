/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static jf[] field_a;
    static String field_b;

    final static void a(int param0) {
        String var1;
        if (!fe.field_g) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != nk.field_a) {
              nk.field_a.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != 11173) {
            return;
          } else {
            var1 = fd.c((byte) 61);
            vk.field_c = new ci(var1, (String) null, true, false, false);
            q.field_N.b(ed.field_c, false);
            ed.field_c.a(param0 ^ 437, vk.field_c);
            ed.field_c.i((byte) -85);
            return;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        qh.field_e = aj.field_e[param1];
        if (!param0) {
          field_a = (jf[]) null;
          pc.field_p = hc.field_d[param1];
          ii.field_l = nl.field_b[param1];
          return;
        } else {
          pc.field_p = hc.field_d[param1];
          ii.field_l = nl.field_b[param1];
          return;
        }
    }

    final static rg a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        rg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vc.field_F != qg.field_g) {
              L1: {
                if (param0 == 1059) {
                  break L1;
                } else {
                  field_b = (String) null;
                  break L1;
                }
              }
              L2: {
                if (he.field_p != vc.field_F) {
                  break L2;
                } else {
                  if (param1.equals(t.field_t)) {
                    vc.field_F = wj.field_a;
                    stackIn_11_0 = oa.field_c;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              vc.field_F = qg.field_g;
              oa.field_c = null;
              t.field_t = param1;
              stackIn_9_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("pd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rg) ((Object) stackIn_9_0);
        } else {
          return stackIn_11_0;
        }
    }

    public static void a(byte param0) {
        int var1 = -102 / ((param0 - -62) / 48);
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Mouse over an icon for details";
    }
}
