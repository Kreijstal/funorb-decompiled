/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    int field_a;
    static String field_c;
    static boolean field_d;
    int field_e;
    int field_b;

    public static void a(byte param0) {
        if (param0 >= -43) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(String param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (wl.field_I == null) {
          return false;
        } else {
          if (param1 <= 34) {
            return false;
          } else {
            L0: {
              if (0 > param0.toLowerCase().indexOf(wl.field_I.toLowerCase())) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "More options";
    }
}
