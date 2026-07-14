/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends rqa {
    static dja field_r;
    static String field_t;
    static String field_q;
    static String field_s;
    static int field_o;
    static int[] field_p;

    kg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_r = null;
        field_t = null;
        field_q = null;
        field_s = null;
        if (param0 != 7848) {
            field_o = 99;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(145, 98));
    }

    final static boolean a(byte param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 11) {
          L0: {
            field_t = null;
            if (0 == (32 & param2)) {
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
            if (0 == (32 & param2)) {
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
        field_t = "VIP";
        field_q = "You have entered another game.";
        field_r = (dja) (Object) new fl();
        field_o = 1;
        field_s = "Members";
    }
}
