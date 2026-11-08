/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int field_e;

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 22055) {
          this.field_e = -65;
        }
    }

    final void attach(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 31131) {
          this.field_e = -1;
        }
    }

    final synchronized int pollRotation(int param0) {
        if (param0 != -23273) {
          return -48;
        }
        int var2 = this.field_e;
        this.field_e = 0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_e = this.field_e + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.field_e = 0;
    }
}
