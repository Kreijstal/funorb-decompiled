/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bka extends rqa {
    static String field_o;
    static int field_p;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            field_p = -121;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((bka) this).a((nc[]) null, -9);
          return new nc((Object) (Object) frb.a(21, 112));
        } else {
          return new nc((Object) (Object) frb.a(21, 112));
        }
    }

    bka(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Names should contain a maximum of 12 characters";
        field_p = 0;
    }
}
