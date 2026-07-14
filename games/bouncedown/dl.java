/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static boolean field_b;
    static String field_a;

    public static void b(byte param0) {
        if (param0 < 10) {
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        wb.field_b = true;
        if (param0 != -75) {
          return false;
        } else {
          L0: {
            nj.field_n = fa.a(110) - -15000L;
            if (-12 != mh.field_U) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Username: ";
    }
}
