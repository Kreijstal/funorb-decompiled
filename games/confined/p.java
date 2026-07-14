/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 < 61) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static in a(int param0, String[] param1) {
        in var2 = null;
        var2 = new in(false);
        if (param0 != 26663) {
          field_b = null;
          var2.field_c = param1;
          return var2;
        } else {
          var2.field_c = param1;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_a = "Your email address is used to identify this account";
    }
}
