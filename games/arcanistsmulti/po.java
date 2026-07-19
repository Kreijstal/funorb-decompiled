/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends hh implements java.awt.event.MouseWheelListener {
    private int field_f;

    final void a(java.awt.Component param0, byte param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != -22) {
            java.awt.Component var4 = (java.awt.Component) null;
            this.a((java.awt.Component) null, (byte) -30);
        }
    }

    final synchronized int a(int param0) {
        if (param0 != -1) {
            return -58;
        }
        int var2 = this.field_f;
        this.field_f = 0;
        return var2;
    }

    final void a(int param0, java.awt.Component param1) {
        if (param0 != -15238) {
            this.field_f = -101;
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_f = this.field_f + param0.getWheelRotation();
        param0.consume();
    }

    po() {
        this.field_f = 0;
    }
}
