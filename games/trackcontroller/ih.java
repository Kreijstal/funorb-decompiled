/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_b;
    java.awt.Frame field_a;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(uf param0, int param1) {
        try {
            sg.a(this.field_a, (byte) -105, param0);
            if (param1 != 5474) {
                uf var4 = (uf) null;
                this.a((uf) null, -112);
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ih.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    ih() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ih.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
    }
}
