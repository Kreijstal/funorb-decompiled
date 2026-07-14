/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static ak field_a;
    static int[] field_c;
    static String field_b;

    final static void a(boolean param0, String param1) {
        if (param0) {
            field_a = null;
            sc.field_a = param1;
            return;
        }
        sc.field_a = param1;
    }

    public static void a(int param0) {
        Object var2 = null;
        field_a = null;
        field_c = null;
        if (param0 != 21601) {
          var2 = null;
          kh.a(false, (String) null);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_b = "Rank";
    }
}
