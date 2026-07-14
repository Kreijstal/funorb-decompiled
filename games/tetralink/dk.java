/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static String field_a;
    static int field_b;
    private String field_c;
    static jb field_d;

    final void a(byte param0, java.applet.Applet param1) {
        ma.a(((dk) this).field_c, 31536000L, param1, 118, "jagex-last-login-method");
        if (param0 >= -69) {
            ((dk) this).field_c = null;
        }
    }

    public static void a(int param0) {
        if (param0 != -5384) {
            dk.a(-20);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0, String param1) {
        if (param0 != 16412) {
            field_a = null;
            return ((dk) this).field_c.equals((Object) (Object) param1);
        }
        return ((dk) this).field_c.equals((Object) (Object) param1);
    }

    dk(String param0) {
        ((dk) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Show private chat from my friends and opponents";
    }
}
