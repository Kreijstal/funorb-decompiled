/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends ck implements java.awt.event.MouseWheelListener {
    private int field_c;

    final void a(java.awt.Component param0, byte param1) {
        if (param1 != -30) {
            this.field_c = 66;
            param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void a(java.awt.Component param0, int param1) {
        if (param1 != 4) {
            this.field_c = 97;
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        java.awt.Component var3 = null;
        if (param0 != 8) {
          var3 = (java.awt.Component) null;
          this.a((java.awt.Component) null, (byte) 25);
          var2 = this.field_c;
          this.field_c = 0;
          return var2;
        } else {
          var2 = this.field_c;
          this.field_c = 0;
          return var2;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_c = this.field_c + param0.getWheelRotation();
        param0.consume();
    }

    tc() {
        this.field_c = 0;
    }
}
