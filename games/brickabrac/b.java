/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static jp[] field_b;
    static int field_a;
    static int field_c;

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) lj.field_j);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lj.field_j);
        try {
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) lj.field_j);
            kb.field_Pb = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "b.A(" + 20616 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
