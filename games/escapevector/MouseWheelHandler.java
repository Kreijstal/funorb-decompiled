/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int pendingRotation;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.pendingRotation = this.pendingRotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(int guard, java.awt.Component component) {
        if (guard != -5070) {
          this.pendingRotation = -54;
          component.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        component.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    MouseWheelHandler() {
        this.pendingRotation = 0;
    }

    final void attach(java.awt.Component component, boolean guard) {
        component.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (!guard) {
          java.awt.Component var4 = (java.awt.Component) null;
          this.detach(-63, (java.awt.Component) null);
        }
    }

    final synchronized int pollRotation(int guard) {
        int var2 = this.pendingRotation;
        if (guard <= -3) {
          this.pendingRotation = 0;
          return var2;
        }
        java.awt.Component var3 = (java.awt.Component) null;
        this.attach((java.awt.Component) null, true);
        this.pendingRotation = 0;
        return var2;
    }
}
