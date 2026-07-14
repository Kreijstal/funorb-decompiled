/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static kh field_d;
    static int field_a;
    static hi field_e;
    static String field_f;
    static hi field_b;
    static String field_c;
    static String field_h;
    static boolean field_g;

    final static int a(int param0, CharSequence param1) {
        int var2 = -6 % ((-31 - param0) / 63);
        return bg.a(10, true, param1, (byte) 126);
    }

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        if (param0 != 0) {
          var2 = null;
          int discarded$2 = aa.a(65, (CharSequence) null);
          field_e = null;
          field_d = null;
          field_f = null;
          field_h = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_f = null;
          field_h = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_d = new kh("email");
        field_f = "Loading graphics";
        field_e = new hi();
        field_b = new hi();
        field_c = "Your email address is used to identify this account";
        field_h = "Achievements";
        field_g = false;
    }
}
