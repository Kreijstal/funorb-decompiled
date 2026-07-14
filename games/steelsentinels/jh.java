/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static rm field_i;
    static String field_c;
    static int field_d;
    static String field_f;
    static int[] field_a;
    static wk field_h;
    static String[] field_b;
    static String field_e;
    static String field_g;

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        if (param1 <= param0) {
          L0: {
            if (param0 < 6144) {
              stackOut_7_0 = -hk.field_Zb[param0 + -4096];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -hk.field_Zb[-param0 + 8192];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((param0 ^ -1) > -2049) {
              stackOut_3_0 = hk.field_Zb[param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = hk.field_Zb[4096 - param0];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_g = null;
        field_a = null;
        field_b = null;
        if (param0 != 30706) {
            jh.a(49);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = "Password: ";
        field_d = 4;
        field_f = "Only show lobby chat from my friends";
        field_a = new int[20];
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = 1200;
        }
        field_g = "Set up new unrated game";
        field_e = "You cannot join this game - it is in progress";
    }
}
