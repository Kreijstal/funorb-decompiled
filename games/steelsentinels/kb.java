/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb implements om {
    static int field_a;
    static gh field_b;
    static String field_d;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5, mi param6, int param7) {
        int var8_int = 0;
        try {
            var8_int = param6.c(param5);
            param7 = param7 - (3 + var8_int / 2);
            var8_int += 5;
            pb.a(param7, -2 + -param6.field_U + param2, var8_int, param6.field_U - -4, param1);
            pb.h(param7, -param6.field_U + (param2 - 2), var8_int, 4 + param6.field_U, param3);
            param6.b(param5, 3 + param7, param2, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "kb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + true + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has joined your game.";
        field_c = "Loading fonts";
    }
}
