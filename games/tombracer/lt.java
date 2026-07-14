/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt {
    String field_g;
    static volatile long field_b;
    String field_c;
    static Object field_f;
    String field_e;
    int field_d;
    cn field_h;
    static jpa field_a;

    final static boolean a(String param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (null == gj.field_q) {
          return false;
        } else {
          if (param1 != -1) {
            return false;
          } else {
            L0: {
              if ((param0.toLowerCase().indexOf(gj.field_q.toLowerCase()) ^ -1) > -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 >= -13) {
            return;
        }
        field_a = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
    }
}
