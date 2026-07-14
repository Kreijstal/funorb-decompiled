/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qna extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(173, 62, param0[0].a(29));
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((qna) this).a((nc[]) null, 106);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -68) {
            field_o = null;
        }
    }

    qna(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You are on <%0>";
    }
}
