/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static da field_a;
    static int field_b;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener(ee.field_j);
            param0.addMouseMotionListener(ee.field_j);
            int var2_int = -95 % ((param1 - -25) / 37);
            param0.addFocusListener(ee.field_j);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ch.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -104 / ((0 - param0) / 32);
    }

    static {
        field_b = -1;
    }
}
