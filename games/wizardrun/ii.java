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
        if (param0 != 1000) {
          return;
        }
        field_b = null;
        field_e = null;
    }

    final static wd a(int param0, boolean param1) {
        wd var2 = null;
        wd var2Lifetime1;
        if (param0 == -29309) {
          var2 = new wd(true);
          var2.field_d = param1 ? true : false;
          return var2;
        }
        ii.a(123, false);
        var2Lifetime1 = new wd(true);
        var2Lifetime1.field_d = param1 ? true : false;
        return var2Lifetime1;
    }

    static {
        field_e = new eg[1000];
        field_d = "Email (Login):";
        field_b = "Unfortunately we are unable to create an account for you at this time.";
    }
}
