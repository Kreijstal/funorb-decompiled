/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static af field_g;
    static String[] field_e;
    static lp field_b;
    static int field_d;
    static vo field_f;
    static String field_c;
    static String field_a;

    public static void b(int param0) {
        if (param0 < 111) {
            return;
        }
        field_e = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_g = null;
        field_b = null;
    }

    final static fi a(int param0) {
        if (param0 != 0) {
            field_g = null;
            return t.field_i;
        }
        return t.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_g = new af();
        field_d = 0;
        field_c = "Password: ";
        field_a = "End Game";
    }
}
