/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
          this.rotation = 56;
        }
    }

    final void detach(java.awt.Component param0, boolean param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (!param1) {
          java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        this.rotation = 0;
        int var3 = -29 % ((param0 + 38) / 54);
        return var2;
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
