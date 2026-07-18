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

    final static cq a(int param0, int param1, int param2, int param3, wi param4) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        cq var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        cq stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var8 = hf.a(true, param4, 0, 0, param3, param0);
            var6 = var8;
            if (var8 != null) {
              var7 = new cq();
              var7.field_b = var8;
              java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param0, param3);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_4_0 = (cq) var7;
              stackIn_5_0 = stackOut_4_0;
              break L0;
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
            stackOut_6_0 = (RuntimeException) var6_ref;
            stackOut_6_1 = new StringBuilder().append("pb.C(").append(param0).append(',').append(8089).append(',').append(0).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 0 + ')');
        }
        return stackIn_5_0;
    }

    final static ts[] a() {
        return new ts[]{go.field_n, ov.field_i, sj.field_b, wj.field_h, lm.field_a, f.field_t, rf.field_e, pj.field_n, vd.field_b, qo.field_b, ea.field_a, js.field_G, ic.field_a, uc.field_d};
    }

    public static void b() {
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
