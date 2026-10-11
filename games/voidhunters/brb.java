/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class brb extends rqa {
    static int field_o;

    brb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e(byte param0) {
        java.awt.Canvas var1 = null;
        if (param0 == -128) {
          if (upa.field_a) {
            upa.field_a = false;
            var1 = df.e((byte) 123);
            bm.field_o.a((java.awt.Component) ((Object) var1), noa.field_q, pk.field_o, 14);
            bm.field_o.a((java.awt.Component) ((Object) var1), true, (byte) -122);
            kc.field_b = pk.field_o;
            uia.field_b = noa.field_q;
          }
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(134, 62, param0[0].a(45));
          if (param1 >= -119) {
            field_o = -111;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("brb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static rbb f(byte param0) {
        if (param0 == 62) {
          if (eg.field_p == null) {
            eg.field_p = new rbb();
            eg.field_p.a(loa.field_o, -24763);
            eg.field_p.field_j = 5;
            eg.field_p.field_b = 2763306;
            eg.field_p.field_p = web.field_o;
            eg.field_p.field_c = 4;
            eg.field_p.field_h = 6;
            eg.field_p.field_g = 14;
            eg.field_p.field_u = 0;
            eg.field_p.field_m = 7697781;
          }
          return eg.field_p;
        }
        brb.f((byte) -106);
        if (eg.field_p == null) {
          eg.field_p = new rbb();
          eg.field_p.a(loa.field_o, -24763);
          eg.field_p.field_j = 5;
          eg.field_p.field_b = 2763306;
          eg.field_p.field_p = web.field_o;
          eg.field_p.field_c = 4;
          eg.field_p.field_h = 6;
          eg.field_p.field_g = 14;
          eg.field_p.field_u = 0;
          eg.field_p.field_m = 7697781;
        }
        return eg.field_p;
    }

    static {
        field_o = 30;
    }
}
