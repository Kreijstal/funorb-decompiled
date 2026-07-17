/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends q {
    int[] field_k;
    static he field_l;
    boolean field_n;
    int field_m;
    static int field_j;

    public static void a(int param0) {
        field_l = null;
        if (param0 != 13809) {
            Object var2 = null;
            h.a((java.awt.Component) null, 108);
        }
    }

    h() {
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            if (param1 != -8662) {
                h.a(10);
            }
            param0.addKeyListener((java.awt.event.KeyListener) (Object) ha.field_b);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) ha.field_b);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "h.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new he("usename");
    }
}
