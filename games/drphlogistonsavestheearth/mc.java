/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends oi implements java.awt.event.MouseWheelListener {
    private int field_i;

    final void a(byte param0, java.awt.Component param1) {
        if (param0 > -46) {
            java.awt.Component var4 = (java.awt.Component) null;
            this.a((java.awt.Component) null, (byte) 80);
            param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void a(java.awt.Component param0, byte param1) {
        int var3 = 109 % ((param1 - 81) / 44);
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final synchronized int a(int param0) {
        int var2 = this.field_i;
        this.field_i = param0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_i = this.field_i + param0.getWheelRotation();
        param0.consume();
    }

    mc() {
        this.field_i = 0;
    }
}
