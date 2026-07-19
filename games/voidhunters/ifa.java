/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ifa extends ksa {
    static String field_e;
    static int field_d;
    static String field_h;
    int field_i;
    private static char[] field_f;
    static String[] field_g;

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_e = null;
        field_g = null;
        if (param0 <= 20) {
            field_g = (String[]) null;
        }
    }

    private ifa() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        field_e = "Add condition (Body destroyed)";
        field_d = 9;
        field_h = "Improves energy recharge, but explosive";
        field_f = new char[64];
        for (var0 = 0; -27 < (var0 ^ -1); var0++) {
            field_f[var0] = (char)(65 + var0);
        }
        for (var0 = 26; 52 > var0; var0++) {
            field_f[var0] = (char)(-26 + (97 + var0));
        }
        for (var0 = 52; 62 > var0; var0++) {
            field_f[var0] = (char)(var0 + -4);
        }
        field_f[62] = (char)43;
        field_f[63] = (char)47;
    }
}
