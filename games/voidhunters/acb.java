/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class acb extends rqa {
    static boolean field_p;
    static String field_r;
    static String field_q;
    static String field_o;

    acb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
            acb.b(false);
            field_o = null;
            field_r = null;
            return;
        }
        field_o = null;
        field_r = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = null;
          si.a(13, 62, param0[0].a(36));
          return new nc((Object) (Object) "void");
        } else {
          si.a(13, 62, param0[0].a(36));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "One team has a base, the other team wants to destroy it";
        field_r = "Try changing the following settings:  ";
        field_o = "<%0> has declined the invitation.";
    }
}
