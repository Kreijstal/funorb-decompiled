/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lgb extends rqa {
    static int field_o;
    static String field_p;

    lgb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = -46 % ((-15 - param1) / 58);
        return 0 != (2048 & param2) ? true : false;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((lgb) this).a((nc[]) null, 53);
          return new nc((Object) (Object) frb.a(167, 115));
        } else {
          return new nc((Object) (Object) frb.a(167, 115));
        }
    }

    public static void b(boolean param0) {
        field_p = null;
        if (param0) {
            boolean discarded$0 = lgb.a(108, 71, -111);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Show private chat from my friends and opponents";
    }
}
