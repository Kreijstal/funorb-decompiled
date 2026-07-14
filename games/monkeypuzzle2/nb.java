/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends cc implements java.awt.event.MouseWheelListener {
    private int field_c;

    final void a(java.awt.Component param0, int param1) {
        if (param1 != -8206) {
            ((nb) this).field_c = 30;
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = ((nb) this).field_c;
        ((nb) this).field_c = 0;
        if (!param0) {
          var3 = null;
          ((nb) this).a(-73, (java.awt.Component) null);
          return var2;
        } else {
          return var2;
        }
    }

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 != 0) {
            ((nb) this).field_c = -122;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((nb) this).field_c = ((nb) this).field_c + param0.getWheelRotation();
        param0.consume();
    }

    nb() {
        ((nb) this).field_c = 0;
    }
}
