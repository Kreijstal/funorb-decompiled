/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static String field_a;
    static String field_b;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -15) {
            te.a((byte) 74);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, pb param6, int param7, byte param8) {
        int var9 = -param5 + (param3 + param6.field_t - -param2);
        int var10 = param0 + (param3 + (param2 + param6.field_t));
        int var11 = param1 + (param6.field_s + (param6.field_y >> -898706559));
        ti.a(var9, 0, var10, var11 - -param7);
        param6.d(-1 + param2, param1 - 1, param4);
        param6.d(param2 + -1, 1 + param1, param4);
        ti.b(pk.field_i);
        ti.a(var9 + 1, 0, 1 + var10, var11 + param7);
        param6.d(1 + param2, param1 + -1, param4);
        param6.d(param2 + 1, param1 - -1, param4);
        ti.b(pk.field_i);
        int var12 = 39 / ((param8 - -29) / 63);
        var10 = param6.field_t + param6.field_v - -param2 + -param3 + -param5;
        var9 = param2 + (param6.field_t + param6.field_v) + (-param3 + -param0);
        ti.a(var9, var11 - param7, var10, 480);
        param6.d(param2 - 1, param1 + -1, param4);
        param6.d(-1 + param2, 1 + param1, param4);
        ti.b(pk.field_i);
        ti.a(1 + var9, -param7 + var11, 1 + var10, 480);
        param6.d(1 + param2, -1 + param1, param4);
        param6.d(param2 + 1, 1 + param1, param4);
        ti.b(pk.field_i);
    }

    final static void a(int param0, int param1, int param2, int param3, pb param4, int param5, int param6, int param7, int param8) {
        vh.field_i = param1;
        i.field_a = param6;
        kk.field_o = param8;
        t.field_a = param0;
        ug.field_f = param4;
        vi.field_d = param3;
        bl.field_d = param2;
        if (param7 <= 59) {
          field_c = 117;
          pk.field_g = param5;
          return;
        } else {
          pk.field_g = param5;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Nuke";
        field_a = "NEW ACHIEVEMENT";
    }
}
