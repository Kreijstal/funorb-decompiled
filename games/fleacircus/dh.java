/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static long field_a;
    static String field_c;
    static int field_d;
    static int[] field_b;

    final static void a(boolean param0, byte param1) {
        dh.a(true, (byte) 62);
        pd.a(param0, true, 0);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[40];
        field_a = 0L;
        field_d = 4852768;
        field_c = "Connection lost - attempting to reconnect";
    }
}
