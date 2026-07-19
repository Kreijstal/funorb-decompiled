/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends il implements java.awt.event.MouseWheelListener {
    private int field_l;

    final synchronized int a(int param0) {
        int var3 = -5 % ((2 - param0) / 58);
        int var2 = this.field_l;
        this.field_l = 0;
        return var2;
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        this.field_l = this.field_l + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            this.field_l = 69;
            param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
            return;
        }
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    final void a(java.awt.Component param0, int param1) {
        if (param1 != 0) {
            return;
        }
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    vk() {
        this.field_l = 0;
    }
}
