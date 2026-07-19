/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static long[] field_a;
    static int field_b;
    static String[] field_c;
    private static String field_z;

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            fa.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_z = "fa.A(";
        field_b = 250;
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = new long[32];
    }
}
