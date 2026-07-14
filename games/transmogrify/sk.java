/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends rj implements java.awt.event.MouseWheelListener {
    private int field_c;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((sk) this).field_c = ((sk) this).field_c + param0.getWheelRotation();
        param0.consume();
    }

    final void a(byte param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 > -85) {
            Object var4 = null;
            ((sk) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = ((sk) this).field_c;
        ((sk) this).field_c = 0;
        if (param0 > -52) {
          var3 = null;
          ((sk) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
          return var2;
        } else {
          return var2;
        }
    }

    sk() {
        ((sk) this).field_c = 0;
    }

    final void a(boolean param0, java.awt.Component param1) {
        if (param0) {
            Object var4 = null;
            ((sk) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }
}
