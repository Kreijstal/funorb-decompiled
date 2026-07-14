/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fw {
    static String field_a;

    final static lp a(int param0, boolean param1) {
        lp var2 = (lp) wha.field_J.a((byte) 61, (long)param0);
        if (!(var2 == null)) {
            return var2;
        }
        byte[] var3 = tq.field_g.a(param1, 0, param0);
        lp var2_ref = new lp();
        if (!(var3 == null)) {
            var2_ref.a(-1, param0, new uia(var3));
        }
        wha.field_J.a(29166, (Object) (Object) var2_ref, (long)param0);
        return var2_ref;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            fw.a(-74);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "TAB - hide chat temporarily";
    }
}
