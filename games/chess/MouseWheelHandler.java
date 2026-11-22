/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final synchronized int pollRotation(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 <= -63) {
          var2 = this.rotation;
          this.rotation = 0;
          return var2;
        }
        java.awt.Component var3 = (java.awt.Component) null;
        this.attach((byte) 89, (java.awt.Component) null);
        var2Lifetime1 = this.rotation;
        this.rotation = 0;
        return var2Lifetime1;
    }

    final void detach(java.awt.Component param0, int param1) {
        if (param1 != 2) {
          this.rotation = 28;
          param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
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

    final void attach(byte param0, java.awt.Component param1) {
        if (param0 < 22) {
          this.rotation = 58;
          param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }
}
