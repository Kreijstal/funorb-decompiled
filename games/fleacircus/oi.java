/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends jg implements java.awt.event.MouseWheelListener {
    private int field_g;

    final void a(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
            this.field_g = 13;
        }
    }

    final synchronized int b(int param0) {
        int var2 = this.field_g;
        this.field_g = param0;
        return var2;
    }

    final void a(byte param0, java.awt.Component param1) {
        if (param0 <= 101) {
            return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_g = this.field_g + param0.getWheelRotation();
        param0.consume();
    }

    oi() {
        this.field_g = 0;
    }
}
