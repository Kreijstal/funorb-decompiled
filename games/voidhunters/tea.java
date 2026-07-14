/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tea {
    static uja field_d;
    static int field_b;
    static String field_c;
    static String field_a;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = -71;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static int a(int param0, String param1, int param2) {
        if (param2 == 13879) {
          if (!li.field_i) {
            return ita.a(param0, param2 + -5891).b(param1);
          } else {
            return de.a(param0, param2 ^ 14107).a(param1, param2 + -13878);
          }
        } else {
          field_a = null;
          if (!li.field_i) {
            return ita.a(param0, param2 + -5891).b(param1);
          } else {
            return de.a(param0, param2 ^ 14107).a(param1, param2 + -13878);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new uja();
        field_b = 0;
        field_c = "Elapsed time";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
