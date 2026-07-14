/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends rqa {
    static int field_p;
    static String field_s;
    static int field_r;
    static float field_q;
    static String field_o;

    u(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = 0.9251408576965332f;
          return new nc((Object) (Object) frb.a(93, 74));
        } else {
          return new nc((Object) (Object) frb.a(93, 74));
        }
    }

    public static void a(int param0) {
        field_s = null;
        if (param0 != 4) {
            u.a(8);
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 4;
        field_s = "Show all lobby chat";
        field_o = "Effective at short range or against ordnance";
        field_q = 1.0f;
    }
}
