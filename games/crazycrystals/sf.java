/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends jm implements java.awt.event.MouseWheelListener {
    private int field_l;

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((sf) this).field_l = ((sf) this).field_l + param0.getWheelRotation();
        param0.consume();
    }

    final void a(byte param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 != 55) {
            Object var4 = null;
            ((sf) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
        }
    }

    final synchronized int a(boolean param0) {
        int var2 = ((sf) this).field_l;
        if (param0) {
            return 115;
        }
        ((sf) this).field_l = 0;
        return var2;
    }

    final void a(int param0, java.awt.Component param1) {
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 != 13212) {
            ((sf) this).field_l = 59;
        }
    }

    sf() {
        ((sf) this).field_l = 0;
    }
}
