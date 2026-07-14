/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gcb extends rqa {
    static kba field_q;
    static String field_o;
    static String field_r;
    static String field_s;
    static String field_u;
    static String field_t;
    static boolean field_p;

    final nc a(nc[] param0, int param1) {
        jnb.field_o = param0[0].a(7);
        if (param1 > -119) {
          field_t = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          gcb.a(50);
          field_r = null;
          field_o = null;
          field_u = null;
          field_s = null;
          field_t = null;
          field_q = null;
          return;
        } else {
          field_r = null;
          field_o = null;
          field_u = null;
          field_s = null;
          field_t = null;
          field_q = null;
          return;
        }
    }

    gcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new kba();
        field_r = "Long arm";
        field_s = "Add action (Set custom variable)";
        field_o = "Macroing or use of bots";
        field_t = "Your rating is <%0>";
        field_p = true;
        field_u = "Names can only contain letters, numbers, spaces and underscores";
    }
}
