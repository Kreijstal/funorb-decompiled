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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            irb.a(-72);
          }
          stackIn_3_0 = new nc(frb.a(170, 112));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("irb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        me.field_q.a(0, 123, fh.field_f.field_hb - (!ll.field_o ? 0 : 4 + (rba.field_a + 40)), 0, 18);
        epa.field_o.a(-40 + fh.field_f.field_hb + (-rba.field_a - 2), -29, 42 + rba.field_a, param0, 18);
        tja.field_a.a(fh.field_f.field_hb, 2, -1, fh.field_f.field_G - 20, 20, 0, rba.field_a);
    }

    static {
    }
}
