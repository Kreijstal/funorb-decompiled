/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_a;
    static int field_c;
    static String[] field_b;

    final static boolean a(int param0) {
        if (param0 == -8798) {
          return null == ib.field_f ? ro.field_d : true;
        }
        wp.a(108);
        return null == ib.field_f ? ro.field_d : true;
    }

    public static void b(int param0) {
        if (param0 < 74) {
          wp.b(60);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = null;
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
