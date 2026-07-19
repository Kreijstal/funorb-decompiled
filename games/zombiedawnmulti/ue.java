/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends mf implements java.awt.event.MouseWheelListener {
    private int field_d;

    final void a(java.awt.Component param0, byte param1) {
        int discarded$0 = 0;
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != 62) {
            discarded$0 = this.b(-86);
        }
    }

    final void a(byte param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        int var3 = 94 % ((28 - param0) / 57);
    }

    final synchronized int b(int param0) {
        int var2 = this.field_d;
        this.field_d = 0;
        int var3 = -8 / ((-30 - param0) / 50);
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_d = this.field_d + param0.getWheelRotation();
        param0.consume();
    }

    ue() {
        this.field_d = 0;
    }
}
