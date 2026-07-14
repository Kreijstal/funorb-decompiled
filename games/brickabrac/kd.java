/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_c;
    static String field_b;
    static String[] field_d;
    static String field_a;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (!param0) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static pb a(int param0, int param1, byte param2) {
        int var3 = 117 / ((param2 - 38) / 63);
        return so.a(0, param1, param0, cr.field_N);
    }

    final static boolean a(int param0, wq param1) {
        int var2 = param1.l(param0 + 257);
        int var3 = (var2 ^ -1) == param0 ? 1 : 0;
        return var3 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to add friend - system busy";
        field_a = "Please wait...";
    }
}
