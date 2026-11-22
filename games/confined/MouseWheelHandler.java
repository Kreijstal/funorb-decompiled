/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void detach(java.awt.Component param0, byte param1) {
        if (param1 != -30) {
          this.rotation = 66;
          param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void attach(java.awt.Component param0, int param1) {
        if (param1 != 4) {
          this.rotation = 97;
          param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int pollRotation(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 8) {
          var2 = this.rotation;
          this.rotation = 0;
          return var2;
        }
        java.awt.Component var3 = (java.awt.Component) null;
        this.detach((java.awt.Component) null, (byte) 25);
        var2Lifetime1 = this.rotation;
        this.rotation = 0;
        return var2Lifetime1;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
