/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qtb extends rqa {
    static int field_o;
    static int field_p;
    static String[] field_q;

    qtb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          qtb.a(-28);
          return new nc((Object) (Object) frb.a(222, 109));
        } else {
          return new nc((Object) (Object) frb.a(222, 109));
        }
    }

    public static void a(int param0) {
        if (param0 != 16407) {
            qtb.a(68);
            field_q = null;
            return;
        }
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        iaa discarded$0 = new iaa();
        field_q = new String[]{"By rating", "By win percentage"};
    }
}
