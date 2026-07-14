/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qu {
    static int[] field_b;
    static int[] field_d;
    static wm field_e;
    static tr field_a;
    static String field_c;

    abstract byte[] a(byte param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        int var1 = -73 / ((param0 - 5) / 62);
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static String a(int param0, int param1) {
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_4_0 = null;
        String stackIn_4_1 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_8_0 = null;
        String stackIn_8_1 = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_7_0 = null;
        String stackOut_7_1 = null;
        StringBuilder stackOut_6_0 = null;
        String stackOut_6_1 = null;
        StringBuilder stackOut_1_0 = null;
        StringBuilder stackOut_3_0 = null;
        String stackOut_3_1 = null;
        StringBuilder stackOut_2_0 = null;
        String stackOut_2_1 = null;
        if (param1 != -1) {
          L0: {
            qu.a(-48);
            stackOut_5_0 = new StringBuilder().append(" (");
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if ((param0 ^ -1) < -1) {
              stackOut_7_0 = (StringBuilder) (Object) stackIn_7_0;
              stackOut_7_1 = "-";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (StringBuilder) (Object) stackIn_6_0;
              stackOut_6_1 = "+";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          return stackIn_8_1 + Math.abs(param0) + ")";
        } else {
          L1: {
            stackOut_1_0 = new StringBuilder().append(" (");
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if ((param0 ^ -1) < -1) {
              stackOut_3_0 = (StringBuilder) (Object) stackIn_3_0;
              stackOut_3_1 = "-";
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (StringBuilder) (Object) stackIn_2_0;
              stackOut_2_1 = "+";
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          return stackIn_4_1 + Math.abs(param0) + ")";
        }
    }

    abstract void a(boolean param0, byte[] param1);

    abstract byte[] a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_d = new int[16384];
        field_b = new int[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; -16385 < (var2 ^ -1); var2++) {
            field_b[var2] = (int)(Math.sin(var0 * (double)var2) * 16384.0);
            field_d[var2] = (int)(16384.0 * Math.cos((double)var2 * var0));
        }
        field_e = new wm();
        field_c = "You have unlocked some worlds that are for Members Only. To play these, become a member at FunOrb.com.";
    }
}
