/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final synchronized int pollRotation(byte param0) {
        if (param0 != 60) {
          return 57;
        }
        int var2 = this.rotation;
        this.rotation = 0;
        return var2;
    }

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
          this.rotation = -128;
        }
    }

    final void attach(java.awt.Component param0, byte param1) {
        if (param1 < 30) {
          this.rotation = -65;
          param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
