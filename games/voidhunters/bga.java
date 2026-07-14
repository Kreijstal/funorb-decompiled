/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bga extends rqa {
    static String field_o;

    public static void a(int param0) {
        if (param0 != 207) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(207, 62, param0[0].a(16));
          return new nc((Object) (Object) "void");
        }
    }

    bga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Only show private chat from my friends and opponents";
    }
}
