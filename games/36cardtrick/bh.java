/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends te implements java.awt.event.MouseWheelListener {
    private int field_c;

    final void a(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 != 0) {
            ((bh) this).field_c = 56;
        }
    }

    final void a(java.awt.Component param0, boolean param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (!param1) {
            Object var4 = null;
            ((bh) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((bh) this).field_c = ((bh) this).field_c + param0.getWheelRotation();
        param0.consume();
    }

    final synchronized int b(int param0) {
        int var2 = ((bh) this).field_c;
        ((bh) this).field_c = 0;
        int var3 = -29 % ((param0 - -38) / 54);
        return var2;
    }

    bh() {
        ((bh) this).field_c = 0;
    }
}
