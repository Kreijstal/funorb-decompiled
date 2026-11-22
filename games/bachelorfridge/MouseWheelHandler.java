/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(java.awt.Component param0, byte param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 > -118) {
          java.awt.Component var4 = (java.awt.Component) null;
          this.attach((java.awt.Component) null, (byte) 29);
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(java.awt.Component param0, boolean param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (!param1) {
          this.rotation = 116;
        }
    }

    final synchronized int pollRotation(byte param0) {
        int var2 = this.rotation;
        this.rotation = 0;
        if (param0 >= -93) {
          return 15;
        }
        return var2;
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
