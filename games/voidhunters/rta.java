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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(78, 84));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("rta.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
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
            var2 = (hva) ((Object) param0);
            var2.field_a = var2.field_a + ' ' + param1;
        } else {
            var2 = new hva(param0, param1);
        }
        return var2;
    }

    final static boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -3840) {
          L0: {
            field_o = (gj) null;
            if (lrb.field_b != dw.field_c) {
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
            if (lrb.field_b != dw.field_c) {
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

    static {
        field_p = 0;
        field_o = new gj();
        field_q = "Year";
    }
}
