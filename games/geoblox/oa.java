/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static long field_c;
    static int[] field_b;
    static dm[] field_e;
    static String[] field_d;
    static int field_a;
    static int[] field_f;

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (!((nd.field_b ^ -1L) >= (var1 ^ -1L))) {
            rj.field_b = rj.field_b + (nd.field_b + -var1);
        }
        nd.field_b = var1;
        if (param0 != -12520) {
            field_d = null;
        }
        return rj.field_b + var1;
    }

    final static int a(int param0, CharSequence param1, int param2) {
        if (param2 != 8192) {
            return -10;
        }
        return eg.a(param1, (byte) 49, param0, true);
    }

    public static void b(int param0) {
        if (param0 != 8192) {
            field_e = null;
        }
        field_b = null;
        field_d = null;
        field_e = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
