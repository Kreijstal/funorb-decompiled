/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static int field_d;
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        return ga.a(0, param2, param1) & (gl.a(param1, 544, param2) | ((param1 & 8192) != 0 ? true : false) | gh.a(param2, false, param1));
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 >= -95) {
            ln.a((byte) -52);
        }
    }

    private ln() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_c = 0;
        field_a = "Reload game";
    }
}
