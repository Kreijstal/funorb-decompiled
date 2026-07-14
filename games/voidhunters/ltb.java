/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ltb extends rqa {
    static String field_o;
    static int field_p;
    static String field_q;

    ltb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(byte param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -94) {
          L0: {
            field_p = 16;
            if (null == nf.a(param1, false)) {
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
            if (null == nf.a(param1, false)) {
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
        field_o = null;
        field_q = null;
        if (param0 != 10) {
            ltb.a(-69);
        }
    }

    final nc a(nc[] param0, int param1) {
        ceb.field_p = param0[0].a(false);
        if (param1 > -119) {
          field_q = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 10;
        field_o = "Previous";
        field_q = "Waiting for extra data";
    }
}
