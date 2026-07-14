/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jca extends rqa {
    static String field_o;
    static String field_p;

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        if (param0 <= 55) {
            field_p = null;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = param1 >> 1817716304;
        int var4 = 65535 & param1;
        int var5 = param0 >> -31148048;
        int var6 = -127 % ((param2 - -4) / 62);
        int var7 = 65535 & param0;
        return var3 * param0 - (-(var5 * var4) + -(var7 * var4 >> -446832592));
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(205, 86));
    }

    jca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You cannot join this game - it is in progress";
        field_p = "Waiting for instruments";
    }
}
