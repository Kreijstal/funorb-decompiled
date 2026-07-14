/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static ng field_c;
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        int var1 = -91 / ((param0 - -10) / 34);
        field_c = null;
        field_a = null;
    }

    final static boolean a(byte param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 44) {
          L0: {
            field_c = null;
            if (sg.a((byte) 79, param1) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (sg.a((byte) 79, param1) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 50;
        field_a = "Play free version";
        field_c = new ng();
    }
}
