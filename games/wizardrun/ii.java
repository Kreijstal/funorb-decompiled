/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String field_d;
    static na field_f;
    static eg[] field_e;
    static String field_b;
    static int field_a;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    final static wd a(int param0, boolean param1) {
        wd var2 = null;
        if (param0 != -29309) {
          wd discarded$2 = ii.a(123, false);
          var2 = new wd(true);
          var2.field_d = false;
          return var2;
        } else {
          var2 = new wd(true);
          var2.field_d = false;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new eg[1000];
        field_d = "Email (Login):";
        field_b = "Unfortunately we are unable to create an account for you at this time.";
    }
}
