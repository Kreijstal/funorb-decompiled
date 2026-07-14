/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends rqa {
    static String field_o;
    static ij field_p;

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        int var1 = -31 / ((44 - param0) / 52);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          nua.field_o = param0[0].a(60);
          return new nc((Object) (Object) "void");
        } else {
          nua.field_o = param0[0].a(60);
          return new nc((Object) (Object) "void");
        }
    }

    ca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unable to connect to the data server. Please check any firewall you are using.";
        field_p = new ij();
    }
}
