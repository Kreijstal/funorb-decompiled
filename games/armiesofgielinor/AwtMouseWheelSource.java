/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtMouseWheelSource extends MouseWheelSource implements java.awt.event.MouseWheelListener {
    private int accumulatedRotation;

    final synchronized int takeRotation(int obfuscationGuard) {
        int var2 = 0;
        int var2Lifetime1;
        if (obfuscationGuard == 9) {
          var2 = this.accumulatedRotation;
          this.accumulatedRotation = 0;
          return var2;
        }
        this.accumulatedRotation = -118;
        var2Lifetime1 = this.accumulatedRotation;
        this.accumulatedRotation = 0;
        return var2Lifetime1;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.accumulatedRotation = this.accumulatedRotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(java.awt.Component component, boolean removeGuard) {
        component.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (!removeGuard) {
          java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final void attach(int obfuscationGuard, java.awt.Component component) {
        if (obfuscationGuard != 0) {
          return;
        }
        component.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    AwtMouseWheelSource() {
        this.accumulatedRotation = 0;
    }
}
