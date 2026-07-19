/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends og implements java.awt.event.MouseWheelListener {
    private int field_c;

    final synchronized int a(byte param0) {
        if (param0 != 29) {
            return -35;
        }
        int var2 = this.field_c;
        this.field_c = 0;
        return var2;
    }

    final void a(byte param0, java.awt.Component param1) {
        int var3 = -40 % ((31 - param0) / 61);
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_c = this.field_c + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, byte param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        int var3 = 63 / ((param1 - -57) / 63);
    }

    sc() {
        this.field_c = 0;
    }
}
