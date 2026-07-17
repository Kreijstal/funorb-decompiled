/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static boolean field_c;
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2) {
        qg.field_a = 240;
        vg.field_f = 320;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 != uj.field_d) {
          int discarded$8 = 105;
          if (a.a()) {
            rg.field_h = true;
            return;
          } else {
            int discarded$9 = 29;
            va.a();
            uj.field_d = 11;
            rg.field_h = true;
            return;
          }
        } else {
          int discarded$10 = 29;
          va.a();
          uj.field_d = 11;
          rg.field_h = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "COMPLETE";
        field_b = "EXPANSION ONLY ITEM";
    }
}
