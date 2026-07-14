/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jmb extends rqa {
    static String field_s;
    static int field_p;
    static int[] field_q;
    static int[] field_r;
    static String field_o;

    jmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        if (!param0) {
          jmb.b(true);
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((jmb) this).a((nc[]) null, -55);
          return new nc((Object) (Object) frb.a(83, 123));
        } else {
          return new nc((Object) (Object) frb.a(83, 123));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 37;
        field_s = "Log in";
        field_r = new int[]{2, 21, 4, 3, 23, 11};
        field_o = "Loading music";
    }
}
