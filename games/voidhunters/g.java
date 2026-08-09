/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends rqa {
    final static void e(int param0) {
        erb.field_p = false;
        hb.field_c = qga.field_b.e((byte) -90) == 0 ? true : false;
        if (param0 >= -65) {
            return;
        }
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
              if (param1 <= -119) {
                break L1;
              } else {
                g.a(87);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(229, 87));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("g.A(");

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

    final static void e(byte param0) {
        System.out.println("load_settings(\"");
        ug.e((byte) 106);
        System.out.println("\")");
        if (param0 < 102) {
            g.e(-54);
        }
    }

    final static asb a(int param0) {
        if (param0 != 0) {
            return (asb) null;
        }
        return wpb.a(wd.field_o.field_a, 11835);
    }

    g(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
