/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends mc {
    static int[] field_s;
    static String field_o;
    static p field_r;
    static nk field_q;
    byte[] field_p;
    static String field_n;

    final static void a(boolean param0) {
        lc.a((byte) 103);
        mn.a(-7, ha.field_e, fn.field_Q, qe.field_d, ec.field_n[0].field_t, wc.field_J);
        if (param0) {
            field_o = null;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_r = null;
        field_q = null;
        field_s = null;
        int var1 = -29 % ((64 - param0) / 43);
        field_o = null;
    }

    ch(byte[] param0) {
        ((ch) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> is offering a rematch.";
        field_n = "Game options";
    }
}
