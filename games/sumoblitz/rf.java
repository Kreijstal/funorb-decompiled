/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends Exception {
    static ts field_e;
    static String[] field_b;
    static String field_c;
    static dg field_a;
    static int field_d;

    public rf() {
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_b = null;
            if ((mi.field_a ^ -1) != -2) {
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
            if ((mi.field_a ^ -1) != -2) {
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

    public static void a(int param0) {
        if (param0 != 1) {
          field_c = null;
          field_a = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static g a(String param0, int param1, boolean param2) {
        nw var3 = null;
        var3 = new nw();
        if (!param2) {
          field_b = null;
          ((g) (Object) var3).field_b = param0;
          ((g) (Object) var3).field_d = param1;
          return (g) (Object) var3;
        } else {
          ((g) (Object) var3).field_b = param0;
          ((g) (Object) var3).field_d = param1;
          return (g) (Object) var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ts(8, 0, 4, 1);
        field_c = "Menu";
        field_b = new String[255];
    }
}
