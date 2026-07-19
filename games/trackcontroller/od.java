/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static ki field_a;
    static jc field_d;
    static String field_b;
    static int[] field_c;

    final static void a(byte param0, int param1) {
        int discarded$3 = ia.b(false);
        if (param0 > -56) {
            field_a = (ki) null;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 8192) {
            field_a = (ki) null;
        }
    }

    static {
        field_b = "Connection lost. <%0>";
        field_c = new int[8192];
    }
}
