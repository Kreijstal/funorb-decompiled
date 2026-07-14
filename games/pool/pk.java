/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static vh field_a;
    static String field_c;
    static dd field_b;

    final static String a(CharSequence param0, int param1) {
        int var2 = 1 % ((param1 - 27) / 33);
        return fe.a(false, (byte) 70, param0);
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 77 % ((1 - param0) / 46);
        field_a = null;
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 109) {
          if ((fk.field_ab ^ -1) <= -11) {
            if (gk.field_kb) {
              return false;
            } else {
              L0: {
                if (mg.a(-114)) {
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
          field_a = null;
          if ((fk.field_ab ^ -1) <= -11) {
            if (gk.field_kb) {
              return false;
            } else {
              L1: {
                if (mg.a(-114)) {
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
        field_c = "Match by...";
    }
}
