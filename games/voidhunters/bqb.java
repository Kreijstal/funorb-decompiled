/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bqb extends rqa {
    static boolean[] field_o;
    static String field_p;

    public static void e(byte param0) {
        int var1 = -9 % ((-14 - param0) / 47);
        field_o = null;
        field_p = null;
    }

    bqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(82, 62, param0[0].a(8));
        if (param1 >= -119) {
          bqb.e((byte) 124);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new boolean[8];
        field_p = "Armour big";
    }
}
