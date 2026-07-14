/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends lf implements java.awt.event.MouseWheelListener {
    private int field_g;

    final void a(java.awt.Component param0, int param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param1 > -117) {
            ((sc) this).field_g = 112;
        }
    }

    final void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((sc) this).field_g = ((sc) this).field_g + param0.getWheelRotation();
        param0.consume();
    }

    sc() {
        ((sc) this).field_g = 0;
    }

    final synchronized int a(int param0) {
        if (param0 != 9408) {
            return 60;
        }
        int var2 = ((sc) this).field_g;
        ((sc) this).field_g = 0;
        return var2;
    }
}
