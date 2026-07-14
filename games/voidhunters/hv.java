/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv extends rqa {
    static dja field_o;
    static String field_p;

    hv(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((hv) this).a((nc[]) null, -68);
          return new nc((Object) (Object) frb.a(155, 91));
        } else {
          return new nc((Object) (Object) frb.a(155, 91));
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 15) {
            hv.e((byte) 22);
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Discard";
        field_o = (dja) (Object) new dlb();
    }
}
