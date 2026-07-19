/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends ee implements java.awt.event.MouseWheelListener {
    private int field_h;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_h = this.field_h + param0.getWheelRotation();
        param0.consume();
    }

    final void a(boolean param0, java.awt.Component param1) {
        if (!param0) {
            this.field_h = -55;
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        if (param0 <= 28) {
          this.field_h = -34;
          var2 = this.field_h;
          this.field_h = 0;
          return var2;
        } else {
          var2 = this.field_h;
          this.field_h = 0;
          return var2;
        }
    }

    final void a(int param0, java.awt.Component param1) {
        if (param0 != 3) {
            java.awt.Component var4 = (java.awt.Component) null;
            this.a(true, (java.awt.Component) null);
            param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    ie() {
        this.field_h = 0;
    }
}
