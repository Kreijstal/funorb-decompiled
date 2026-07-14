/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hfa extends qaa implements java.awt.event.MouseWheelListener {
    private int field_b;

    final void a(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 >= -45) {
            ((hfa) this).field_b = -99;
        }
    }

    hfa() {
        ((hfa) this).field_b = 0;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((hfa) this).field_b = ((hfa) this).field_b + param0.getWheelRotation();
        param0.consume();
    }

    final void b(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        int var3 = 24 / ((33 - param0) / 40);
    }

    final synchronized int b(int param0) {
        int var3 = 73 % ((param0 - 11) / 51);
        int var2 = ((hfa) this).field_b;
        ((hfa) this).field_b = 0;
        return var2;
    }
}
