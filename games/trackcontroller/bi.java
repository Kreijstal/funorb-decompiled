/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends h implements java.awt.event.MouseWheelListener {
    private int field_f;

    final void a(java.awt.Component param0, int param1) {
        if (param1 != 23817) {
            Object var4 = null;
            ((bi) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
            param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    final void a(java.awt.Component param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            ((bi) this).a((java.awt.Component) null, 49);
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((bi) this).field_f = ((bi) this).field_f + param0.getWheelRotation();
        param0.consume();
    }

    bi() {
        ((bi) this).field_f = 0;
    }

    final synchronized int a(int param0) {
        int var2 = ((bi) this).field_f;
        ((bi) this).field_f = 0;
        int var3 = 32 % ((param0 - 43) / 36);
        return var2;
    }
}
