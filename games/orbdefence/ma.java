/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends pe implements java.awt.event.MouseWheelListener {
    private int field_d;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((ma) this).field_d = ((ma) this).field_d + param0.getWheelRotation();
        param0.consume();
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        if (param0 != 1) {
          int discarded$2 = ((ma) this).a(-92);
          var2 = ((ma) this).field_d;
          ((ma) this).field_d = 0;
          return var2;
        } else {
          var2 = ((ma) this).field_d;
          ((ma) this).field_d = 0;
          return var2;
        }
    }

    final void a(java.awt.Component param0, int param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param1 != 23678) {
            int discarded$0 = ((ma) this).a(-114);
        }
    }

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 <= 91) {
            ((ma) this).field_d = -35;
        }
    }

    ma() {
        ((ma) this).field_d = 0;
    }
}
