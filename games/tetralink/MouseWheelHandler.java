/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseWheelHandler extends MouseWheelInput implements java.awt.event.MouseWheelListener {
    private int field_d;

    final void detach(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
          java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final void attach(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 >= -112) {
          this.takeRotation(12);
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_d = this.field_d + param0.getWheelRotation();
        param0.consume();
    }

    MouseWheelHandler() {
        this.field_d = 0;
    }

    final synchronized int takeRotation(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 12224) {
          var2 = this.field_d;
          this.field_d = 0;
          return var2;
        }
        this.field_d = -111;
        var2Lifetime1 = this.field_d;
        this.field_d = 0;
        return var2Lifetime1;
    }
}
