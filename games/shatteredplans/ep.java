/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep {
    static String field_d;
    static String field_b;
    static int field_a;
    static String field_c;

    final static boolean a(int param0) {
        if (param0 != 640) {
          ep.a(78);
          if (null == bq.field_h) {
            return dp.field_t ? true : false;
          }
          return true;
        }
        if (null != bq.field_h) {
          return true;
        }
        if (!dp.field_t) {
          return false;
        }
        return true;
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 640) {
          field_a = -116;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_d = "Options Menu";
        field_b = "Click to hide the Production window.";
        field_c = "Secret achievement";
        field_a = 640;
    }
}
