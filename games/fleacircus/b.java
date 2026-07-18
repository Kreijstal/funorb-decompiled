/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_e;
    static int field_a;
    static int[] field_d;
    static String field_c;
    static int[] field_b;

    final static int a(int param0) {
        return ug.field_c;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != 2) {
            b.b(-97);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Confirm Email:";
        field_d = new int[2];
    }
}
