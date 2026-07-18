/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends tc {
    static String field_l;
    int field_p;
    int[] field_m;
    int[] field_v;
    wo[] field_k;
    wo[] field_r;
    static wk field_n;
    byte[][][] field_u;
    static String field_s;
    static long field_o;
    int[] field_t;
    int field_q;

    final static void a(java.awt.Component param0) {
        try {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) lf.field_q);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lf.field_q);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) lf.field_q);
            ob.field_J = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "dc.C(" + (param0 != null ? "{...}" : "null") + ',' + -37 + ')');
        }
    }

    final static wd a(boolean param0) {
        wd var2 = new wd(true);
        var2.field_h = param0 ? true : false;
        return var2;
    }

    public static void a() {
        field_s = null;
        field_l = null;
        field_n = null;
    }

    dc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Chat is currently disabled.";
        field_n = new wk(540, 140);
        field_s = "High";
    }
}
