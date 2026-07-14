/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static String field_c;
    static ci[] field_a;
    static fa field_b;

    final static pd a(int param0, byte param1, String param2) {
        pd var3 = new pd(false);
        var3.field_b = param2;
        int var4 = -32 % ((param1 - 37) / 49);
        var3.field_c = param0;
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        af.field_a = param4;
        fh.field_a = param3;
        jm.field_b = param2;
        if (param1 != -19605) {
            field_a = null;
            lm.field_d = param0;
            return;
        }
        lm.field_d = param0;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_b = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Just play";
    }
}
