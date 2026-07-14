/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static lo field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 > -73) {
            field_b = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, byte[] param5) {
        pf var6 = sja.field_fb;
        var6.c(param3, (byte) 112);
        int var8 = 112 % ((64 - param0) / 59);
        var6.field_g = var6.field_g + 1;
        int var7 = var6.field_g;
        var6.d(4, 0);
        var6.d(param1, 0);
        int var9 = param2;
        if (!(!param4)) {
            // wide iinc 9 128
        }
        var6.d(var9, 0);
        var6.a(0, -105, param5.length, param5);
        var6.b((byte) 77, var6.field_g - var7);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new lo();
        field_a = 0;
    }
}
