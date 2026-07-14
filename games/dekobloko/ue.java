/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static ck field_b;
    static String field_d;
    static String field_a;
    static String field_c;

    final static boolean a(int param0, String param1) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (null != jk.field_a) {
          if (param0 != 2048) {
            L0: {
              var3 = null;
              boolean discarded$6 = ue.a(-5, (String) null);
              if (-1 < param1.toLowerCase().indexOf(jk.field_a.toLowerCase())) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if (-1 > param1.toLowerCase().indexOf(jk.field_a.toLowerCase())) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 >= -4) {
          int discarded$2 = ue.a(-36, 12);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        var2 = -44 % ((param1 - -3) / 44);
        if ((param0 ^ -1) > -4097) {
          L0: {
            if (2048 > param0) {
              stackOut_7_0 = pd.field_i[-param0 + 2048];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -pd.field_i[-2048 + param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 6144) {
              stackOut_3_0 = -pd.field_i[-param0 + 6144];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = pd.field_i[-6144 + param0];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Solicitation";
        field_c = "Tips";
        field_a = "Report abuse";
    }
}
