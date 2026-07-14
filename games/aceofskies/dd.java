/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static int[] field_c;
    static String field_d;
    static String field_b;
    static int field_a;

    final static jm a(String param0, int param1, int param2) {
        int var3 = -17 % ((param2 - -32) / 35);
        cm var4 = new cm();
        ((jm) (Object) var4).field_f = param1;
        ((jm) (Object) var4).field_e = param0;
        return (jm) (Object) var4;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -31619) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Age:";
        field_d = "Cancel";
    }
}
