/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static qa field_e;
    static int field_d;
    static pb field_a;
    static int field_c;
    static String field_b;

    final static wb a(int param0, qk param1, int param2, int param3) {
        if (tc.a(param2, param0, param3 + 34170, param1)) {
          if (param3 != -8691) {
            field_c = -28;
            return vc.b(0);
          } else {
            return vc.b(0);
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 84) {
            return false;
        }
        return !wh.field_a.a(640) ? true : false;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -105) {
            field_c = 6;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new qa("usename");
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
