/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends java.awt.Canvas {
    static int field_c;
    private java.awt.Component field_a;
    static boolean field_b;

    public final void update(java.awt.Graphics param0) {
        ((gd) this).field_a.update(param0);
    }

    public final void paint(java.awt.Graphics param0) {
        ((gd) this).field_a.paint(param0);
    }

    gd(java.awt.Component param0) {
        ((gd) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
