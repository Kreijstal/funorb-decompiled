/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static int field_d;
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_2_0 = false;
        boolean stackIn_2_1 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_8_0 = false;
        boolean stackIn_8_1 = false;
        int stackIn_8_2 = 0;
        boolean stackOut_5_0 = false;
        boolean stackOut_5_1 = false;
        boolean stackOut_7_0 = false;
        boolean stackOut_7_1 = false;
        int stackOut_7_2 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_6_1 = false;
        int stackOut_6_2 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_1_1 = false;
        boolean stackOut_3_0 = false;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        if (param0 <= 16) {
          L0: {
            field_a = null;
            stackOut_5_0 = ga.a(0, param2, param1);
            stackOut_5_1 = gl.a(param1, 544, param2);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if ((param1 & 8192) == 0) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          return stackIn_8_0 & (stackIn_8_1 | stackIn_8_2 != 0 | gh.a(param2, false, param1));
        } else {
          L1: {
            stackOut_1_0 = ga.a(0, param2, param1);
            stackOut_1_1 = gl.a(param1, 544, param2);
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if ((param1 & 8192) == 0) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L1;
            }
          }
          return stackIn_4_0 & (stackIn_4_1 | stackIn_4_2 != 0 | gh.a(param2, false, param1));
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 >= -95) {
            ln.a((byte) -52);
        }
    }

    private ln() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_c = 0;
        field_a = "Reload game";
    }
}
