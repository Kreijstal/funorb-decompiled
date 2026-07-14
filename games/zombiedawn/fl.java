/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_c;
    static int field_e;
    static String field_b;
    static int[] field_d;
    static int field_a;

    final static eo a(int param0, boolean param1) {
        eo var2 = null;
        eo stackIn_2_0 = null;
        eo stackIn_3_0 = null;
        eo stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        eo stackOut_1_0 = null;
        eo stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        eo stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 5) {
          return null;
        } else {
          L0: {
            var2 = new eo(true);
            stackOut_1_0 = (eo) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (eo) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (eo) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          stackIn_4_0.field_d = stackIn_4_1 != 0;
          return var2;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -54) {
          eo discarded$2 = fl.a(44, false);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_c = new int[]{170, 150, 140, 160};
        field_e = 5;
    }
}
