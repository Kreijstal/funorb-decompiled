/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends rqa {
    static int field_r;
    static String field_q;
    static dja field_s;
    static int field_p;
    static String field_o;

    public static void b(boolean param0) {
        field_q = null;
        field_s = null;
        if (param0) {
            nd.b(false);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(26, 62, param0[0].a(30));
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((nd) this).a((nc[]) null, -61);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    nd(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Pause Menu";
        field_p = 48;
        field_s = (dja) (Object) new uk();
        field_o = "Please select options in the following rows:  ";
    }
}
