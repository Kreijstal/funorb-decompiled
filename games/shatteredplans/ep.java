/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep {
    static String field_d;
    static String field_b;
    static int field_a;
    static String field_c;

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 640) {
          if (null == bq.field_h) {
            if (dp.field_t) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          ep.a(78);
          if (null != bq.field_h) {
            return true;
          } else {
            L0: {
              if (!dp.field_t) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
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
