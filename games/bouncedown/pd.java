/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static jf[] field_a;
    static String field_b;

    final static void a(int param0) {
        if (!(fe.field_g)) {
            throw new IllegalStateException();
        }
        if (!(null == nk.field_a)) {
            nk.field_a.a(true);
        }
        int discarded$0 = 61;
        String var1 = fd.c();
        vk.field_c = new ci(var1, (String) null, true, false, false);
        q.field_N.b((lk) (Object) ed.field_c, false);
        ed.field_c.a(10768, (lk) (Object) vk.field_c);
        ed.field_c.i((byte) -85);
    }

    final static void a(boolean param0, int param1) {
        qh.field_e = aj.field_e[param1];
        pc.field_p = hc.field_d[param1];
        ii.field_l = nl.field_b[param1];
    }

    final static rg a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_7_0 = null;
        rg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        rg stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
            if (vc.field_F != qg.field_g) {
              L1: {
                if (he.field_p != vc.field_F) {
                  break L1;
                } else {
                  if (param1.equals((Object) (Object) t.field_t)) {
                    vc.field_F = wj.field_a;
                    stackOut_8_0 = oa.field_c;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              vc.field_F = qg.field_g;
              oa.field_c = null;
              t.field_t = param1;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (rg) (Object) stackIn_7_0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("pd.D(").append(1059).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    public static void a() {
        int var1 = 102;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Mouse over an icon for details";
    }
}
