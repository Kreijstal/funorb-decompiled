/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends pe implements java.awt.event.MouseWheelListener {
    private int field_d;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_d = this.field_d + param0.getWheelRotation();
        param0.consume();
    }

    final synchronized int a(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        if (param0 != 1) {
          discarded$2 = this.a(-92);
          var2 = this.field_d;
          this.field_d = 0;
          return var2;
        } else {
          var2 = this.field_d;
          this.field_d = 0;
          return var2;
        }
    }

    final void a(java.awt.Component param0, int param1) {
        int discarded$0 = 0;
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != 23678) {
            discarded$0 = this.a(-114);
        }
    }

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 <= 91) {
            this.field_d = -35;
        }
    }

    ma() {
        this.field_d = 0;
    }
}
