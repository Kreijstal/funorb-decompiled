/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends vc implements java.awt.event.MouseWheelListener {
    private int field_e;

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 != 0) {
            Object var4 = null;
            ((dl) this).a(-26, (java.awt.Component) null);
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((dl) this).field_e = ((dl) this).field_e + param0.getWheelRotation();
        param0.consume();
    }

    final void a(byte param0, java.awt.Component param1) {
        if (param0 != 71) {
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    dl() {
        ((dl) this).field_e = 0;
    }

    final synchronized int b(int param0) {
        int var2 = ((dl) this).field_e;
        ((dl) this).field_e = param0;
        return var2;
    }
}
