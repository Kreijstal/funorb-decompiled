/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static ci field_d;
    String field_e;
    static String field_b;
    String field_a;
    boolean field_c;
    static String field_g;
    static wl field_f;
    static String field_h;

    final static int a(int param0, int param1) {
        int var2 = param0;
        if (!(0 == (7 & param1))) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_g = null;
        if (param0 != 7) {
          int discarded$2 = ta.a(120, -46);
          field_f = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Quit to website";
        field_g = "This game has been updated! Please reload this page.";
    }
}
