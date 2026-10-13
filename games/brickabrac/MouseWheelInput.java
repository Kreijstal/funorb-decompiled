/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelInput extends MouseWheelSource implements java.awt.event.MouseWheelListener {
    private int pendingRotation;

    final synchronized int pollRotation(int obfuscationGuard) {
        int var2 = this.pendingRotation;
        if (obfuscationGuard == 500) {
          this.pendingRotation = 0;
          return var2;
        }
        this.pollRotation(-58);
        this.pendingRotation = 0;
        return var2;
    }

    final void attach(byte obfuscationGuard, java.awt.Component component) {
        if (obfuscationGuard <= 37) {
          return;
        }
        component.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.pendingRotation = this.pendingRotation + param0.getWheelRotation();
        param0.consume();
    }

    final void detach(java.awt.Component component, int obfuscationGuard) {
        int var3 = 65 % ((-77 - obfuscationGuard) / 35);
        component.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    MouseWheelInput() {
        this.pendingRotation = 0;
    }
}
