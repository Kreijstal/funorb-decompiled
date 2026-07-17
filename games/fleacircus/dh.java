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
        int discarded$0 = 0;
        pd.a(true, true);
    }

    public static void a() {
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
