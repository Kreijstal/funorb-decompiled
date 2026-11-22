/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(java.awt.Component param0, int param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != 0) {
          this.pollRotation((byte) -100);
        }
    }

    final synchronized int pollRotation(byte param0) {
        if (param0 != -124) {
          return 105;
        }
        int var2 = this.rotation;
        this.rotation = 0;
        return var2;
    }

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 1000) {
          this.rotation = -107;
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
