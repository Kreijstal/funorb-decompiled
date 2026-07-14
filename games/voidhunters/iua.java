/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iua extends rqa {
    static String field_o;
    static int field_p;

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 != 119) {
            iua.e((byte) 34);
            return false;
        }
        return false;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((iua) this).a((nc[]) null, -96);
          si.a(35, 62, param0[0].a(75));
          return new nc((Object) (Object) "void");
        } else {
          si.a(35, 62, param0[0].a(75));
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        if (param0 > -100) {
            field_p = 70;
            field_o = null;
            return;
        }
        field_o = null;
    }

    iua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "turret";
    }
}
