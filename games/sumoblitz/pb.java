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
        cq var7 = null;
        java.awt.Frame var8 = null;
        var8 = hf.a(true, param4, param5, param2, param3, param0);
        var6 = var8;
        if (var8 != null) {
          if (param1 != 8089) {
            return null;
          } else {
            var7 = new cq();
            var7.field_b = var8;
            java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param0, param3);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    final static ts[] a(int param0) {
        if (param0 < 10) {
          field_b = null;
          return new ts[]{go.field_n, ov.field_i, sj.field_b, wj.field_h, lm.field_a, f.field_t, rf.field_e, pj.field_n, vd.field_b, qo.field_b, ea.field_a, js.field_G, ic.field_a, uc.field_d};
        } else {
          return new ts[]{go.field_n, ov.field_i, sj.field_b, wj.field_h, lm.field_a, f.field_t, rf.field_e, pj.field_n, vd.field_b, qo.field_b, ea.field_a, js.field_G, ic.field_a, uc.field_d};
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 3) {
            field_b = null;
        }
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
