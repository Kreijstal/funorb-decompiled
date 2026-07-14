/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rta extends rqa {
    static gj field_o;
    static int field_p;
    static String field_q;

    rta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = null;
          return new nc((Object) (Object) frb.a(78, 84));
        } else {
          return new nc((Object) (Object) frb.a(78, 84));
        }
    }

    public static void a(int param0) {
        if (param0 != 32) {
            rta.a(-20);
            field_q = null;
            field_o = null;
            return;
        }
        field_q = null;
        field_o = null;
    }

    final static hva a(Throwable param0, String param1) {
        hva var2_ref = null;
        hva var2 = null;
        if (param0 instanceof hva) {
            var2 = (hva) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        } else {
            var2_ref = new hva(param0, param1);
        }
        return var2_ref;
    }

    final static boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -3840) {
          L0: {
            field_o = null;
            if (lrb.field_b != dw.field_c) {
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
            if (lrb.field_b != dw.field_c) {
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
        field_p = 0;
        field_o = new gj();
        field_q = "Year";
    }
}
