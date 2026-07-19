/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends qg implements java.awt.event.MouseWheelListener {
    private int field_f;

    final synchronized int b(int param0) {
        int var2 = 0;
        java.awt.event.MouseWheelEvent var3 = null;
        var2 = this.field_f;
        if (param0 != 12) {
          var3 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          this.field_f = 0;
          return var2;
        } else {
          this.field_f = 0;
          return var2;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_f = this.field_f + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, boolean param1) {
        int discarded$0 = 0;
        if (param1) {
            discarded$0 = this.b(-92);
            param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    bq() {
        this.field_f = 0;
    }

    final void a(java.awt.Component param0, int param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 > -44) {
            this.field_f = 100;
        }
    }
}
