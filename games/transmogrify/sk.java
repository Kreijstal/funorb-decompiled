/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends rj implements java.awt.event.MouseWheelListener {
    private int field_c;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_c = this.field_c + param0.getWheelRotation();
        param0.consume();
    }

    final void a(byte param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 > -85) {
            java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
            this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        java.awt.event.MouseWheelEvent var3 = null;
        var2 = this.field_c;
        this.field_c = 0;
        if (param0 > -52) {
          var3 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          return var2;
        } else {
          return var2;
        }
    }

    sk() {
        this.field_c = 0;
    }

    final void a(boolean param0, java.awt.Component param1) {
        if (param0) {
            java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
            this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }
}
