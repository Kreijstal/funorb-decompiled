/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 24186) {
          this.rotation = -64;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final void attach(byte param0, java.awt.Component param1) {
        if (param0 != -93) {
          java.awt.Component var4 = (java.awt.Component) null;
          this.detach(17, (java.awt.Component) null);
          param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int pollRotation(int param0) {
        int var2 = this.rotation;
        if (param0 <= -110) {
          this.rotation = 0;
          return var2;
        }
        this.rotation = 59;
        this.rotation = 0;
        return var2;
    }

    MouseWheelHandler() {
        this.rotation = 0;
    }
}
