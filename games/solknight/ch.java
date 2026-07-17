/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static da field_a;
    static int field_b;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) ee.field_j);
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ee.field_j);
            int var2_int = -2;
            param0.addFocusListener((java.awt.event.FocusListener) (Object) ee.field_j);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ch.A(" + (param0 != null ? "{...}" : "null") + 44 + 122 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -34;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
