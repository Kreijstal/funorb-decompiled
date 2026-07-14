/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static String field_f;
    static um field_c;
    static int field_g;
    static String field_d;
    static String field_b;
    static String field_e;
    static bk field_i;
    static int[] field_a;
    static java.applet.Applet field_h;

    final static byte[] a(int param0, String param1) {
        if (param0 >= -14) {
            kb.a(95);
            return pc.field_b.a(0, param1, "");
        }
        return pc.field_b.a(0, param1, "");
    }

    public static void a(int param0) {
        if (param0 > -85) {
          field_g = -67;
          field_f = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_h = null;
          field_i = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_h = null;
          field_i = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_c = new um();
        field_b = "Your request to join has been declined.";
        field_a = new int[8192];
        field_e = "You can get other special items by popping two or more shapes in one go.";
        field_d = "Close";
    }
}
