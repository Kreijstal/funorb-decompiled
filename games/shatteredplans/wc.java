/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static String field_b;
    static hc[] field_a;

    final static void a(int param0, int param1, int param2, bi param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            if (param1 >= 128) {
                gf.d(param2, 0, -128 + (param2 - -param1), param4 - -480);
                param3.c(param2, param4, param5);
            }
            var6_int = 128 > param1 ? 0 : -128 + param1;
            var7 = param1;
            if (param0 != -27030) {
                field_b = null;
            }
            for (var8 = var6_int; var7 > var8; var8++) {
                gf.d(param2 - -var8, 0, param2 + (var8 + 1), 480 + param4);
                var9 = param5 * (-var8 + param1) >> 7;
                param3.c(param2, param4, var9);
            }
            gf.a();
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wc.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "ERROR!";
    }
}
