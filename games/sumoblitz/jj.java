/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static jn field_a;
    private String field_e;
    static ri[] field_c;
    static int field_b;
    static int field_d;
    static qr field_f;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 0) {
            jj.a(-108);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean a(String param0, int param1) {
        if (param1 != -2183) {
            field_f = null;
            return ((jj) this).field_e.equals((Object) (Object) param0);
        }
        return ((jj) this).field_e.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(boolean param0, java.applet.Applet param1) {
        gj.a(31536000L, param1, param0, ((jj) this).field_e, "jagex-last-login-method");
    }

    jj(String param0) {
        ((jj) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new jn();
        field_b = 0;
        field_d = 0;
        field_f = new qr();
    }
}
