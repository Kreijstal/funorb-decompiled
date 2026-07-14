/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jda extends rqa {
    static String field_p;
    static String[] field_o;

    final nc a(nc[] param0, int param1) {
        tkb.field_p = param0[0].a(44);
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    jda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 0) {
            jda.a(-22);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "More nebulae";
        field_o = new String[]{"", "", "", "s", "s", "s", "", "", "", "", "", ""};
    }
}
