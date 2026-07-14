/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends rqa {
    static qrb field_p;
    static int field_o;

    mp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        if (param0) {
            mp.b(true);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(99, 62, param0[0].a(98));
        if (param1 > -119) {
          field_o = -16;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new qrb();
        field_o = 0;
    }
}
