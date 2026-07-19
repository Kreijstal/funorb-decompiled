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
            java.awt.Component var2 = (java.awt.Component) null;
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
            param0.addKeyListener(ha.field_b);
            param0.addFocusListener(ha.field_b);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "h.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = new he("usename");
    }
}
