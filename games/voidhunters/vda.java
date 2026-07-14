/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vda extends rqa {
    static String field_o;
    static String field_q;
    static String field_p;

    vda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(eab param0, dra param1, java.awt.Component param2, boolean param3, int param4, int param5, byte param6, int param7) {
        vka.a(param7, param3, 10);
        flb.field_o = vka.a(param0, param2, 0, param4);
        aaa.field_b = vka.a(param0, param2, 1, param5);
        if (param6 != 21) {
          field_q = null;
          kpb.field_q = new qkb();
          mw.field_e = param5;
          aaa.field_b.a((f) (Object) kpb.field_q);
          ew.field_p = param1;
          ew.field_p.b((byte) -108, hlb.field_p);
          flb.field_o.a((f) (Object) ew.field_p);
          return;
        } else {
          kpb.field_q = new qkb();
          mw.field_e = param5;
          aaa.field_b.a((f) (Object) kpb.field_q);
          ew.field_p = param1;
          ew.field_p.b((byte) -108, hlb.field_p);
          flb.field_o.a((f) (Object) ew.field_p);
          return;
        }
    }

    final static ngb a(int param0, String param1, asb param2, asb param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          field_o = null;
          var5 = param2.b(param1, -127);
          var6 = param2.a(true, var5, param4);
          return mtb.a(320, var6, param3, var5, param2);
        } else {
          var5 = param2.b(param1, -127);
          var6 = param2.a(true, var5, param4);
          return mtb.a(320, var6, param3, var5, param2);
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((vda) this).a((nc[]) null, -112);
          return new nc((Object) (Object) frb.a(120, 103));
        } else {
          return new nc((Object) (Object) frb.a(120, 103));
        }
    }

    public static void e(byte param0) {
        if (param0 != 99) {
          field_q = null;
          field_p = null;
          field_o = null;
          field_q = null;
          return;
        } else {
          field_p = null;
          field_o = null;
          field_q = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "to keep fullscreen or";
        field_q = "Quit to website";
    }
}
