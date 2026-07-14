/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm implements bp {
    static String field_b;
    static mh field_a;
    static jp field_f;
    static int[] field_d;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 >= -2) {
          field_e = null;
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static hl a(int param0, byte[] param1) {
        hl var2 = null;
        if (param0 == 12658477) {
          if (param1 == null) {
            return null;
          } else {
            var2 = new hl(param1, ag.field_K, dl.field_d, jh.field_b, gg.field_t, cn.field_a);
            ee.d((byte) 96);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static ac a(String param0, int param1) {
        if (param1 != 16711935) {
            field_d = null;
            return new ac(param0);
        }
        return new ac(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Withdraw request to join <%0>'s game";
        field_d = new int[]{12658477, 22953, 16494651, 26679, 16711935};
        field_c = "Your rating is <%0>";
        field_e = "(<%0>/<%1>)";
    }
}
