/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
          this.rotation = 13;
        }
    }

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        this.rotation = param0;
        return var2;
    }

    final void detach(byte param0, java.awt.Component param1) {
        if (param0 <= 101) {
          return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
