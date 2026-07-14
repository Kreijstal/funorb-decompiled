/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static ul field_b;
    static gh field_f;
    static String field_a;
    static String field_e;
    static int field_d;
    static int field_c;

    final static wk a(int param0, int param1, int param2) {
        int var5 = SteelSentinels.field_G;
        wk var3 = new wk(param1, param1);
        int var4 = 0;
        if (param2 != 248) {
            wk discarded$0 = bd.a(17, 14, -114);
        }
        while (var4 < var3.field_E.length) {
            var3.field_E[var4] = param0;
            var4++;
        }
        return var3;
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -23333) {
            field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ul();
        field_a = "<%0> is not on your friend list.";
        field_e = "Concluded";
    }
}
