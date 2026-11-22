/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtMouseWheelListener extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        if (param0 == 12) {
          this.rotation = 0;
          return var2;
        }
        java.awt.event.MouseWheelEvent var3 = (java.awt.event.MouseWheelEvent) null;
        this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        this.rotation = 0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(java.awt.Component param0, boolean param1) {
        if (param1) {
          this.pollRotation(-92);
          param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    AwtMouseWheelListener() {
        this.rotation = 0;
    }

    final void attach(java.awt.Component param0, int param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 > -44) {
          this.rotation = 100;
        }
    }
}
