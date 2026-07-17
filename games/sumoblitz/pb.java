/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pb {
    int field_c;
    int field_a;
    int field_d;
    static nb field_b;
    int field_f;
    int field_g;
    int field_e;

    final static cq a(int param0, int param1, int param2, int param3, wi param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        cq var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        cq stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var8 = hf.a(true, param4, 0, param2, param3, param0);
            var6 = var8;
            if (var8 != null) {
              if (param1 == 8089) {
                var7 = new cq();
                var7.field_b = var8;
                java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param0, param3);
                var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
                var7.requestFocus();
                stackOut_6_0 = (cq) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (cq) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (cq) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("pb.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
    }

    final static ts[] a(int param0) {
        return new ts[]{go.field_n, ov.field_i, sj.field_b, wj.field_h, lm.field_a, f.field_t, rf.field_e, pj.field_n, vd.field_b, qo.field_b, ea.field_a, js.field_G, ic.field_a, uc.field_d};
    }

    public static void b(int param0) {
        field_b = null;
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nb(3);
    }
}
