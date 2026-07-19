/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends kf implements java.awt.event.MouseWheelListener {
    private int field_c;

    final void a(java.awt.Component param0, boolean param1) {
        if (param1) {
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    af() {
        this.field_c = 0;
    }

    final synchronized int a(int param0) {
        int var2 = this.field_c;
        if (param0 >= 0) {
            this.field_c = 41;
            this.field_c = 0;
            return var2;
        }
        this.field_c = 0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_c = this.field_c + param0.getWheelRotation();
        param0.consume();
    }

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 55) {
            this.field_c = 14;
        }
    }
}
