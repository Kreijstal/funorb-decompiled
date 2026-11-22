/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final synchronized int pollRotation(int param0) {
        int var3 = -5 % ((2 - param0) / 58);
        int var2 = this.rotation;
        this.rotation = 0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void attach(java.awt.Component param0, boolean param1) {
        if (!param1) {
          this.rotation = 69;
          param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void detach(java.awt.Component param0, int param1) {
        if (param1 != 0) {
          return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
