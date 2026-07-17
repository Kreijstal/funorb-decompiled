/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs {
    static dk field_a;
    static String field_c;
    static int[] field_b;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) wk.field_h);
        try {
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wk.field_h);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) wk.field_h);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "gs.B(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new dk();
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
