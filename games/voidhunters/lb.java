/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends rqa {
    static String field_o;
    static ef field_p;

    final static int a(int param0, int param1) {
        param0 = (param1 & param0) - -(1431655765 & param0 >>> 653165089);
        param0 = (param0 & 858993459) - -((-858993460 & param0) >>> -1686521054);
        param0 = 252645135 & (param0 >>> 148032772) + param0;
        param0 = param0 + (param0 >>> -612363640);
        param0 = param0 + (param0 >>> -464755376);
        return 255 & param0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        if (param2) {
          field_p = null;
          var3 = param0 >>> -530246273;
          return -var3 + (param0 + var3) / param1;
        } else {
          var3 = param0 >>> -530246273;
          return -var3 + (param0 + var3) / param1;
        }
    }

    lb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -612363640) {
            int discarded$0 = lb.a(-95, 34);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(75, 62, param0[0].a(52));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Quit";
    }
}
