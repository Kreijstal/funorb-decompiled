/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ceb extends rqa {
    static String field_r;
    static boolean field_p;
    static llb[] field_o;
    static int field_q;

    ceb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_r = null;
        if (param0 > -109) {
            field_p = true;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((ceb) this).a((nc[]) null, 97);
          return new nc((Object) (Object) frb.a(132, 84));
        } else {
          return new nc((Object) (Object) frb.a(132, 84));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Please remove <%0> from your friend list first.";
        field_p = true;
    }
}
