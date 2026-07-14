/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ica extends rqa {
    static String field_p;
    static String field_o;

    final static int a(int param0) {
        if (param0 != 9) {
            field_o = null;
            return 9;
        }
        return 9;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(6, 62, param0[0].a(52));
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -20) {
            return;
        }
        field_p = null;
    }

    ica(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Accept <%0> into this game";
        field_o = "<%0> won the match with <%1> <%2>!";
    }
}
