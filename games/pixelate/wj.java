/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends v implements java.awt.event.MouseWheelListener {
    private int field_f;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((wj) this).field_f = ((wj) this).field_f + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, int param1) {
        if (param1 >= -86) {
            ((wj) this).field_f = 98;
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    final void a(int param0, java.awt.Component param1) {
        if (param0 != 18421) {
            return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    final synchronized int b(boolean param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = ((wj) this).field_f;
        ((wj) this).field_f = 0;
        if (!param0) {
          var3 = null;
          ((wj) this).a(-71, (java.awt.Component) null);
          return var2;
        } else {
          return var2;
        }
    }

    wj() {
        ((wj) this).field_f = 0;
    }
}
