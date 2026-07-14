/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends uc implements java.awt.event.MouseWheelListener {
    private int field_e;

    final synchronized int a(int param0) {
        int var3 = -21 / ((param0 - 72) / 46);
        int var2 = ((ol) this).field_e;
        ((ol) this).field_e = 0;
        return var2;
    }

    final void a(int param0, java.awt.Component param1) {
        if (param0 != 23934) {
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    final void a(java.awt.Component param0, byte param1) {
        if (param1 != -36) {
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((ol) this).field_e = ((ol) this).field_e + param0.getWheelRotation();
        param0.consume();
    }

    ol() {
        ((ol) this).field_e = 0;
    }
}
