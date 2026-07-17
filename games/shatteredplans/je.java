/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static bi field_f;
    static boolean field_e;
    static bi field_b;
    static oa field_a;
    static int field_d;
    static int field_g;
    static int field_c;

    final static int a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          L0: {
            if (param0 < 6144) {
              stackOut_7_0 = -br.field_o[param0 + -4096];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -br.field_o[-param0 + 8192];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (2048 <= param0) {
              stackOut_3_0 = br.field_o[4096 - param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = br.field_o[param0];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, int param1) {
        sl var2 = null;
        var2 = js.field_f;
        var2.h(param1, 255);
        if (param0 <= 32) {
          int discarded$2 = je.a(-116, (byte) -104);
          var2.c(1, (byte) -104);
          var2.c(1, (byte) -93);
          return;
        } else {
          var2.c(1, (byte) -104);
          var2.c(1, (byte) -93);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new oa();
        field_d = 0;
        field_c = 0;
    }
}
