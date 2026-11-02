/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int wheelDelta;

    final synchronized int consumeWheelDelta(int obfuscationGuard) {
        int var2 = this.wheelDelta;
        if (obfuscationGuard > 90) {
          this.wheelDelta = 0;
          return var2;
        }
        java.awt.Component var3 = (java.awt.Component) null;
        this.unregister((java.awt.Component) null, (byte) 53);
        this.wheelDelta = 0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.wheelDelta = this.wheelDelta + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.wheelDelta = 0;
    }

    final void unregister(java.awt.Component component, byte obfuscationGuard) {
        int var3 = -76 / ((4 - obfuscationGuard) / 60);
        component.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void register(int obfuscationGuard, java.awt.Component component) {
        component.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (obfuscationGuard != 0) {
          this.wheelDelta = -57;
        }
    }
}
