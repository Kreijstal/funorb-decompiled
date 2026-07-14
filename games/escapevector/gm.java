/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_d;
    static ed field_a;
    static hh field_b;
    static String field_e;
    static String field_f;
    static int[] field_c;

    final static ed[] a(int param0, int param1, mf param2, int param3) {
        if (param3 == 8192) {
          if (!uc.a(param2, param3 ^ -8272, param0, param1)) {
            return null;
          } else {
            return g.e(15556);
          }
        } else {
          field_e = null;
          if (!uc.a(param2, param3 ^ -8272, param0, param1)) {
            return null;
          } else {
            return g.e(15556);
          }
        }
    }

    final static boolean b(int param0) {
        if (param0 != 8192) {
            field_d = null;
            return eb.field_H;
        }
        return eb.field_H;
    }

    public static void a(int param0) {
        Object var2 = null;
        field_b = null;
        field_d = null;
        field_f = null;
        if (param0 != 8192) {
          var2 = null;
          ed[] discarded$2 = gm.a(13, 47, (mf) null, 3);
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_d = "Loading sound effects";
        field_c = new int[8192];
    }
}
