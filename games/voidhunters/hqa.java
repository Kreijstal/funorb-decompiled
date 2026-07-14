/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hqa extends rqa {
    static String field_o;

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -115) {
            hqa.e((byte) 82);
        }
    }

    hqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((hqa) this).a((nc[]) null, -13);
          return new nc(cra.field_o);
        } else {
          return new nc(cra.field_o);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Increased map width";
    }
}
