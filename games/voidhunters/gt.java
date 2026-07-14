/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt extends rqa {
    static boolean field_q;
    static llb field_o;
    static float field_p;

    public static void e(byte param0) {
        if (param0 < 121) {
            gt.e((byte) 2);
            field_o = null;
            return;
        }
        field_o = null;
    }

    gt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = true;
          si.a(51, 62, param0[0].a(33));
          return new nc((Object) (Object) "void");
        } else {
          si.a(51, 62, param0[0].a(33));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = true;
        field_p = 0.0f;
    }
}
