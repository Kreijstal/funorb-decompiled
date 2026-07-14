/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sbb extends rqa {
    static int field_p;
    static int[][] field_o;

    sbb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -65) {
            sbb.a(106);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(128, 113));
        } else {
          return new nc((Object) (Object) frb.a(128, 113));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 10;
        field_o = new int[][]{new int[4], new int[4], new int[4], new int[4], new int[4], new int[4]};
    }
}
