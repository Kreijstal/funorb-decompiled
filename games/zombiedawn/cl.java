/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl implements wa {
    static mf field_b;
    static byte[][][] field_c;
    static String field_a;

    public final void a(int param0, int param1, int param2) {
        gd.a(param0, 32767, param2);
        int var4 = 126 % ((param1 - -83) / 35);
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[8][7][];
        field_a = "DISGUISE";
    }
}
