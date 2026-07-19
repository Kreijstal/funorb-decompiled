/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends jb implements java.awt.event.MouseWheelListener {
    private int field_f;

    final synchronized int a(int param0) {
        int var2 = 0;
        java.awt.Component var3 = null;
        var2 = this.field_f;
        if (param0 <= 90) {
          var3 = (java.awt.Component) null;
          this.a((java.awt.Component) null, (byte) 53);
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

    ii() {
        this.field_f = 0;
    }

    final void a(java.awt.Component param0, byte param1) {
        int var3 = -76 / ((4 - param1) / 60);
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void a(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 0) {
            this.field_f = -57;
        }
    }
}
