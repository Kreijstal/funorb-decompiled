/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf {
    static int field_a;
    static String[] field_b;
    static String field_c;

    abstract e a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        if (param0 != -15927) {
            hf.a(25);
            field_b = null;
            return;
        }
        field_b = null;
    }

    abstract int a(int param0, int param1);

    abstract byte[] a(int param0, boolean param1);

    final static void a(String param0, byte param1) {
        if (param1 < 107) {
            hf.a(-22);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
