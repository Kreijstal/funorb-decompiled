/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static da field_a;
    static int field_b;

    final static void a(java.awt.Component param0, int param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) ee.field_j);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ee.field_j);
        int var2 = -95 % ((param1 - -25) / 37);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) ee.field_j);
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -104 / ((0 - param0) / 32);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
