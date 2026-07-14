/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class flb extends rqa {
    static vka field_o;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((flb) this).a((nc[]) null, -97);
          si.a(225, 62, param0[0].a(77));
          return new nc((Object) (Object) "void");
        } else {
          si.a(225, 62, param0[0].a(77));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -26016) {
            flb.a(-2);
        }
    }

    flb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, String param1, int param2, String param3, int param4) {
        bpa.field_c.field_hb = bpa.field_c.field_hb + fgb.field_l.field_hb;
        bpa.field_c.field_Y = param4;
        bpa.field_c.field_R = param1;
        bpa.field_c.field_s = param3;
        fgb.field_l.field_L = fgb.field_l.field_L + fgb.field_l.field_hb;
        fgb.field_l.field_hb = param2;
        if (param0 != 19204) {
          flb.a(98);
          bpa.field_c.field_hb = bpa.field_c.field_hb - fgb.field_l.field_hb;
          fgb.field_l.field_L = fgb.field_l.field_L - fgb.field_l.field_hb;
          return;
        } else {
          bpa.field_c.field_hb = bpa.field_c.field_hb - fgb.field_l.field_hb;
          fgb.field_l.field_L = fgb.field_l.field_L - fgb.field_l.field_hb;
          return;
        }
    }

    static {
    }
}
