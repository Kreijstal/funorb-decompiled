/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vaa extends rqa {
    static String field_o;

    vaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(141, 119));
        } else {
          return new nc((Object) (Object) frb.a(141, 119));
        }
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = 42 / ((param0 - -33) / 43);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Connection restored.";
    }
}
