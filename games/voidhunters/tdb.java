/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tdb extends rqa {
    static float[] field_o;
    static String field_p;

    tdb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((tdb) this).a((nc[]) null, -67);
          return new nc((Object) (Object) frb.a(183, 111));
        } else {
          return new nc((Object) (Object) frb.a(183, 111));
        }
    }

    public static void a(int param0) {
        if (param0 > -79) {
            tdb.a(-52);
            field_o = null;
            field_p = null;
            return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new float[4];
    }
}
