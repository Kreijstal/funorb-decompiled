/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    int field_c;
    int field_g;
    int field_j;
    int field_a;
    byte[] field_b;
    byte[] field_h;
    static vn field_d;
    int field_i;
    int field_f;
    int field_e;

    final static void a(int param0, String param1) {
        gk.field_F = param1;
        og.b(param0 ^ -114, param0);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            nf.a(-56);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static la a(int param0, int param1, ec param2, int param3, boolean param4, int param5) {
        java.awt.Frame var6 = null;
        la var7 = null;
        java.awt.Frame var8 = null;
        var8 = me.a((byte) 114, param1, param3, param2, param5, param0);
        var6 = var8;
        if (var8 != null) {
          var7 = new la();
          if (param4) {
            nf.a(-19);
            var7.field_e = var8;
            java.awt.Component discarded$2 = var7.field_e.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param1, param0);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          } else {
            var7.field_e = var8;
            java.awt.Component discarded$3 = var7.field_e.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param1, param0);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    static {
    }
}
