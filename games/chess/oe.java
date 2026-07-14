/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends ek implements java.awt.event.MouseWheelListener {
    private int field_g;

    final synchronized int a(byte param0) {
        int var2 = 0;
        Object var3 = null;
        if (param0 > -63) {
          var3 = null;
          ((oe) this).a((byte) 89, (java.awt.Component) null);
          var2 = ((oe) this).field_g;
          ((oe) this).field_g = 0;
          return var2;
        } else {
          var2 = ((oe) this).field_g;
          ((oe) this).field_g = 0;
          return var2;
        }
    }

    final void a(java.awt.Component param0, int param1) {
        if (param1 != 2) {
            ((oe) this).field_g = 28;
            param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((oe) this).field_g = ((oe) this).field_g + param0.getWheelRotation();
        param0.consume();
    }

    oe() {
        ((oe) this).field_g = 0;
    }

    final void a(byte param0, java.awt.Component param1) {
        if (param0 < 22) {
            ((oe) this).field_g = 58;
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }
}
