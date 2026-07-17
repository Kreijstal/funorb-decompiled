/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ua {
    static int[] field_b;
    static vn field_d;
    static hg field_a;
    static String field_c;
    static String field_e;

    public static void a() {
        field_d = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    abstract int b(int param0, int param1);

    abstract lj b(int param0);

    abstract byte[] c(int param0, int param1);

    final static boolean a(int param0, int param1) {
        return ~(param0 & -param0) == ~param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new hg(14, 0, 4, 1);
        field_c = "Log in";
        field_e = "Hide lobby chat";
    }
}
