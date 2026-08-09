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
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_4_0 = null;
        String stackIn_4_1 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_8_0 = null;
        String stackIn_8_1 = null;
        if (param1 != -1) {
          L0: {
            qu.a(-48);
            stackIn_7_0 = new StringBuilder().append(" (");

            if ((param0 ^ -1) < -1) {
              stackIn_8_0 = (StringBuilder) ((Object) stackIn_7_0);
              stackIn_8_1 = "-";
              break L0;
            } else {
              stackIn_8_0 = (StringBuilder) ((Object) stackIn_7_0);
              stackIn_8_1 = "+";
              break L0;
            }
          }
          return stackIn_8_1 + Math.abs(param0) + ")";
        } else {
          L1: {
            stackIn_3_0 = new StringBuilder().append(" (");

            if ((param0 ^ -1) < -1) {
              stackIn_4_0 = (StringBuilder) ((Object) stackIn_3_0);
              stackIn_4_1 = "-";
              break L1;
            } else {
              stackIn_4_0 = (StringBuilder) ((Object) stackIn_3_0);
              stackIn_4_1 = "+";
              break L1;
            }
          }
          return stackIn_4_1 + Math.abs(param0) + ")";
        }
    }

    abstract void a(boolean param0, byte[] param1);

    abstract byte[] a(boolean param0);

    static {
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
