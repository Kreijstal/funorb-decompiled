/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_c;
    static int field_d;
    static java.awt.Frame field_a;
    java.awt.Frame field_b;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "he.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(int param0, d param1) {
        try {
            jk.a(this.field_b, 10, param1);
            if (param0 != 0) {
                field_a = (java.awt.Frame) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "he.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            he.a(-79);
            field_a = null;
            return;
        }
        field_a = null;
    }

    he() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        field_d = 0;
    }
}
