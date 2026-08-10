/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends java.awt.Canvas implements java.awt.event.FocusListener {
    static o[] field_a;
    java.awt.Frame field_c;
    volatile boolean field_b;

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ui.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(vh param0, byte param1) {
        try {
            int var3_int = -58 % ((-46 - param1) / 36);
            q.a(-119, this.field_c, param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ui.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
    }

    ui() {
    }

    final static void a(boolean param0, o[] param1) {
        try {
            f.field_d = param1;
            if (!param0) {
                field_a = (o[]) null;
            }
            if (null != f.field_d && -4 < (param1.length ^ -1)) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ui.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
    }
}
