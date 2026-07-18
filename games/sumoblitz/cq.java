/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_c;
    java.awt.Frame field_b;
    volatile boolean field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((cq) this).field_a = true;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cq.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(boolean param0) {
        field_c = null;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static nm a(int param0, int param1, int param2, int param3, byte param4) {
        return new nm(param3, param1, param2, param0);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(boolean param0, wi param1) {
        try {
            wj.a(((cq) this).field_b, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Back";
    }
}
