/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final synchronized int pollRotation(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 1) {
          var2 = this.rotation;
          this.rotation = 0;
          return var2;
        }
        this.pollRotation(-92);
        var2Lifetime1 = this.rotation;
        this.rotation = 0;
        return var2Lifetime1;
    }

    final void attach(java.awt.Component param0, int param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != 23678) {
          this.pollRotation(-114);
        }
    }

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 <= 91) {
          this.rotation = -35;
        }
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
