/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uib extends rqa {
    static dja field_o;
    static int[] field_p;

    uib(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        pab.field_m = param0[0].a(127);
        if (param1 > -119) {
          field_p = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new nra();
        field_p = new int[12];
    }
}
