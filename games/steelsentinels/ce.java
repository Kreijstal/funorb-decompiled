/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends ck {
    static int[] field_t;
    static gh field_o;
    static int field_r;
    static wk[] field_v;
    byte[] field_s;
    static gk[] field_q;
    static volatile boolean field_w;
    static String field_u;
    static wk field_p;

    ce(byte[] param0) {
        ((ce) this).field_s = param0;
    }

    public static void a(byte param0) {
        field_v = null;
        field_t = null;
        field_o = null;
        if (param0 != 77) {
          field_o = null;
          field_p = null;
          field_q = null;
          field_u = null;
          return;
        } else {
          field_p = null;
          field_q = null;
          field_u = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = jg.a(true);
        field_u = "Please enter a year between <%0> and <%1>";
        field_w = false;
    }
}
