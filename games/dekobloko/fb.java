/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static java.awt.Color field_g;
    static String field_a;
    static String field_d;
    static w field_b;
    static int field_f;
    static ck[][] field_c;
    static int field_e;

    public static void a(byte param0) {
        Object var2 = null;
        field_a = null;
        field_b = null;
        field_g = null;
        if (param0 <= 66) {
          var2 = null;
          boolean discarded$2 = fb.a(-7, 19, (int[]) null);
          field_d = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 10040319) {
          L0: {
            var4 = null;
            boolean discarded$6 = fb.a(1, 103, (int[]) null);
            if ((param2[param0 >> -1825332859] & 1 << (31 & param0)) != 0) {
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
            if ((param2[param0 >> -1825332859] & 1 << (31 & param0)) != 0) {
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
        field_d = "Hide players in <%0>'s game";
        field_a = "Type your age in years";
        field_g = new java.awt.Color(10040319);
        field_c = new ck[8][8];
    }
}
