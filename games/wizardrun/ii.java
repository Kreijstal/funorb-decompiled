/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String field_d;
    static na field_f;
    static eg[] field_e;
    static String field_b;
    static int field_a;
    static int field_c;

    public static void a() {
        field_d = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    final static wd a(int param0, boolean param1) {
        wd var2 = null;
        wd stackIn_2_0 = null;
        wd stackIn_3_0 = null;
        wd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        wd stackIn_6_0 = null;
        wd stackIn_7_0 = null;
        wd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        wd stackOut_5_0 = null;
        wd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        wd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        wd stackOut_1_0 = null;
        wd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != -29309) {
          L0: {
            wd discarded$2 = ii.a(123, false);
            var2 = new wd(true);
            stackOut_5_0 = (wd) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = (wd) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (wd) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_d = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new wd(true);
            stackOut_1_0 = (wd) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (wd) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (wd) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_d = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new eg[1000];
        field_d = "Email (Login):";
        field_b = "Unfortunately we are unable to create an account for you at this time.";
    }
}
