/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(java.awt.Component param0, boolean param1) {
        if (param1) {
          return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        if (param0 >= 0) {
          this.rotation = 41;
          this.rotation = 0;
          return var2;
        }
        this.rotation = 0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 55) {
          this.rotation = 14;
        }
    }
}
