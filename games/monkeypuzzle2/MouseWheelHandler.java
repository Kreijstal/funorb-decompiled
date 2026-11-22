/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(java.awt.Component param0, int param1) {
        if (param1 != -8206) {
          this.rotation = 30;
          param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int pollRotation(boolean param0) {
        int var2 = this.rotation;
        this.rotation = 0;
        if (param0) {
          return var2;
        }
        java.awt.Component var3 = (java.awt.Component) null;
        this.detach(-73, (java.awt.Component) null);
        return var2;
    }

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
          this.rotation = -122;
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
