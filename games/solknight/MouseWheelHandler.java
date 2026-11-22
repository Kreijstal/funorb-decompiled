/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void detach(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 > -117) {
          this.rotation = 112;
        }
    }

    final void attach(java.awt.Component param0, boolean param1) {
        if (!param1) {
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

    final synchronized int pollRotation(int param0) {
        if (param0 != 9408) {
          return 60;
        }
        int var2 = this.rotation;
        this.rotation = 0;
        return var2;
    }
}
