/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends id implements java.awt.event.MouseWheelListener {
    private int field_e;

    final synchronized int b(int param0) {
        if (param0 != 2) {
            return 48;
        }
        int var2 = this.field_e;
        this.field_e = 0;
        return var2;
    }

    final void a(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        int var3 = -123 / ((-57 - param1) / 47);
    }

    final void a(byte param0, java.awt.Component param1) {
        int var3 = 44 % ((param0 - 66) / 33);
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_e = this.field_e + param0.getWheelRotation();
        param0.consume();
    }

    po() {
        this.field_e = 0;
    }
}
