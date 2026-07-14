/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends oh {
    static gh field_n;
    fs field_j;
    ln field_i;
    static String field_m;
    int field_h;
    static int field_k;
    static tm[] field_l;

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        field_n = null;
        if (param0 != 12) {
            field_n = null;
        }
    }

    hj(fs param0, ln param1, int param2) {
        ((hj) this).field_h = param2;
        ((hj) this).field_j = param0;
        ((hj) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Only show private chat from my friends and opponents";
        field_k = 0;
    }
}
