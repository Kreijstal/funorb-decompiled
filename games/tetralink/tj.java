/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends se implements java.awt.event.MouseWheelListener {
    private int field_d;

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 != 0) {
            Object var4 = null;
            ((tj) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final void b(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 >= -112) {
            int discarded$0 = ((tj) this).a(12);
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((tj) this).field_d = ((tj) this).field_d + param0.getWheelRotation();
        param0.consume();
    }

    tj() {
        ((tj) this).field_d = 0;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        if (param0 != 12224) {
          ((tj) this).field_d = -111;
          var2 = ((tj) this).field_d;
          ((tj) this).field_d = 0;
          return var2;
        } else {
          var2 = ((tj) this).field_d;
          ((tj) this).field_d = 0;
          return var2;
        }
    }
}
