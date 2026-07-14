/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ta implements java.awt.event.MouseWheelListener {
    private int field_g;

    final synchronized int a(int param0) {
        int var2 = 0;
        var2 = ((nd) this).field_g;
        if (param0 != -1) {
          ((nd) this).field_g = -82;
          ((nd) this).field_g = 0;
          return var2;
        } else {
          ((nd) this).field_g = 0;
          return var2;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((nd) this).field_g = ((nd) this).field_g + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param1 != -13) {
            Object var4 = null;
            ((nd) this).b((java.awt.Component) null, 115);
        }
    }

    nd() {
        ((nd) this).field_g = 0;
    }

    final void b(java.awt.Component param0, int param1) {
        if (param1 != -1) {
            int discarded$0 = ((nd) this).a(53);
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }
}
