/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends hm implements java.awt.event.MouseWheelListener {
    private int field_f;

    final void a(int param0, java.awt.Component param1) {
        if (param0 <= 10) {
            ((ag) this).field_f = 89;
            param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((ag) this).field_f = ((ag) this).field_f + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, int param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param1 != -63) {
            Object var4 = null;
            ((ag) this).a((java.awt.Component) null, 100);
        }
    }

    ag() {
        ((ag) this).field_f = 0;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        var2 = ((ag) this).field_f;
        if (param0 != 60) {
          ((ag) this).field_f = 41;
          ((ag) this).field_f = 0;
          return var2;
        } else {
          ((ag) this).field_f = 0;
          return var2;
        }
    }
}
