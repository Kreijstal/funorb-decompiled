/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qmb extends rqa {
    static String field_o;
    static int field_p;
    static int field_q;

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -113) {
            qmb.a(-93);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, 34);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(121, 81));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qmb.A(");

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

    qmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        if (!(nna.field_C == null)) {
            return nna.field_C.a(pma.field_o, jl.field_r, -40);
        }
        if (param0 != -22029) {
            return false;
        }
        return false;
    }

    static {
        field_o = "Increases your manoeuvrability";
        field_p = 1;
    }
}
