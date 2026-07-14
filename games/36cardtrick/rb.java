/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends mi {
    static String field_f;
    static td field_h;
    static int field_g;

    rb(long param0, String param1) {
        super(param0, param1);
    }

    final fe a(byte param0) {
        if (param0 != -24) {
            rb.d(-84);
            return h.field_I;
        }
        return h.field_I;
    }

    public static void d(int param0) {
        field_h = null;
        field_f = null;
        if (param0 >= -70) {
            rb.d(69);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_h = new td();
        field_g = 0;
    }
}
