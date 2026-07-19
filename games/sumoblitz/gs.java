/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs {
    static dk field_a;
    static String field_c;
    static int[] field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 14) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        param0.addMouseListener(wk.field_h);
        if (!param1) {
            return;
        }
        try {
            param0.addMouseMotionListener(wk.field_h);
            param0.addFocusListener(wk.field_h);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gs.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = new dk();
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
