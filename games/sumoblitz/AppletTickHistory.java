/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AppletTickHistory {
    static long[] tickTimes;
    static int field_b;
    static String[] field_c;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        field_c = null;
        if (param0) {
          AppletTickHistory.releaseStatics(true);
          tickTimes = null;
          return;
        }
        tickTimes = null;
    }

    static {
        field_z = "fa.A(";
        field_b = 250;
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        tickTimes = new long[32];
    }
}
