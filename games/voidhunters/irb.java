/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class irb extends rqa {
    irb(String param0, Class[] param1, String param2) {
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
                irb.a(-72);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(170, 112));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("irb.A(");

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

    final static void a(int param0) {
        me.field_q.a(0, 123, fh.field_f.field_hb - (!ll.field_o ? 0 : 4 + (rba.field_a - -40)), 0, 18);
        epa.field_o.a(-40 + fh.field_f.field_hb + (-rba.field_a - 2), -29, 42 - -rba.field_a, param0, 18);
        tja.field_a.a(fh.field_f.field_hb, 2, -1, fh.field_f.field_G + -20, 20, 0, rba.field_a);
    }

    static {
    }
}
