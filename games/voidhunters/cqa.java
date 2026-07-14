/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cqa extends rqa {
    static String field_q;
    static String field_o;
    static int field_p;

    cqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          cqa.e((byte) -121);
          si.a(197, 62, param0[0].a(19));
          return new nc((Object) (Object) "void");
        } else {
          si.a(197, 62, param0[0].a(19));
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        field_q = null;
        int var1 = -29 / ((14 - param0) / 41);
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Password is valid";
        field_o = "Ubercannon";
        field_p = 30;
    }
}
