/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_g;
    static tl field_f;
    static long field_h;
    java.awt.Frame field_c;
    volatile boolean field_e;
    static boolean field_a;
    static String[] field_d;
    static hj[] field_b;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(be param0, int param1) {
        Object var4 = null;
        if (param1 > -85) {
          var4 = null;
          hf discarded$2 = ea.a(7, (dl) null, 115);
          tj.a(param0, ((ea) this).field_c, -23144);
          return;
        } else {
          tj.a(param0, ((ea) this).field_c, -23144);
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static hf a(int param0, dl param1, int param2) {
        if (param0 <= 8) {
            return null;
        }
        return ik.a(bb.a(param1, 100, param2), -129);
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
        if (param0 != 29967) {
            field_f = null;
        }
    }

    ea() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ea) this).field_e = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "OVER <%0>";
        field_f = new tl();
    }
}
