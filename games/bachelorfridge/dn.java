/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static lo field_b;
    static int field_a;

    public static void a() {
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, byte[] param5) {
        pf var6 = null;
        int var7 = 0;
        int var9 = 0;
        try {
            var6 = sja.field_fb;
            var6.c(11, (byte) 112);
            int var8 = 0;
            var6.field_g = var6.field_g + 1;
            var7 = var6.field_g;
            var6.d(4, 0);
            var6.d(param1, 0);
            var9 = 0;
            var9 += 128;
            var6.d(var9, 0);
            var6.a(0, -105, param5.length, param5);
            var6.b((byte) 77, var6.field_g - var7);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dn.B(" + -25 + 44 + param1 + 44 + 0 + 44 + 11 + 44 + 1 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new lo();
        field_a = 0;
    }
}
