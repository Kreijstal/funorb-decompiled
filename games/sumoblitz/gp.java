/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ns implements java.awt.event.MouseWheelListener {
    private int field_d;

    final synchronized int a(int param0) {
        int var2 = ((gp) this).field_d;
        int var3 = 6 % ((param0 - 68) / 32);
        ((gp) this).field_d = 0;
        return var2;
    }

    final void a(boolean param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (!param0) {
            ((gp) this).field_d = -70;
        }
    }

    gp() {
        ((gp) this).field_d = 0;
    }

    final void a(java.awt.Component param0, byte param1) {
        if (param1 != 76) {
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((gp) this).field_d = ((gp) this).field_d + param0.getWheelRotation();
        param0.consume();
    }
}
