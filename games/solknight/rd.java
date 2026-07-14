/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static qf field_b;
    static String field_a;

    final static boolean b(int param0) {
        if (param0 != 6144) {
            field_b = null;
            return true;
        }
        return true;
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -30) {
          if (4096 > param1) {
            L0: {
              if (-2049 >= (param1 ^ -1)) {
                stackOut_18_0 = -db.field_m[param1 - 2048];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = db.field_m[2048 + -param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (6144 > param1) {
                stackOut_14_0 = -db.field_m[-param1 + 6144];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = db.field_m[-6144 + param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = null;
          if (4096 > param1) {
            L2: {
              if (-2049 >= (param1 ^ -1)) {
                stackOut_8_0 = -db.field_m[param1 - 2048];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = db.field_m[2048 + -param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (6144 > param1) {
                stackOut_4_0 = -db.field_m[-param1 + 6144];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = db.field_m[-6144 + param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 85) {
            int discarded$0 = rd.a((byte) 52, -77);
            field_b = null;
            return;
        }
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
