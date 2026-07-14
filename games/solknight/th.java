/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends si {
    static int field_I;
    static int field_J;
    static int field_K;
    static o field_H;
    static String field_L;

    final static void a(byte param0, java.awt.Canvas param1) {
        Object var3 = null;
        L0: {
          f.a(0, (java.awt.Component) (Object) param1);
          ch.a((java.awt.Component) (Object) param1, 122);
          if (null != ah.field_d) {
            ah.field_d.a((java.awt.Component) (Object) param1, true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -33) {
          var3 = null;
          th.a((byte) 120, (java.awt.Canvas) null);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        bc var7 = null;
        super.a(param0, param1 ^ param1, param2, param3, param4, param5);
        var7 = jf.field_a;
        if (var7 != null) {
          if (((th) this).a(param0, param4, param5, param3, -110)) {
            if (!(((th) this).field_n instanceof gk)) {
              if (!(var7.field_n instanceof gk)) {
                return;
              } else {
                ((gk) (Object) var7.field_n).a((th) this, -7935, var7);
                jf.field_a = null;
                return;
              }
            } else {
              ((gk) (Object) ((th) this).field_n).a((th) this, -7935, var7);
              jf.field_a = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private th(int param0, int param1, int param2, int param3, j param4, dg param5, rc param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((th) this).field_G = param6;
    }

    public static void j(int param0) {
        field_L = null;
        if (param0 <= 105) {
            th.j(-122);
            field_H = null;
            return;
        }
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Loading music";
    }
}
