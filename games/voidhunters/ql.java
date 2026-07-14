/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends rqa {
    static kba field_p;
    static float field_o;

    ql(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        if (param0 != 63) {
            field_o = -0.15479488670825958f;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) frb.a(1, 92));
        } else {
          return new nc((Object) (Object) frb.a(1, 92));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0.005976562388241291f;
        field_p = new kba();
    }
}
