/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static int[] field_b;
    static String field_a;

    final static String a(byte param0) {
        if (param0 != 120) {
            Object var2 = null;
            sj.a((byte) 105, 20, 6, -92, 0.43005454540252686f, 0.0913710817694664f, (byte[]) null, 0.566550612449646f, 1.7519813776016235f, (jg) null, 105, 0.6303681135177612f, -47, 32);
        }
        return "Hi!";
    }

    public static void a(boolean param0) {
        if (!param0) {
            sj.a(false);
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, float param4, float param5, byte[] param6, float param7, float param8, jg param9, int param10, float param11, int param12, int param13) {
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = TombRacer.field_G ? 1 : 0;
        int var14 = param2 * param3;
        float[] var24 = new float[var14];
        for (var16 = 0; var16 < param10; var16++) {
            var17 = param12;
            param9.a(param4 * 127.0f, param11 / (float)param1, param8 / (float)param2, param1, var24, param5 / (float)param3, 1, 0, param3, param13, param2);
            param8 = param8 * 2.0f;
            for (var18 = 0; var18 < var14; var18++) {
                param6[var17] = (byte)(int)((float)param6[var17] + var24[var18]);
                var17++;
            }
            param4 = param4 * param7;
            param11 = param11 * 2.0f;
            param5 = param5 * 2.0f;
        }
        if (param0 != 79) {
            field_b = null;
        }
        int var20 = param12;
        var16 = var20;
        for (var17 = 0; var14 > var17; var17++) {
            param6[var20] = (byte)(param6[var20] + 127);
            var20++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "(1 player wants to join)";
    }
}
