/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static qf field_b;
    static String field_a;

    final static boolean b(int param0) {
        return true;
    }

    final static int a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param1 = param1 & 8191;
        if (4096 > param1) {
          L0: {
            if (param1 >= 2048) {
              stackOut_7_0 = -db.field_m[param1 - 2048];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = db.field_m[2048 + -param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (6144 > param1) {
              stackOut_3_0 = -db.field_m[-param1 + 6144];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = db.field_m[-6144 + param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new qf();
        field_a = "Waiting for sound effects";
    }
}
