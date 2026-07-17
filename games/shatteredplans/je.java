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
        if (param1 == -104) {
          param0 = param0 & 8191;
          if (param0 >= 4096) {
            L0: {
              if (param0 < 6144) {
                stackOut_18_0 = -br.field_o[param0 + -4096];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -br.field_o[-param0 + 8192];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (2048 <= param0) {
                stackOut_14_0 = br.field_o[4096 - param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = br.field_o[param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_c = -25;
          param0 = param0 & 8191;
          if (param0 >= 4096) {
            L2: {
              if (param0 < 6144) {
                stackOut_8_0 = -br.field_o[param0 + -4096];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -br.field_o[-param0 + 8192];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (2048 <= param0) {
                stackOut_4_0 = br.field_o[4096 - param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = br.field_o[param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(byte param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param1, 255);
        var2.c(1, (byte) -104);
        var2.c(1, (byte) -93);
    }

    public static void a() {
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
