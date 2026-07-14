/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    int field_b;
    static String[] field_h;
    static int field_f;
    static String field_e;
    int field_g;
    int field_a;
    int field_d;
    static String field_c;

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        if (param0 != -35) {
            ki.a((byte) 80);
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4) {
        sj.a(param2, param1, param0, 32, param3 + "_reveal", param3 + "_defeat");
        if (param4 != -1) {
            field_f = 66;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Guardian";
        field_f = -1;
        field_h = new String[]{"<%0> the Fierce", "<%0> the Cruel", "<%0> the Fell", "<%0> the Terrible", "<%0> the Savage", "<%0> the Raging", "<%0>, Bringer of Wrath", "<%0>, Lady of Chaos", "<%0> the Undefeated"};
    }
}
