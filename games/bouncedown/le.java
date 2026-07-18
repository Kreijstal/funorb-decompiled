/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static oh field_a;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener((java.awt.event.KeyListener) (Object) qj.field_c);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) qj.field_c);
            db.field_R = -1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "le.B(" + -1 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_a = null;
    }

    static {
    }
}
