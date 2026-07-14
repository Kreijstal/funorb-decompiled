/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends rqa {
    static bi field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        si.a(112, 62, param0[0].a(79));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    tk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 <= 68) {
            field_o = -81;
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        hsb discarded$0 = new hsb();
        field_o = 1;
    }
}
