/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CurrencyPriceGlobals {
    static String field_a;
    static int field_c;
    static String[] field_b;

    final static boolean isFocusIndicatorEnabled(int param0) {
        if (param0 == -8798) {
          return null == GridSize.field_f ? NameSuggestionHelpers.field_d : true;
        }
        CurrencyPriceGlobals.isFocusIndicatorEnabled(108);
        return null == GridSize.field_f ? NameSuggestionHelpers.field_d : true;
    }

    public static void releaseStatics(int param0) {
        if (param0 < 74) {
          CurrencyPriceGlobals.releaseStatics(60);
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
