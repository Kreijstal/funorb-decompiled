/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String field_b;
    static String[] field_a;

    final static void a(int param0, ai param1, int param2, float param3, float param4, float param5, float param6, int param7, int param8, byte[] param9, float param10, int param11, int param12, int param13) {
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var14 = param13 * param12;
        float[] var23 = new float[var14];
        for (var16 = 0; var16 < param2; var16++) {
            param1.a(param11, 127.0f * param10, param13, param5 / (float)param8, param8, -79, param3 / (float)param13, param6 / (float)param12, 0, var23, param12);
            var17 = param7;
            for (var18 = 0; var18 < var14; var18++) {
                param9[var17] = (byte)(int)((float)param9[var17] + var23[var18]);
                var17++;
            }
            param6 = param6 * 2.0f;
            param5 = param5 * 2.0f;
            param10 = param10 * param4;
            param3 = param3 * 2.0f;
        }
        int var19 = param7;
        var16 = var19;
        if (param0 != 2) {
            field_a = (String[]) null;
        }
        for (var17 = 0; var17 < var14; var17++) {
            param9[var19] = (byte)(127 + param9[var19]);
            var19++;
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 != -3) {
            field_b = (String) null;
        }
        return (param0 & 52 ^ -1) != -1 ? true : false;
    }

    public static void a(int param0) {
        if (param0 >= -77) {
            field_b = (String) null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
