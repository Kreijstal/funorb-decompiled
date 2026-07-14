/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class si {
    int field_h;
    int field_g;
    int field_i;
    int field_f;
    int field_e;
    int field_d;
    static String field_a;
    static long field_c;
    static java.awt.Canvas field_b;

    final static void b(int param0) {
        if (param0 != 13829) {
            field_c = 27L;
            ro.field_lb = null;
            return;
        }
        ro.field_lb = null;
    }

    final static boolean a(String param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -3404) {
          L0: {
            field_a = null;
            if (null == db.a(param0, -87)) {
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
            if (null == db.a(param0, -87)) {
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

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 18347) {
            si.b(-3);
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This is not your unit";
    }
}
