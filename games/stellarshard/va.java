/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_c;
    java.awt.Frame field_d;
    static li field_b;
    static String field_a;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final void a(ej param0, int param1) {
        try {
            kf.a(this.field_d, 16711935, param0);
            if (param1 > -10) {
                java.awt.event.FocusEvent var4 = (java.awt.event.FocusEvent) null;
                this.focusGained((java.awt.event.FocusEvent) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "va.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "va.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 16 % ((28 - param0) / 52);
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -844) {
            va.a(false, 19);
            th.a(param0, false, 4);
            return;
        }
        th.a(param0, false, 4);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    va() {
    }

    static {
        field_b = new li(9, 0, 4, 1);
    }
}
