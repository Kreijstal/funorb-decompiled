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

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        if (param0 != 1000) {
            return;
        }
        field_b = null;
        field_e = null;
    }

    final static wd a(int param0, boolean param1) {
        wd var2;
        wd stackIn_3_0 = null;
        wd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        wd stackIn_7_0 = null;
        wd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != -29309) {
          L0: {
            ii.a(123, false);
            var2 = new wd(true);
            stackIn_7_0 = (wd) (var2);

            if (!param1) {
              stackIn_8_0 = (wd) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (wd) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_d = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new wd(true);
            stackIn_3_0 = (wd) (var2);

            if (!param1) {
              stackIn_4_0 = (wd) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (wd) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_d = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        field_e = new eg[1000];
        field_d = "Email (Login):";
        field_b = "Unfortunately we are unable to create an account for you at this time.";
    }
}
