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
        cq stackIn_5_0 = null;
        cq stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = hf.a(true, param4, param5, param2, param3, param0);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (cq) (stackIn_2_0);
          }
          if (param1 != 8089) {
            stackIn_5_0 = (cq) null;
            return stackIn_5_0;
          }
          var7 = new cq();
          var7.field_b = var8;
          var7.field_b.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("pb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final static ts[] a(int param0) {
        if (param0 >= 10) {
          return new ts[]{go.field_n, ov.field_i, sj.field_b, wj.field_h, lm.field_a, f.field_t, rf.field_e, pj.field_n, vd.field_b, qo.field_b, ea.field_a, js.field_G, ic.field_a, uc.field_d};
        }
        field_b = (nb) null;
        return new ts[]{go.field_n, ov.field_i, sj.field_b, wj.field_h, lm.field_a, f.field_t, rf.field_e, pj.field_n, vd.field_b, qo.field_b, ea.field_a, js.field_G, ic.field_a, uc.field_d};
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 3) {
          field_b = (nb) null;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_b = new nb(3);
    }
}
