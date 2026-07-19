/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends fg implements java.awt.event.MouseWheelListener {
    private int field_b;

    final synchronized int b(int param0) {
        int var2 = 0;
        var2 = this.field_b;
        if (param0 != 1) {
          this.field_b = -13;
          this.field_b = 0;
          return var2;
        } else {
          this.field_b = 0;
          return var2;
        }
    }

    final void a(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 >= -3) {
            this.field_b = -12;
        }
    }

    final void a(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != -21835) {
            this.field_b = -128;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_b = this.field_b + param0.getWheelRotation();
        param0.consume();
    }

    an() {
        this.field_b = 0;
    }
}
