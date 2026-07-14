/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class khb {
    static int field_c;
    private String field_a;
    static boolean field_b;

    final boolean a(int param0, String param1) {
        if (param0 != 0) {
            ((khb) this).field_a = null;
            return ((khb) this).field_a.equals((Object) (Object) param1);
        }
        return ((khb) this).field_a.equals((Object) (Object) param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 != 0) {
            return;
        }
        qs.a(param0, param1 ^ -124, ((khb) this).field_a, "jagex-last-login-method", 31536000L);
    }

    khb(String param0) {
        ((khb) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = false;
    }
}
