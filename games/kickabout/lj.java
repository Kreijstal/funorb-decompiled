/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends gn {
    static String field_l;
    String field_i;
    static volatile long field_e;
    static rc field_g;
    static String field_j;
    static int field_f;
    static String field_m;
    static String field_k;
    static int field_h;

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_j = null;
            if (lc.field_e.a((byte) -80)) {
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
            if (lc.field_e.a((byte) -80)) {
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

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param1 = n.a('_', "", (byte) -124, param1);
        var3 = bo.a(-1, param1);
        var4 = 117 / ((-74 - param0) / 46);
        if (-1 == param2.indexOf(param1)) {
          if (0 != (param2.indexOf(var3) ^ -1)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_m = null;
        if (param0 >= -23) {
          field_g = null;
          field_l = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_k = null;
          return;
        }
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            lj.a(-13);
            return 23 * param0 >> -1761140536;
        }
        return 23 * param0 >> -1761140536;
    }

    lj(String param0) {
        ((lj) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Loading fonts";
        field_m = "Auctions";
        field_e = 0L;
        field_f = 0;
        field_j = "Buying or selling an account";
        field_g = new rc();
        field_k = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = -1;
    }
}
