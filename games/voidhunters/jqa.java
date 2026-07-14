/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jqa extends rqa {
    static String[] field_o;

    public static void e(byte param0) {
        if (param0 != 4) {
            return;
        }
        field_o = null;
    }

    jqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          cra.field_o = param0[0].a(124);
          return new nc((Object) (Object) "void");
        } else {
          cra.field_o = param0[0].a(124);
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Hidden", "Members only", "Open"};
    }
}
