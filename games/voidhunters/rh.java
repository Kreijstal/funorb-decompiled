/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends rqa {
    static arb field_o;
    static String field_p;

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        if (param0 >= -32) {
            field_p = null;
        }
    }

    final static short[] a(int param0, short[] param1, byte param2) {
        short[] var3 = null;
        Object var4 = null;
        short[] var5 = null;
        if (param2 <= 44) {
          var4 = null;
          short[] discarded$2 = rh.a(-79, (short[]) null, (byte) 29);
          var5 = new short[param0];
          var3 = var5;
          cua.a(param1, 0, var5, 0, param0);
          return var5;
        } else {
          var5 = new short[param0];
          var3 = var5;
          cua.a(param1, 0, var5, 0, param0);
          return var5;
        }
    }

    rh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(35, 94));
        } else {
          return new nc((Object) (Object) frb.a(35, 94));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Team";
    }
}
