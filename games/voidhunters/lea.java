/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lea extends rqa {
    static qrb field_o;

    final static void a(String param0, int param1, int param2, int param3, int param4, byte param5) {
        woa.a(param3, param2, param1, (byte) 74, param4, nua.field_p, param0);
        if (param5 != -103) {
            field_o = null;
        }
    }

    lea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((lea) this).a((nc[]) null, 9);
          return new nc((Object) (Object) frb.a(33, 120));
        } else {
          return new nc((Object) (Object) frb.a(33, 120));
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 33) {
            Object var2 = null;
            lea.a((String) null, -71, 30, -95, 67, (byte) -77);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new qrb();
    }
}
