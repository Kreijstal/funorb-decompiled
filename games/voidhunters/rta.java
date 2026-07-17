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
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(78, 84));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rta.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
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
        hva var2 = null;
        if (param0 instanceof hva) {
            var2 = (hva) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        } else {
            var2 = new hva(param0, param1);
        }
        return var2;
    }

    final static boolean e(int param0) {
        return lrb.field_b == dw.field_c;
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
