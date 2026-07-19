/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends vg {
    static boolean field_g;
    static String field_f;

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 125 / ((param0 - -64) / 32);
        return -1 != (2048 & param1 ^ -1) ? true : false;
    }

    public static void a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -44) {
            discarded$0 = mm.a(-1, -14, 26);
            field_f = null;
            return;
        }
        field_f = null;
    }

    private mm() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "If you are not, please change your password to something more obscure!";
    }
}
