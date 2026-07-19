/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends fe implements java.awt.event.MouseWheelListener {
    private int field_h;

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 24186) {
            this.field_h = -64;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_h = this.field_h + param0.getWheelRotation();
        param0.consume();
    }

    final void a(byte param0, java.awt.Component param1) {
        if (param0 != -93) {
            java.awt.Component var4 = (java.awt.Component) null;
            this.a(17, (java.awt.Component) null);
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        var2 = this.field_h;
        if (param0 > -110) {
          this.field_h = 59;
          this.field_h = 0;
          return var2;
        } else {
          this.field_h = 0;
          return var2;
        }
    }

    hb() {
        this.field_h = 0;
    }
}
