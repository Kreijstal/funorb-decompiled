/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class brb extends rqa {
    static int field_o;

    brb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e() {
        java.awt.Canvas var1 = null;
        if (upa.field_a) {
            upa.field_a = false;
            var1 = df.e((byte) 123);
            mob discarded$0 = bm.field_o.a((java.awt.Component) (Object) var1, noa.field_q, pk.field_o, 14);
            mob discarded$1 = bm.field_o.a((java.awt.Component) (Object) var1, true, (byte) -122);
            kc.field_b = pk.field_o;
            uia.field_b = noa.field_q;
        }
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
              si.a(134, 62, param0[0].a(45));
              if (param1 < -119) {
                break L1;
              } else {
                field_o = -111;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("brb.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static rbb f(byte param0) {
        if (param0 != 62) {
          L0: {
            rbb discarded$1 = brb.f((byte) -106);
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
              break L0;
            } else {
              break L0;
            }
          }
          return eg.field_p;
        } else {
          L1: {
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
              break L1;
            } else {
              break L1;
            }
          }
          return eg.field_p;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 30;
    }
}
