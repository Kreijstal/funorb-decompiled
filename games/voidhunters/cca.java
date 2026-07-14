/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cca extends rqa {
    static qrb field_o;
    static int field_p;

    cca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        int var1 = -82 / ((81 - param0) / 34);
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          cca.e((byte) 112);
          si.a(62, 62, param0[0].a(58));
          return new nc((Object) (Object) "void");
        } else {
          si.a(62, 62, param0[0].a(58));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new qrb();
        field_p = 64;
    }
}
