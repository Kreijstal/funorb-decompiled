/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends oe implements java.awt.event.MouseWheelListener {
    private int field_h;

    final void a(java.awt.Component param0, int param1) {
        int discarded$0 = 0;
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param1 != 0) {
            discarded$0 = this.a((byte) -100);
        }
    }

    final synchronized int a(byte param0) {
        if (param0 != -124) {
            return 105;
        }
        int var2 = this.field_h;
        this.field_h = 0;
        return var2;
    }

    final void a(int param0, java.awt.Component param1) {
        param1.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (param0 != 1000) {
            this.field_h = -107;
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_h = this.field_h + param0.getWheelRotation();
        param0.consume();
    }

    na() {
        this.field_h = 0;
    }
}
