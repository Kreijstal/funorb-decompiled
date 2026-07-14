/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sv extends el implements java.awt.event.MouseWheelListener {
    private int field_g;

    final synchronized int a(int param0) {
        int var2 = 0;
        if (param0 != 9) {
          ((sv) this).field_g = -118;
          var2 = ((sv) this).field_g;
          ((sv) this).field_g = 0;
          return var2;
        } else {
          var2 = ((sv) this).field_g;
          ((sv) this).field_g = 0;
          return var2;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((sv) this).field_g = ((sv) this).field_g + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, boolean param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (!param1) {
            Object var4 = null;
            ((sv) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final void a(int param0, java.awt.Component param1) {
        if (param0 != 0) {
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    sv() {
        ((sv) this).field_g = 0;
    }
}
