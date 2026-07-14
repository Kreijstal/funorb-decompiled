/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends bd {
    static at field_t;
    static String[] field_s;

    ss(int param0, int param1, int param2, int param3) {
        ((ss) this).field_m = param3;
    }

    public static void a(byte param0) {
        field_t = null;
        field_s = null;
        int var1 = -80 / ((48 - param0) / 47);
    }

    final void a(int param0, ha param1) {
        if (param0 != 64) {
            field_s = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new at();
        field_s = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
