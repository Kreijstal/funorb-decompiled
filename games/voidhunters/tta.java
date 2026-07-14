/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tta extends rqa {
    static String field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          si.a(182, 62, param0[0].a(93));
          return new nc((Object) (Object) "void");
        } else {
          si.a(182, 62, param0[0].a(93));
          return new nc((Object) (Object) "void");
        }
    }

    final static String a(int param0, asb param1, String param2, String param3) {
        int var4 = 0;
        if (!param1.b((byte) 100)) {
          return param2;
        } else {
          var4 = 110 / ((param0 - 72) / 43);
          return param3 + " - " + param1.b(-124) + "%";
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 <= 71) {
            Object var2 = null;
            String discarded$0 = tta.a(-36, (asb) null, (String) null, (String) null);
        }
    }

    tta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Chat view has been scrolled up. Scroll down to chat.";
        field_p = 50;
    }
}
