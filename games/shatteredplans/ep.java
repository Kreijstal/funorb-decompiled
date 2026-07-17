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
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 640) {
          if (null == bq.field_h) {
            if (dp.field_t) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          boolean discarded$5 = ep.a(78);
          if (null != bq.field_h) {
            return true;
          } else {
            L0: {
              if (!dp.field_t) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void b() {
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Options Menu";
        field_b = "Click to hide the Production window.";
        field_c = "Secret achievement";
        field_a = 640;
    }
}
