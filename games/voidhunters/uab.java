/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uab {
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
    }

    final static boolean a() {
        return knb.field_o;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) wj.field_q);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wj.field_q);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) wj.field_q);
            am.field_q = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "uab.A(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create unrated game";
        field_b = 1;
    }
}
