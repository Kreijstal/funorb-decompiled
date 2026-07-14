/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_e;
    java.awt.Frame field_f;
    static tf field_d;
    static el field_a;
    static String field_b;
    volatile boolean field_g;
    static String field_c;

    final void a(int param0, cb param1) {
        dc.a((byte) -124, ((mk) this).field_f, param1);
        if (param0 != 6511) {
            mk.a((byte) 114);
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(byte param0) {
        if (param0 >= -81) {
          field_d = null;
          field_a = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((mk) this).field_g = true;
    }

    mk() {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Quit to website";
        field_b = "Pause Menu";
        field_a = new el();
        field_c = "Loading...";
    }
}
