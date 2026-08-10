/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_f;
    static gk field_a;
    static String field_b;
    java.awt.Frame field_e;
    static lg field_c;
    static boolean field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_f = true;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "jb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final void a(byte param0, si param1) {
        try {
            ib.a(param1, this.field_e, (byte) 110);
            if (param0 >= -106) {
                jb.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "jb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    jb() {
    }

    final static int a(int param0) {
        if (param0 != 31083) {
            field_c = (lg) null;
            return ak.field_y;
        }
        return ak.field_y;
    }

    static {
        field_b = "Type your age in years";
        field_c = new lg();
        field_d = false;
    }
}
