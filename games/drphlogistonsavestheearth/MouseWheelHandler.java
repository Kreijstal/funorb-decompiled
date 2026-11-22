/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(byte param0, java.awt.Component param1) {
        if (param0 > -46) {
          java.awt.Component var4 = (java.awt.Component) null;
          this.detach((java.awt.Component) null, (byte) 80);
          param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void detach(java.awt.Component param0, byte param1) {
        int var3 = 109 % ((param1 - 81) / 44);
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        this.rotation = param0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
