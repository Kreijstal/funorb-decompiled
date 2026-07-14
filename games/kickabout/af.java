/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static int[] field_b;
    static dt[] field_a;
    static String field_c;
    static hd field_d;

    final static int a(up param0, int param1) {
        int var2 = 5 * gp.a(param0, -576054046) / 3;
        if (!(param1 >= (var2 ^ -1))) {
            var2 = 30;
        }
        return var2;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = -21 / ((param0 - 9) / 34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{156, 154};
        field_c = "<%0> is not on your friend list.";
    }
}
