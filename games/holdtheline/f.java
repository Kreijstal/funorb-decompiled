/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends jf implements java.awt.event.MouseWheelListener {
    private int field_e;

    final synchronized int a(byte param0) {
        int var2 = ((f) this).field_e;
        ((f) this).field_e = 0;
        int var3 = -68 % ((40 - param0) / 62);
        return var2;
    }

    final void a(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        int var3 = -108 % ((-58 - param1) / 53);
    }

    f() {
        ((f) this).field_e = 0;
    }

    final void a(java.awt.Component param0, byte param1) {
        if (param1 != 106) {
            ((f) this).field_e = -40;
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((f) this).field_e = ((f) this).field_e + param0.getWheelRotation();
        param0.consume();
    }
}
