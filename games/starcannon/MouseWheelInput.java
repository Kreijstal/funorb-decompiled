/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelInput extends MouseWheelSource implements java.awt.event.MouseWheelListener {
    private int rotation;

    final void attach(int param0, java.awt.Component param1) {
        if (param0 != 205) {
          java.awt.Component var4 = (java.awt.Component) null;
          this.detach((java.awt.Component) null, false);
          param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void detach(java.awt.Component param0, boolean param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (!param1) {
          this.rotation = 32;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotation = this.rotation + param0.getWheelRotation();
        param0.consume();
    }

    final synchronized int pollRotation(byte param0) {
        if (param0 != -107) {
          return -120;
        }
        int var2 = this.rotation;
        this.rotation = 0;
        return var2;
    }

    MouseWheelInput() {
        this.rotation = 0;
    }
}
