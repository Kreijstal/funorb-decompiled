/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(byte param0, java.awt.Component param1) {
        int var3 = -104 / ((param0 - 65) / 34);
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        this.rotation = 0;
        if (param0 != 6) {
          return -79;
        }
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(boolean param0, java.awt.Component param1) {
        if (param0) {
          java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
