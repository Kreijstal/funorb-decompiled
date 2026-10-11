/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends a implements java.awt.event.MouseWheelListener {
    private int field_i;

    final void b(java.awt.Component param0, boolean param1) {
        if (!param1) {
          java.awt.event.MouseWheelEvent var4 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == -1) {
          var2 = this.field_i;
          this.field_i = 0;
          return var2;
        }
        java.awt.Component var3 = (java.awt.Component) null;
        this.a((java.awt.Component) null, true);
        var2Lifetime1 = this.field_i;
        this.field_i = 0;
        return var2Lifetime1;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_i = this.field_i + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, boolean param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1) {
          java.awt.Component var4 = (java.awt.Component) null;
          this.b((java.awt.Component) null, false);
        }
    }

    mk() {
        this.field_i = 0;
    }
}
