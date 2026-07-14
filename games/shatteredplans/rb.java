/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ib implements java.awt.event.MouseWheelListener {
    private int field_g;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((rb) this).field_g = ((rb) this).field_g + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param1 <= 63) {
            Object var4 = null;
            ((rb) this).a((java.awt.Component) null, false);
        }
    }

    final synchronized int b(int param0) {
        int var2 = 124 / ((param0 - 36) / 44);
        int var3 = ((rb) this).field_g;
        ((rb) this).field_g = 0;
        return var3;
    }

    final void a(java.awt.Component param0, boolean param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (!param1) {
            Object var4 = null;
            ((rb) this).a((java.awt.Component) null, -90);
        }
    }

    rb() {
        ((rb) this).field_g = 0;
    }
}
