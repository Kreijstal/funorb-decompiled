/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 100) {
            field_b = null;
        }
    }

    final static dg a(int param0, int param1, fe param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        dg var7 = null;
        java.awt.Frame var8 = null;
        var8 = kl.a(param5, -3, param2, param4, param0, param1);
        var6 = var8;
        if (var8 == null) {
          return null;
        } else {
          var7 = new dg();
          var7.field_f = var8;
          java.awt.Component discarded$2 = var7.field_f.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, param3, param4, param5);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          var7.requestFocus();
          return var7;
        }
    }

    final static od a(int param0, int param1, int param2, hb param3, int param4) {
        bb var5 = null;
        nd var6 = null;
        od var7 = null;
        var5 = bb.b(param3, 100, param2, param4);
        var6 = fl.a((ag) (Object) var5, -11039, param1);
        var7 = new od(var5, (wf) (Object) var6);
        if (param0 <= 100) {
          field_b = null;
          lb.field_f.a((wf) (Object) var7, -83);
          of.field_a.a((ag) (Object) var6);
          return var7;
        } else {
          lb.field_f.a((wf) (Object) var7, -83);
          of.field_a.a((ag) (Object) var6);
          return var7;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
