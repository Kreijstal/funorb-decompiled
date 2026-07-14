/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    int field_e;
    static String field_g;
    static boolean field_b;
    String field_f;
    ki field_a;
    static boolean field_d;
    String field_h;
    String field_c;

    final static void a(int param0, boolean param1) {
        if (!param1) {
            Object var3 = null;
            byte[] discarded$0 = gn.a((byte[]) null, (byte) -29, -53, 2);
        }
        dj discarded$1 = fe.a(-125, rc.field_l[param0]);
    }

    final static byte[] a(byte[] param0, byte param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (param1 >= -98) {
            gn.a(-28, false);
        }
        if ((param2 ^ -1) >= -1) {
            var4 = param0;
        } else {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; var5_int < param3; var5_int++) {
                var8[var5_int] = param0[var5_int + param2];
            }
        }
        np var5 = new np();
        var5.b(-9);
        var5.a(var4, 7, (long)(param3 * 8));
        byte[] var6 = new byte[64];
        var5.a(0, var6, -25);
        return var6;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            Object var2 = null;
            byte[] discarded$0 = gn.a((byte[]) null, (byte) -96, -56, 90);
        }
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Please enter your age in years";
    }
}
