/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int field_a;
    static String field_b;
    static String field_f;
    java.awt.Frame field_c;
    volatile boolean field_e;
    static bl field_d;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        qe.field_W.c(-qe.field_W.field_x + param1, param3, 64);
        bi.g(param1, 0, param2 + param1, 480);
        if (param0) {
          return;
        } else {
          var4 = param1;
          L0: while (true) {
            if (var4 >= param1 - -param2) {
              bi.a();
              bi.a();
              bi.a();
              ln.field_f.c(param2 + param1, param3, 64);
              return;
            } else {
              qp.field_h.c(var4, param3, 64);
              var4 = var4 + qp.field_h.field_x;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        if (param0 != 8462) {
            field_f = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((qi) this).field_e = true;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    qi() {
    }

    final void a(jj param0, int param1) {
        if (param1 != 30210) {
            return;
        }
        br.a(((qi) this).field_c, param0, 8);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Music: ";
    }
}
