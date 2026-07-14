/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mgb extends rqa {
    static boolean field_o;
    static int field_q;
    static int[] field_p;

    public static void e(byte param0) {
        if (param0 != -49) {
            field_o = false;
            field_p = null;
            return;
        }
        field_p = null;
    }

    mgb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final nc a(nc[] param0, int param1) {
        si.a(27, 62, param0[0].a(15));
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
        field_q = 33;
        field_p = new int[8192];
    }
}
