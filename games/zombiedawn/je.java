/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_a;
    static int[] field_b;
    static int field_c;

    final static int a(int param0, int param1, boolean param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        if (param2) {
          L0: {
            field_b = (int[]) null;
            if (0 == (param0 & 1)) {
              stackIn_11_0 = param1;
              break L0;
            } else {
              stackIn_11_0 = -param1;
              break L0;
            }
          }
          L1: {


            if ((param0 & 2) != 0) {

              stackIn_14_1 = -param3;
              break L1;
            } else {

              stackIn_14_1 = param3;
              break L1;
            }
          }
          return stackIn_11_0 + stackIn_14_1;
        } else {
          L2: {
            if (0 == (param0 & 1)) {
              stackIn_4_0 = param1;
              break L2;
            } else {
              stackIn_4_0 = -param1;
              break L2;
            }
          }
          L3: {


            if ((param0 & 2) != 0) {

              stackIn_7_1 = -param3;
              break L3;
            } else {

              stackIn_7_1 = param3;
              break L3;
            }
          }
          return stackIn_4_0 + stackIn_7_1;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            je.a(-82);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = new int[1024];
        field_a = 3;
        field_c = 0;
    }
}
