/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vnb extends rqa {
    static int field_p;
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 54) {
            vnb.a(-75);
        }
    }

    vnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(54, 113));
        } else {
          return new nc((Object) (Object) frb.a(54, 113));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Invite";
        field_p = 36;
    }
}
