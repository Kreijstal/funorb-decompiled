/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_c;
    static String field_a;
    static hj[] field_b;
    static boolean field_d;

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 12 / ((-77 - param1) / 45);
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          L0: {
            if (param0 >= 6144) {
              stackOut_7_0 = th.field_c[param0 + -6144];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -th.field_c[6144 - param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 2048) {
              stackOut_3_0 = th.field_c[2048 - param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -th.field_c[param0 - 2048];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains your Player Name, and would be easy to guess";
    }
}
