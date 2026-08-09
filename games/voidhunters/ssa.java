/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ssa {
    static no field_a;
    static String field_b;

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 2) {
          L0: {
            ssa.b(104);
            if (2 > go.field_p) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (2 > go.field_p) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 2) {
            field_b = (String) null;
        }
    }

    static {
        field_b = "Launch fighters";
    }
}
