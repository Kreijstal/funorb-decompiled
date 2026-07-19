/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends oh {
    static ae field_ob;
    static boolean[] field_mb;
    static ae field_kb;
    static String field_lb;
    static jg field_pb;
    static uj field_nb;

    public static void e(boolean param0) {
        field_lb = null;
        field_ob = null;
        field_mb = null;
        field_kb = null;
        field_pb = null;
        field_nb = null;
        if (param0) {
            java.awt.Component var2 = (java.awt.Component) null;
            ui.a((java.awt.Component) null, 22);
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeMouseListener(sg.field_i);
            if (param1 < 106) {
                java.awt.Component var3 = (java.awt.Component) null;
                ui.a((java.awt.Component) null, -120);
            }
            param0.removeMouseMotionListener(sg.field_i);
            param0.removeFocusListener(sg.field_i);
            lk.field_J = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ui.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ui(f param0, qa param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void d(qa param0, int param1) {
        try {
            super.d(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ui.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_ob = new ae();
        field_mb = new boolean[64];
        field_lb = "<%0>One-touch wall:<%1> if a flea hits one of these from the side, the flea is turned around and the wall immediately crumbles away.";
        field_nb = new uj(0);
    }
}
