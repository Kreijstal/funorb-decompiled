/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final synchronized int takeRotation(int param0) {
        int var3 = -21 / ((param0 - 72) / 46);
        int var2 = this.rotation;
        this.rotation = 0;
        return var2;
    }

    final void attach(int param0, java.awt.Component param1) {
        if (param0 != 23934) {
          return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void detach(java.awt.Component param0, byte param1) {
        if (param1 != -36) {
          return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
