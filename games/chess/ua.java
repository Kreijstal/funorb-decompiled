/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ua {
    static int[] field_b;
    static vn field_d;
    static hg field_a;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 != 1007) {
          field_b = (int[]) null;
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    abstract int b(int param0, int param1);

    abstract lj b(int param0);

    abstract byte[] c(int param0, int param1);

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 14) {
          L0: {
            ua.a(-87);
            if ((param0 & -param0) != param0) {
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
            if ((param0 & -param0) != param0) {
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
        field_a = new hg(14, 0, 4, 1);
        field_c = "Log in";
        field_e = "Hide lobby chat";
    }
}
