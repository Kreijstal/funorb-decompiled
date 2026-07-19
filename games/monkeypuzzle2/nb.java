/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends cc implements java.awt.event.MouseWheelListener {
    private int field_c;

    final void a(java.awt.Component param0, int param1) {
        if (param1 != -8206) {
            this.field_c = 30;
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        java.awt.Component var3 = null;
        var2 = this.field_c;
        this.field_c = 0;
        if (!param0) {
          var3 = (java.awt.Component) null;
          this.a(-73, (java.awt.Component) null);
          return var2;
        } else {
          return var2;
        }
    }

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
            this.field_c = -122;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_c = this.field_c + param0.getWheelRotation();
        param0.consume();
    }

    nb() {
        this.field_c = 0;
    }
}
