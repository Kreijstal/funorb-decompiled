/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class leb extends rqa {
    static dja field_o;

    final static void a(byte param0, ml param1) {
        ml var3 = null;
        ml var5 = null;
        ml var6 = null;
        param1.a(1, 2, new ml(13));
        param1.a(1, 3, new ml(13));
        param1.a(1, 13, new ml(13));
        param1.a(1, 12, new ml(13));
        param1.a(1, 7, new ml(25));
        param1.a(1, 8, new ml(25));
        param1.a(1, 16, new ml(18));
        var3 = new ml(29);
        var3.a(1, 0, new ml(27));
        param1.a(1, 4, var3);
        if (param0 >= -77) {
          field_o = null;
          var5 = new ml(29);
          var5.a(1, 0, new ml(27));
          param1.a(1, 11, var5);
          return;
        } else {
          var6 = new ml(29);
          var6.a(1, 0, new ml(27));
          param1.a(1, 11, var6);
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((leb) this).a((nc[]) null, -56);
          return new nc(tkb.field_p);
        } else {
          return new nc(tkb.field_p);
        }
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = 76 % ((45 - param0) / 48);
    }

    leb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new jdb();
    }
}
