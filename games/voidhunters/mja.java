/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mja extends rqa {
    static dja field_p;
    static boolean field_o;

    mja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 < 8) {
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(1, 62, param0[0].a(64));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = (dja) (Object) new lj();
        field_o = false;
    }
}
