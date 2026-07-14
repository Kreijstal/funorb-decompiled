/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 16558) {
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 != 0) {
          if (param0 < 95) {
            field_a = null;
            if (-2 != param1) {
              return false;
            } else {
              return true;
            }
          } else {
            L0: {
              if (-2 == param1) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Shield recharged";
    }
}
