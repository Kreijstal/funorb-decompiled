/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rib extends rqa {
    static String field_o;

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) gha.field_q);
        int var2 = -92 % ((param1 - 64) / 56);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) gha.field_q);
        dh.field_p = -1;
    }

    rib(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          si.a(8, 62, param0[0].a(50));
          return new nc((Object) (Object) "void");
        } else {
          si.a(8, 62, param0[0].a(50));
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -126) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Accept invitation to <%0>'s game";
    }
}
