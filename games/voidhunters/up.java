/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends rqa {
    static String field_p;
    static khb field_o;

    public static void e(byte param0) {
        field_p = null;
        int var1 = 126 / ((-36 - param0) / 51);
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(120, 62, param0[0].a(7));
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    final static String[] a(byte param0, char param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = qn.a(param1, (byte) 58, var10);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        if (param0 != -67) {
            up.e((byte) 26);
        }
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    up(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Message team";
        field_o = new khb("email");
    }
}
