/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_d;
    volatile boolean field_c;
    static String field_g;
    static boolean field_a;
    static String field_e;
    static String field_f;
    static int field_b;

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != -79) {
          kl.a(20, -54, 32, (byte) 91, -80);
          nm.b((byte) 75);
          ra.b(param4, param2, param0, param1);
          return;
        } else {
          nm.b((byte) 75);
          ra.b(param4, param2, param0, param1);
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(byte param0, ie param1) {
        Object var4 = null;
        if (param0 <= 33) {
          var4 = null;
          ((kl) this).paint((java.awt.Graphics) null);
          r.a(param1, ((kl) this).field_d, 0);
          return;
        } else {
          r.a(param1, ((kl) this).field_d, 0);
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -87) {
            return;
        }
        field_f = null;
        field_g = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    kl() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((kl) this).field_c = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Location";
        field_f = "Loading...";
        field_e = "Player Name: ";
    }
}
