/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends kb implements java.awt.event.MouseWheelListener {
    private int field_e;

    final synchronized int a(byte param0) {
        if (param0 != 60) {
            return 57;
        }
        int var2 = ((ol) this).field_e;
        ((ol) this).field_e = 0;
        return var2;
    }

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param0 != 0) {
            ((ol) this).field_e = -128;
        }
    }

    final void a(java.awt.Component param0, byte param1) {
        if (param1 < 30) {
            ((ol) this).field_e = -65;
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((ol) this).field_e = ((ol) this).field_e + param0.getWheelRotation();
        param0.consume();
    }

    ol() {
        ((ol) this).field_e = 0;
    }
}
