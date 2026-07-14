/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_c;
    static String field_d;
    volatile boolean field_b;
    static int field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((oe) this).field_b = true;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(byte param0, le param1) {
        rl.a(false, param1, ((oe) this).field_c);
        if (param0 != -81) {
            ((oe) this).field_b = true;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = -93 % ((-9 - param0) / 60);
    }

    public final void update(java.awt.Graphics param0) {
    }

    oe() {
    }

    static {
    }
}
