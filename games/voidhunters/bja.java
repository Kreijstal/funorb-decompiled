/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bja extends rqa {
    static int[] field_p;
    static String field_o;

    public static void f(byte param0) {
        field_o = null;
        if (param0 < 74) {
            return;
        }
        field_p = null;
    }

    bja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(161, 62, param0[0].a(43));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static int e(byte param0) {
        int var1 = 57 % ((param0 - 65) / 52);
        return tqa.e((byte) 96) - se.a(false) / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[5];
        field_o = "Previous condition/action value";
    }
}
