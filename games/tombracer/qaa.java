/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qaa {
    static String[][] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 14979) {
            field_a = null;
        }
    }

    abstract void b(int param0, java.awt.Component param1);

    abstract int b(int param0);

    final static boolean a(int param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2180) {
          L0: {
            field_a = null;
            if (null == uh.a(param1, -116)) {
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
            if (null == uh.a(param1, -116)) {
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

    abstract void a(int param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[][]{new String[4], new String[2]};
    }
}
