/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static jp[] field_b;
    static int field_a;
    static int field_c;

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener(lj.field_j);
        param1.removeMouseMotionListener(lj.field_j);
        if (param0 != 20616) {
            return;
        }
        try {
            param1.removeFocusListener(lj.field_j);
            kb.field_Pb = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "b.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_a = 50;
        }
    }

    static {
        field_a = -1;
    }
}
