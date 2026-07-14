/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qhb extends rqa {
    static int field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((qhb) this).a((nc[]) null, 51);
          return new nc((Object) (Object) frb.a(192, 102));
        } else {
          return new nc((Object) (Object) frb.a(192, 102));
        }
    }

    public static void e(byte param0) {
        if (param0 != -118) {
            field_o = 31;
            field_p = null;
            return;
        }
        field_p = null;
    }

    qhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_p = "Multiplayer lobby";
    }
}
