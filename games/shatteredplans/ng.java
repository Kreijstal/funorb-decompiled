/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_b;
    static int[] field_a;

    final static boolean a(sl param0, byte param1) {
        if (param1 != -95) {
            return true;
        }
        return -2 == (param0.b((byte) 126, 1) ^ -1) ? true : false;
    }

    public static void a(int param0) {
        int var1 = -9 / ((39 - param0) / 63);
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Private";
        field_a = new int[128];
    }
}
