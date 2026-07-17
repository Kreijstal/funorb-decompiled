/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends java.awt.Canvas {
    static st field_b;
    static double field_c;
    static me[] field_a;
    private java.awt.Component field_d;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((gj) this).field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gj.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, String param1) {
        try {
            ke.a(-1, param1);
            if (!param0) {
                Object var3 = null;
                gj.a(true, (String) null);
            }
            ua.a(ec.field_o, false, (byte) 82);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gj.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((gj) this).field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gj.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    gj(java.awt.Component param0) {
        try {
            ((gj) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new st();
        field_c = Math.atan2(1.0, 0.0);
    }
}
