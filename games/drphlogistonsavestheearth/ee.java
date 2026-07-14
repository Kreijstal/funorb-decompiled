/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static nh[] field_c;
    static int field_a;
    static volatile int field_d;
    static he[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1) {
            field_a = 65;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, nh param8) {
        int var9 = param7 + (param8.field_D + param3) + -param5;
        int var10 = param7 + (param8.field_D + param3 - -param6);
        int var11 = param8.field_v - (-param2 + -(param8.field_w >> 1178139841));
        wj.d(var9, 0, var10, var11 - -param1);
        param8.a(param3 - 1, param2 - 1, param0);
        param8.a(-1 + param3, param2 + 1, param0);
        wj.a(ha.field_d);
        wj.d(var9 + 1, 0, var10 - -1, var11 - -param1);
        param8.a(1 + param3, -1 + param2, param0);
        param8.a(param3 + 1, 1 + param2, param0);
        int var12 = 93 / ((31 - param4) / 59);
        wj.a(ha.field_d);
        var9 = -param7 + param3 + (param8.field_D + param8.field_y) + -param6;
        var10 = param8.field_D - -param8.field_y - -param3 - (param7 - -param5);
        wj.d(var9, -param1 + var11, var10, 480);
        param8.a(-1 + param3, param2 + -1, param0);
        param8.a(param3 - 1, 1 + param2, param0);
        wj.a(ha.field_d);
        wj.d(1 + var9, -param1 + var11, 1 + var10, 480);
        param8.a(1 + param3, -1 + param2, param0);
        param8.a(param3 + 1, 1 + param2, param0);
        wj.a(ha.field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
