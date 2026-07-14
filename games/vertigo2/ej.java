/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    private String field_a;
    static String field_b;
    static volatile boolean field_f;
    static String field_e;
    static byte[][] field_c;
    static String field_d;

    final static er a(byte param0) {
        int var5_int = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var1 = 110 / ((param0 - 43) / 32);
        int var2 = mh.field_c[0] * vi.field_w[0];
        byte[] var3 = se.field_y[0];
        int[] var4 = new int[var2];
        for (var5_int = 0; var5_int < var2; var5_int++) {
            var4[var5_int] = in.field_c[b.a(255, (int) var3[var5_int])];
        }
        er var5 = new er(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], var4);
        la.a((byte) 17);
        return var5;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        int var1 = 61 / ((param0 - 81) / 32);
        field_c = null;
    }

    final void a(java.applet.Applet param0, byte param1) {
        int var3 = 121 / ((-13 - param1) / 47);
        gl.a(-11, 31536000L, param0, ((ej) this).field_a, "jagex-last-login-method");
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ej(String param0) {
        ((ej) this).field_a = param0;
    }

    final boolean a(int param0, String param1) {
        if (param0 != 31588) {
            boolean discarded$0 = ((ej) this).a(-78, (String) null);
        }
        return ((ej) this).field_a.equals((Object) (Object) param1);
    }

    final static String a(byte param0, int param1, int param2) {
        if (param0 <= 101) {
            field_b = null;
        }
        return Vertigo2.a(new String[2], lp.field_z, -116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "No highscores";
        field_f = false;
        field_e = "Rating";
        field_d = "Rated game";
    }
}
