/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ee extends rk {
    static int field_p;
    static int field_r;
    static o field_q;

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) tc.field_m);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) tc.field_m);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) tc.field_m);
        ve.field_d = 0;
        if (param1 != 6769) {
            Object var3 = null;
            ee.a((java.awt.Component) null, -20);
        }
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != -21880) {
            Object var2 = null;
            ee.a((java.awt.Component) null, 97);
        }
    }

    ee() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 104;
        field_r = -1;
    }
}
