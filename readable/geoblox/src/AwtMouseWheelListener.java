/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtMouseWheelListener extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int accumulatedRotation;

    final void attachWheelListener(int methodGuard, java.awt.Component component) {
        component.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (methodGuard < 121) {
            this.accumulatedRotation = -83;
        }
    }

    final synchronized int drainWheelRotation(boolean drainGuard) {
        int rotationSnapshot = 0;
        if (drainGuard) {
            rotationSnapshot = this.accumulatedRotation;
            this.accumulatedRotation = 0;
            return rotationSnapshot;
        }
        java.awt.event.MouseWheelEvent guardedNullWheelEventSnapshot = (java.awt.event.MouseWheelEvent) null;
        this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        rotationSnapshot = this.accumulatedRotation;
        this.accumulatedRotation = 0;
        return rotationSnapshot;
    }

    AwtMouseWheelListener() {
        this.accumulatedRotation = 0;
    }

    final void detachWheelListener(java.awt.Component component, byte methodGuard) {
        int guardResidue = -28 % ((2 - methodGuard) / 59);
        component.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent event) {
        this.accumulatedRotation = this.accumulatedRotation + event.getWheelRotation();
        event.consume();
    }
}
