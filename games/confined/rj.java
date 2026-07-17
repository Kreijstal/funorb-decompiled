/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static String[] field_c;
    static int field_a;
    static byte[][] field_f;
    static bi field_b;
    static te field_e;
    static String field_d;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = -67 / ((param0 - 30) / 49);
    }

    final static boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 28404) {
          if (rk.field_e >= 10) {
            if (fd.field_j) {
              return false;
            } else {
              L0: {
                if (kk.a(param0 ^ -28329)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          rj.a(58);
          if (rk.field_e >= 10) {
            if (fd.field_j) {
              return false;
            } else {
              L1: {
                if (kk.a(param0 ^ -28329)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = null;
        field_a = 0;
        field_d = "<col=FFFFFF>Ready energy:</col> depleted when you use your energy weapons. If it runs out, your weapons will stop firing for a moment to allow it to recharge.";
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
