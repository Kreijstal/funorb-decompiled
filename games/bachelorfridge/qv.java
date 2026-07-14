/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends sca implements java.awt.event.MouseWheelListener {
    private int field_e;

    final void a(java.awt.Component param0, byte param1) {
        param0.addMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (param1 > -118) {
            Object var4 = null;
            ((qv) this).a((java.awt.Component) null, (byte) 29);
        }
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent param0) {
        ((qv) this).field_e = ((qv) this).field_e + param0.getWheelRotation();
        param0.consume();
    }

    final void a(java.awt.Component param0, boolean param1) {
        param0.removeMouseWheelListener((java.awt.event.MouseWheelListener) this);
        if (!param1) {
            ((qv) this).field_e = 116;
        }
    }

    final synchronized int a(byte param0) {
        int var2 = ((qv) this).field_e;
        ((qv) this).field_e = 0;
        if (param0 >= -93) {
            return 15;
        }
        return var2;
    }

    qv() {
        ((qv) this).field_e = 0;
    }
}
