/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_a;
    static int field_c;
    static String[] field_b;

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -8798) {
          L0: {
            wp.a(108);
            if (null != ib.field_f) {
              stackIn_8_0 = 1;
              break L0;
            } else {
              stackIn_8_0 = ro.field_d ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null != ib.field_f) {
              stackIn_4_0 = 1;
              break L1;
            } else {
              stackIn_4_0 = ro.field_d ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
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
