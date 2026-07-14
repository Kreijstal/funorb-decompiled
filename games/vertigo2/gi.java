/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ah {
    static ve field_t;
    static jj field_s;
    static r field_p;
    static int field_m;
    static boolean field_r;
    static boolean field_o;
    static String field_q;
    static int[] field_n;
    static nj field_v;
    static int field_u;

    public static void b(boolean param0) {
        field_q = null;
        field_t = null;
        if (param0) {
            return;
        }
        field_p = null;
        field_s = null;
        field_n = null;
        field_v = null;
    }

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3 = 0;
        if (!cp.a((byte) 64, param1)) {
          return false;
        } else {
          if (param0 != null) {
            if (param2 == 31) {
              var3 = param0.length();
              if ((var3 ^ -1) > -13) {
                if (jq.a(param1, param2 + -127)) {
                  if (var3 != 0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static ch a(int param0, boolean param1) {
        ch var2 = null;
        Object var3 = null;
        ch stackIn_2_0 = null;
        ch stackIn_3_0 = null;
        ch stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ch stackIn_6_0 = null;
        ch stackIn_7_0 = null;
        ch stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ch stackOut_5_0 = null;
        ch stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ch stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ch stackOut_1_0 = null;
        ch stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ch stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != -2956) {
          L0: {
            var3 = null;
            boolean discarded$2 = gi.a((CharSequence) null, '￸', (byte) -37);
            var2 = new ch(true);
            stackOut_5_0 = (ch) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = (ch) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (ch) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_i = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new ch(true);
            stackOut_1_0 = (ch) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (ch) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ch) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_i = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new ve(2, 4, 4, 0);
        field_r = false;
        field_m = 640;
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_v = new nj();
    }
}
