/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends rqa {
    static long field_q;
    static String field_p;
    static int[] field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          int discarded$2 = hj.a(-119, (byte) -60);
          return new nc((Object) (Object) frb.a(26, 107));
        } else {
          return new nc((Object) (Object) frb.a(26, 107));
        }
    }

    public static void a(int param0) {
        if (param0 < 2) {
            field_q = 35L;
            field_o = null;
            field_p = null;
            return;
        }
        field_o = null;
        field_p = null;
    }

    hj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1931966241;
        param0 = param0 | param0 >>> -358267710;
        param0 = param0 | param0 >>> 1516810340;
        if (param1 > -93) {
          int discarded$2 = hj.a(126, (byte) 26);
          param0 = param0 | param0 >>> 602033416;
          param0 = param0 | param0 >>> -1276018928;
          return param0 + 1;
        } else {
          param0 = param0 | param0 >>> 602033416;
          param0 = param0 | param0 >>> -1276018928;
          return param0 + 1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Tutorial tips: On";
        field_o = new int[8192];
    }
}
