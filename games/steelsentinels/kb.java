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
        if (param0 != 5) {
            return;
        }
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5, mi param6, int param7) {
        int var8 = 0;
        var8 = param6.c(param5);
        param7 = param7 - (3 + var8 / 2);
        var8 += 5;
        if (!param4) {
          kb.a(-79);
          pb.a(param7, -2 + -param6.field_U + param2, var8, param6.field_U - -4, param1);
          pb.h(param7, -param6.field_U + (param2 - 2), var8, 4 + param6.field_U, param3);
          param6.b(param5, 3 + param7, param2, param0, -1);
          return;
        } else {
          pb.a(param7, -2 + -param6.field_U + param2, var8, param6.field_U - -4, param1);
          pb.h(param7, -param6.field_U + (param2 - 2), var8, 4 + param6.field_U, param3);
          param6.b(param5, 3 + param7, param2, param0, -1);
          return;
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
