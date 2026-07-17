/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        if (!(cb.field_j == null)) {
            cb.field_j.a(true);
            cb.field_j = null;
        }
        if (param0 > -124) {
            field_b = null;
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
        field_b = new int[8192];
    }
}
