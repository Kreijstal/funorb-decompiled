/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dca extends rqa {
    static int[] field_q;
    static boolean field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((dca) this).a((nc[]) null, -15);
          return new nc((Object) (Object) frb.a(227, 121));
        } else {
          return new nc((Object) (Object) frb.a(227, 121));
        }
    }

    dca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 < 0) {
            dca.a(96);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 1;
    }
}
