/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends gj implements java.awt.event.MouseWheelListener {
    private int field_g;

    final void a(int param0, java.awt.Component param1) {
        if (param0 != 205) {
            Object var4 = null;
            ((me) this).a((java.awt.Component) null, false);
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    final void a(java.awt.Component param0, boolean param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (!param1) {
            ((me) this).field_g = 32;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((me) this).field_g = ((me) this).field_g + param0.getWheelRotation();
        param0.consume();
    }

    final synchronized int a(byte param0) {
        if (param0 != -107) {
            return -120;
        }
        int var2 = ((me) this).field_g;
        ((me) this).field_g = 0;
        return var2;
    }

    me() {
        ((me) this).field_g = 0;
    }
}
