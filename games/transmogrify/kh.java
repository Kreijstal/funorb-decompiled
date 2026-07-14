/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static int field_d;
    static gg field_c;
    static int field_b;
    static String field_e;
    private String field_a;

    final static jc a(byte param0) {
        int var1 = 126 % ((24 - param0) / 47);
        return of.field_a;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(java.applet.Applet param0, int param1) {
        hi.a(param1, 31536000L, "jagex-last-login-method", ((kh) this).field_a, param0);
    }

    final static void a(int param0, boolean param1) {
        ci.field_f.a(0, -46, 0);
        if (param0 > -28) {
            jc discarded$0 = kh.a((byte) 88);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != 0) {
            field_e = null;
        }
    }

    final boolean a(String param0, int param1) {
        if (param1 != 0) {
            field_d = -51;
            return ((kh) this).field_a.equals((Object) (Object) param0);
        }
        return ((kh) this).field_a.equals((Object) (Object) param0);
    }

    kh(String param0) {
        ((kh) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading music";
    }
}
