/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends rf {
    int field_p;
    static hl field_f;
    int[] field_o;
    int field_n;
    int field_h;
    int field_m;
    int field_i;
    long field_k;
    static hl field_l;
    static String field_q;
    int field_j;
    int field_g;

    public static void d(int param0) {
        field_l = null;
        field_q = null;
        field_f = null;
        if (param0 != 0) {
            field_l = null;
        }
    }

    final static qc a(int param0, ka param1, int param2, boolean param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        qc var7 = null;
        java.awt.Frame var8 = null;
        var8 = oh.a(param5, param1, param2, param4, param0, -100);
        var6 = var8;
        if (var8 != null) {
          if (!param3) {
            return null;
          } else {
            var7 = new qc();
            var7.field_f = var8;
            java.awt.Component discarded$2 = var7.field_f.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param4, param5);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        if (null == n.field_a) {
          return;
        } else {
          wf.a((java.awt.Canvas) (Object) n.field_a, false);
          if (param0 == 0) {
            n.field_a.a(nb.field_e, (byte) -63);
            n.field_a = null;
            if (kd.field_B != null) {
              kd.field_B.a(false);
              kj.field_E.requestFocus();
              return;
            } else {
              kj.field_E.requestFocus();
              return;
            }
          } else {
            return;
          }
        }
    }

    re(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((re) this).field_m = param3;
        ((re) this).field_i = param2;
        ((re) this).field_h = param1;
        mg.field_h = mg.field_h + 1;
        ((re) this).field_g = 65535 & mg.field_h;
        ((re) this).field_n = param0;
        ((re) this).field_o = param6;
        ((re) this).field_j = param5;
        ((re) this).field_p = param4;
    }

    static {
    }
}
