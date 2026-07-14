/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends rqa {
    static String field_p;
    static String field_o;

    gh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(226, 62, param0[0].a(45));
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((gh) this).a((nc[]) null, -125);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        if (param0 != 14055) {
            field_p = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_o = "Mouse over to repair";
    }
}
