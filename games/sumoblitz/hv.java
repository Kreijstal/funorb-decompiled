/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv {
    static String field_a;
    static hr field_b;
    static String field_e;
    static boolean field_c;
    static hr[] field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param0 != -20011) {
          return false;
        } else {
          L0: {
            if ((Object) (Object) pd.field_m != this) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if ((Object) (Object) mo.field_w != this) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          return (stackIn_7_0 | stackIn_7_1) != 0;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 != -7520) {
            hv.b(-61);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unpacking sound effects";
        field_a = "reassign";
        field_c = false;
    }
}
