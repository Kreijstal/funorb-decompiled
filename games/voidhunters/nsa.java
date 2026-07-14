/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nsa extends rqa {
    static int field_o;
    static ha field_p;

    public static void e(byte param0) {
        int var1 = 47 / ((param0 - -36) / 33);
        field_p = null;
    }

    final static boolean[] a(int param0, faa param1, int param2, boolean[] param3) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var4 = param1.i(0, param0);
        if (0 == var4) {
            return null;
        }
        if (param3 != null) {
            // if_icmpeq L40
        }
        param3 = new boolean[var4];
        for (var5 = 0; var5 < var4; var5++) {
            param3[var5] = kv.a(false, param1);
        }
        if (param2 <= 19) {
            Object var7 = null;
            boolean[] discarded$0 = nsa.a(-37, (faa) null, -23, (boolean[]) null);
        }
        return param3;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = -91;
        }
        return new nc((Object) (Object) frb.a(25, 124));
    }

    nsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_p = null;
    }
}
