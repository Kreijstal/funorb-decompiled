/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static oh field_a;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(qj.field_c);
            param1.removeFocusListener(qj.field_c);
            db.field_R = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "le.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 90) {
            field_a = (oh) null;
        }
    }

    static {
    }
}
