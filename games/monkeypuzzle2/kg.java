/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static String[] field_b;
    static int field_c;
    static String field_a;
    static String field_d;

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        nd.field_a = true;
        ha.field_ab = 15000L + pf.a(0);
        if (param0 <= 75) {
          L0: {
            boolean discarded$8 = kg.a((byte) 72);
            if ((k.field_g ^ -1) != -12) {
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
            if ((k.field_g ^ -1) != -12) {
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

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(String param0, boolean param1, float param2, int param3) {
        if (param3 == -9089) {
          if (null == vl.field_f) {
            vl.field_f = new ul(wg.field_j, rc.field_i);
            wg.field_j.b((byte) -74, (we) (Object) vl.field_f);
            vl.field_f.a(param1, param0, 4210752, param2);
            ge.d();
            vj.a(1, true);
            return;
          } else {
            vl.field_f.a(param1, param0, 4210752, param2);
            ge.d();
            vj.a(1, true);
            return;
          }
        } else {
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Showing by rating", "Showing by win percentage"};
        field_a = "Open in popup window";
    }
}
