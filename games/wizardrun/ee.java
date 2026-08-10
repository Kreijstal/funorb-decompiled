/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ee extends rk {
    static int field_p;
    static int field_r;
    static o field_q;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeMouseListener(tc.field_m);
            param0.removeMouseMotionListener(tc.field_m);
            param0.removeFocusListener(tc.field_m);
            ve.field_d = 0;
            if (param1 != 6769) {
                java.awt.Component var3 = (java.awt.Component) null;
                ee.a((java.awt.Component) null, -20);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ee.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != -21880) {
            java.awt.Component var2 = (java.awt.Component) null;
            ee.a((java.awt.Component) null, 97);
        }
    }

    ee() {
    }

    static {
        field_p = 104;
        field_r = -1;
    }
}
