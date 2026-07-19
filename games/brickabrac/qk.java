/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends gk implements java.awt.event.MouseWheelListener {
    private int field_e;

    final synchronized int b(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        var2 = this.field_e;
        if (param0 != 500) {
          discarded$2 = this.b(-58);
          this.field_e = 0;
          return var2;
        } else {
          this.field_e = 0;
          return var2;
        }
    }

    final void a(byte param0, java.awt.Component param1) {
        if (param0 <= 37) {
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_e = this.field_e + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, int param1) {
        int var3 = 65 % ((-77 - param1) / 35);
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    qk() {
        this.field_e = 0;
    }
}
