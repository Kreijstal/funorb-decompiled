/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends rqa {
    static dja field_o;
    static String field_p;
    static String field_q;

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
              if (param1 <= -119) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            si.a(107, 62, param0[0].a(99));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ra.A(");

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

    ra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static phb[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 112) {
          ra.a(-19, (byte) -41, -16, 83, 121);
          return hi.a(-972, 1, param4, 3, param3, 1, 1, param2, param0);
        } else {
          return hi.a(-972, 1, param4, 3, param3, 1, 1, param2, param0);
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_p = null;
        field_o = null;
        if (param0 != 107) {
            ra.a(-92, (byte) 16, 92, 10, 28);
        }
    }

    static {
        field_o = (dja) ((Object) new qlb());
        field_p = "The match was a draw!";
        field_q = "Options";
    }
}
