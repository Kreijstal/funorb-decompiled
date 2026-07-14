/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends nl implements java.awt.event.MouseWheelListener {
    private int field_h;

    final void a(byte param0, java.awt.Component param1) {
        int var3 = -104 / ((param0 - 65) / 34);
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    final synchronized int a(int param0) {
        int var2 = ((sk) this).field_h;
        ((sk) this).field_h = 0;
        if (param0 != 6) {
            return -79;
        }
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((sk) this).field_h = ((sk) this).field_h + param0.getWheelRotation();
        param0.consume();
    }

    final void a(boolean param0, java.awt.Component param1) {
        if (param0) {
            Object var4 = null;
            ((sk) this).mouseWheelMoved((java.awt.event.MouseWheelEvent) null);
            param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    sk() {
        ((sk) this).field_h = 0;
    }
}
