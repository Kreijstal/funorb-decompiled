/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final synchronized int pollRotation(byte param0) {
        int var2 = this.rotation;
        this.rotation = 0;
        int var3 = -68 % ((40 - param0) / 62);
        return var2;
    }

    final void detach(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        int var3 = -108 % ((-58 - param1) / 53);
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }

    final void attach(java.awt.Component param0, byte param1) {
        if (param1 != 106) {
          this.rotation = -40;
          param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }
}
