/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int rotationDelta;

    final synchronized int pollDelta(int guard) {
        int var2 = this.rotationDelta;
        int var3 = 6 % ((guard - 68) / 32);
        this.rotationDelta = 0;
        return var2;
    }

    final void attach(boolean guard, java.awt.Component component) {
        component.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (!guard) {
          this.rotationDelta = -70;
        }
    }

    MouseWheelHandler() {
        this.rotationDelta = 0;
    }

    final void detach(java.awt.Component component, byte guard) {
        if (guard != 76) {
          return;
        }
        component.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.rotationDelta = this.rotationDelta + param0.getWheelRotation();
        param0.consume();
    }
}
