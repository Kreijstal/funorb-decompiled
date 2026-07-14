/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static byte[] field_e;
    static String field_a;
    static String field_h;
    static km field_g;
    static ci field_f;
    static ci field_c;
    static int field_b;
    static int[] field_d;

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_g = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_h = null;
        if (param0 != -26815) {
            boolean discarded$0 = wk.a((byte) 122);
        }
    }

    final static km a(um param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(param3, 0);
        var5 = param0.a(param2, 7, var4);
        if (param1 != 1) {
          return null;
        } else {
          return li.a(var5, (byte) -2, param0, var4);
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 116) {
          L0: {
            field_d = null;
            if (null == jj.field_f) {
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
            if (null == jj.field_f) {
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
        field_a = "Type your password again to make sure it's correct";
        field_b = 1;
        field_h = "<%0> would need a rating of <%1> to play with the current options.";
        field_d = new int[8192];
    }
}
