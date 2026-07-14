/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends nm {
    static int[] field_t;
    int field_j;
    int field_r;
    int field_s;
    static jp field_o;
    static fr[] field_i;
    gg field_k;
    static byte[] field_q;
    static String field_l;
    int field_n;
    int field_u;
    static String field_m;
    static jp[] field_p;

    public static void a(byte param0) {
        int var1 = 127 % ((-74 - param0) / 42);
        field_o = null;
        field_t = null;
        field_q = null;
        field_m = null;
        field_p = null;
        field_l = null;
        field_i = null;
    }

    gg(int param0, int param1, int param2, int param3, int param4) {
        ((gg) this).field_r = param3;
        ((gg) this).field_u = param0;
        ((gg) this).field_s = param2;
        ((gg) this).field_n = param4;
        ((gg) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "No options available";
        field_l = "Instructions";
    }
}
