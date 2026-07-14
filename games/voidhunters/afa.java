/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class afa extends rqa {
    static String field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((afa) this).a((nc[]) null, -72);
          return new nc((Object) (Object) frb.a(67, 98));
        } else {
          return new nc((Object) (Object) frb.a(67, 98));
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            afa.b(true);
            field_p = null;
            return;
        }
        field_p = null;
    }

    afa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "TAB - hide chat temporarily";
        field_p = "Click here or press R to leave repair mode";
    }
}
