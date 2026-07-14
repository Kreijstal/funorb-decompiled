/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static int[][] field_a;
    private static String field_z;

    public static void a(byte param0) {
        if (param0 <= 0) {
            ka.a((byte) -17);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ka.A(";
        field_a = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
