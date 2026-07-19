/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends rg implements java.awt.event.MouseWheelListener {
    private int field_g;

    final void a(byte param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != -68) {
            java.awt.Component var4 = (java.awt.Component) null;
            this.a((byte) -106, (java.awt.Component) null);
        }
    }

    final synchronized int b(byte param0) {
        int var2 = this.field_g;
        this.field_g = 0;
        if (param0 != -22) {
            return -111;
        }
        return var2;
    }

    rh() {
        this.field_g = 0;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_g = this.field_g + param0.getWheelRotation();
        param0.consume();
    }

    final void b(byte param0, java.awt.Component param1) {
        int var3 = 95 % ((-38 - param0) / 43);
        param1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }
}
