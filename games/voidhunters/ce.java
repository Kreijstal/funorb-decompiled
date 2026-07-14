/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rqa {
    static ij field_p;
    static byte[] field_o;

    public static void a(int param0) {
        if (param0 != 8) {
            field_p = null;
            field_p = null;
            field_o = null;
            return;
        }
        field_p = null;
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((ce) this).a((nc[]) null, -2);
          return new nc((Object) (Object) frb.a(226, 110));
        } else {
          return new nc((Object) (Object) frb.a(226, 110));
        }
    }

    final static void b(boolean param0) {
        ema.field_o = new mfb[12];
        ema.field_o[0] = (mfb) (Object) new fpb();
        ema.field_o[1] = (mfb) (Object) new deb();
        ema.field_o[2] = (mfb) (Object) new ifb();
        ema.field_o[3] = (mfb) (Object) new wqb();
        ema.field_o[4] = (mfb) (Object) new mna();
        ema.field_o[5] = (mfb) (Object) new teb();
        ema.field_o[6] = (mfb) (Object) new fma();
        ema.field_o[11] = (mfb) (Object) new rma();
        ema.field_o[7] = (mfb) (Object) new wca();
        ema.field_o[8] = (mfb) (Object) new dm();
        ema.field_o[9] = (mfb) (Object) new ira();
        ema.field_o[10] = (mfb) (Object) new jeb();
        if (param0) {
            ce.b(false);
        }
    }

    final static void a(asb param0, boolean param1) {
        fca var2 = null;
        Object var3 = null;
        fca.b(param0.a("", true, "headers.packvorbis"));
        if (param1) {
          var3 = null;
          ce.a((asb) null, false);
          var2 = fca.a(param0, "jagex logo2.packvorbis", "");
          gd discarded$4 = var2.b();
          return;
        } else {
          var2 = fca.a(param0, "jagex logo2.packvorbis", "");
          gd discarded$5 = var2.b();
          return;
        }
    }

    ce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ij();
    }
}
