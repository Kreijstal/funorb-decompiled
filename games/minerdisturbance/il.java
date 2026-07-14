/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends pi {
    int field_w;
    int field_o;
    static String[][] field_t;
    static long field_v;
    int field_p;
    static ea field_s;
    static boolean field_n;
    int field_u;
    int field_q;
    int field_r;

    final static boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -31391) {
          L0: {
            field_t = null;
            if (-16 == pl.field_h) {
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
            if (-16 == pl.field_h) {
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

    public static void a(int param0) {
        field_t = null;
        field_s = null;
        int var1 = 47 / ((63 - param0) / 55);
    }

    final static void a(int param0, byte param1) {
        int discarded$4 = s.a(-27911);
        if (param1 != -109) {
            field_t = null;
        }
    }

    private il() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[][]{new String[1]};
        field_n = false;
    }
}
