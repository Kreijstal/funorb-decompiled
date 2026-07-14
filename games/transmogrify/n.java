/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_b;
    static int field_a;

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = Transmogrify.field_A ? 1 : 0;
        if (-1 <= (param3 ^ -1)) {
            var4 = param0;
        } else {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; var5_int < param1; var5_int++) {
                var8[var5_int] = param0[param3 + var5_int];
            }
        }
        rl var5 = new rl();
        if (param2 != -5705) {
            n.a(true);
        }
        var5.a(param2 + 21003);
        var5.a(14027, (long)(param1 * 8), var4);
        byte[] var10 = new byte[64];
        byte[] var9 = var10;
        byte[] var6 = var9;
        var5.a(var10, param2 + 5821, 0);
        return var6;
    }

    public static void a(boolean param0) {
        if (param0) {
            n.a(true);
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1) {
        wl.a(param1, param0, 170);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
