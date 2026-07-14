/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static boolean[] field_d;
    static int field_a;
    static t[] field_b;
    static String field_c;
    static t[] field_e;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        int var1 = -61 / ((17 - param0) / 56);
        field_b = null;
        field_c = null;
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        hg.field_c = true;
        ta.field_k = 15000L + km.b(-1);
        if (param0 != 64) {
          L0: {
            field_a = 82;
            if ((op.field_i ^ -1) != -12) {
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
            if ((op.field_i ^ -1) != -12) {
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
        field_d = new boolean[64];
        field_c = "MEDIUM";
    }
}
