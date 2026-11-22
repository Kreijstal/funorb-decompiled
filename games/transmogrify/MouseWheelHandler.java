/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(byte param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 > -85) {
          java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        this.rotation = 0;
        if (param0 <= -52) {
          return var2;
        }
        java.awt.event.MouseWheelEvent var3 = (java.awt.event.MouseWheelEvent) null;
        this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        return var2;
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }

    final void attach(boolean param0, java.awt.Component param1) {
        if (param0) {
          java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }
}
