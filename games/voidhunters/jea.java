/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jea extends rqa {
    static String field_o;
    static String field_q;
    static int field_p;

    jea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        if (param0 != -20005) {
            field_p = 75;
            field_q = null;
            field_o = null;
            return;
        }
        field_q = null;
        field_o = null;
    }

    final static void a(int param0) {
        java.awt.Canvas var1 = null;
        L0: {
          if (!upa.field_a) {
            upa.field_a = true;
            var1 = df.e((byte) 106);
            pk.field_o = kc.field_b;
            noa.field_q = uia.field_b;
            mob discarded$4 = bm.field_o.a((java.awt.Component) (Object) var1, stb.field_p, uqb.field_h, 14);
            mob discarded$5 = bm.field_o.a((java.awt.Component) (Object) var1, false, (byte) -106);
            uia.field_b = stb.field_p;
            kc.field_b = uqb.field_h;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 6045) {
          field_p = 95;
          return;
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(108, 62, param0[0].a(57));
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((jea) this).a((nc[]) null, 3);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Show all private chat";
        field_q = "Add condition (Variable at least x)";
    }
}
