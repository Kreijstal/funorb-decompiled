/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int[][] field_a;
    static String field_b;
    static String field_d;
    static int field_c;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 != 84) {
            bi.a((byte) 127);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "not completed";
        field_a = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_c = 0;
    }
}
