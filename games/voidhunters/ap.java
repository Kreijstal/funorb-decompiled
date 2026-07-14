/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap extends rqa {
    static byte[] field_o;
    static int[] field_p;
    static String field_q;

    ap(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 215) {
            field_q = null;
            field_p = null;
            field_q = null;
            return;
        }
        field_p = null;
        field_q = null;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((ap) this).a((nc[]) null, 44);
          return new nc((Object) (Object) frb.a(215, 101));
        } else {
          return new nc((Object) (Object) frb.a(215, 101));
        }
    }

    final static boolean e(int param0) {
        if (param0 != 215) {
            return false;
        }
        if (ov.field_o == null) {
            return false;
        }
        if (!tc.field_c.a((byte) 98)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Armour small";
    }
}
