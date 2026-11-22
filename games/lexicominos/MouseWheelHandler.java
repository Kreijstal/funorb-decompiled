/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void attach(boolean param0, java.awt.Component param1) {
        if (!param0) {
          this.rotation = -55;
          param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int pollRotation(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 > 28) {
          var2 = this.rotation;
          this.rotation = 0;
          return var2;
        }
        this.rotation = -34;
        var2Lifetime1 = this.rotation;
        this.rotation = 0;
        return var2Lifetime1;
    }

    final void detach(int param0, java.awt.Component param1) {
        if (param0 != 3) {
          java.awt.Component var4 = (java.awt.Component) null;
          this.attach(true, (java.awt.Component) null);
          param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
