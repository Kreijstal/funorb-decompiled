/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends vk implements java.awt.event.MouseWheelListener {
    private int field_f;

    final void a(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 < 121) {
            this.field_f = -83;
        }
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        java.awt.event.MouseWheelEvent var3 = null;
        if (!param0) {
          var3 = (java.awt.event.MouseWheelEvent) null;
          this.mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          var2 = this.field_f;
          this.field_f = 0;
          return var2;
        } else {
          var2 = this.field_f;
          this.field_f = 0;
          return var2;
        }
    }

    gl() {
        this.field_f = 0;
    }

    final void a(java.awt.Component param0, byte param1) {
        int var3 = -28 % ((2 - param1) / 59);
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_f = this.field_f + param0.getWheelRotation();
        param0.consume();
    }
}
