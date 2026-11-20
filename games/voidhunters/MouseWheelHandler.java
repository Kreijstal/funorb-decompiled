/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        if (param0 == 1) {
          this.rotation = 0;
          return var2;
        }
        this.rotation = -13;
        this.rotation = 0;
        return var2;
    }

    final void attach(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 >= -3) {
          this.rotation = -12;
        }
    }

    final void detach(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != -21835) {
          this.rotation = -128;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
