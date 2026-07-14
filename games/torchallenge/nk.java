/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int field_e;
    static int field_h;
    static int[] field_f;
    static String field_c;
    static byte[][] field_b;
    static String[] field_g;
    static java.awt.Frame field_d;
    static ka[] field_a;
    private static String field_z;

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        if (param0 != 250) {
            return;
        }
        field_g = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "nk.A(";
        field_h = 256;
        field_g = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = new byte[250][];
        field_f = new int[]{0, 409, 640, 71};
        field_c = "Logging in...";
    }
}
