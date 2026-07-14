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
        if (param0 != -128) {
          return;
        } else {
          L0: {
            if (!upa.field_a) {
              break L0;
            } else {
              upa.field_a = false;
              var1 = df.e((byte) 123);
              mob discarded$4 = bm.field_o.a((java.awt.Component) (Object) var1, noa.field_q, pk.field_o, 14);
              mob discarded$5 = bm.field_o.a((java.awt.Component) (Object) var1, true, (byte) -122);
              kc.field_b = pk.field_o;
              uia.field_b = noa.field_q;
              break L0;
            }
          }
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(134, 62, param0[0].a(45));
        if (param1 >= -119) {
          field_o = -111;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
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
