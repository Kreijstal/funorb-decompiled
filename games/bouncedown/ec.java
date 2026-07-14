/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends mh {
    static mk field_P;
    static int field_cb;
    static int field_bb;

    final static void a(tj param0, int param1, int param2, int param3, tj param4, int param5, tg[] param6, int param7, int param8, int param9, int param10, int param11, tg[] param12, int param13, int param14, int param15, tg[] param16, int param17, int param18, int param19, int param20) {
        mh.a(param5, param18, param19, new oh(param12), param8, param14, param15, param4, param2, param17, param11, (byte) 115, param13, param9, param3, param0, param20, param7, param1, new oh(param16), new oh(param6));
        if (param10 > -27) {
            field_P = null;
        }
    }

    final void a(int param0, lk param1) {
        super.a(param0, param1);
    }

    ec(pf param0, lk param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void n(int param0) {
        if (param0 < 85) {
            field_bb = -83;
            field_P = null;
            return;
        }
        field_P = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = -3166320;
        field_bb = 0;
    }
}
