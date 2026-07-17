/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk implements rs {
    static float[] field_b;
    static int field_a;

    public static void a() {
        field_b = null;
    }

    final static void a(float param0, float param1, int param2, int param3, float param4, int param5, float param6, float param7) {
        float var8 = param4 - param7;
        float var9 = -param1 + param6;
        float var10 = -var9;
        float var11 = var8;
        float var12 = (float)Math.sqrt((double)(var11 * var11 + var10 * var10));
        var11 = param0 * -var11 / var12;
        var10 = -var10 * param0 / var12;
        int var13 = (int)(var10 + param7);
        int var14 = (int)(var11 + param1);
        int var15 = (int)param7;
        int var16 = (int)param1;
        int var17 = (int)(-var10 + param7);
        int var18 = (int)(param1 - var11);
        int var19 = (int)(param4 + var10);
        int var20 = (int)(param6 + var11);
        int var21 = (int)param4;
        int var22 = (int)param6;
        int var23 = (int)(param4 - var10);
        int var24 = (int)(param6 - var11);
        int var25 = param2 | -16777216;
        hcb.a(8, var22, 1, var25, var13, var21, var16, var14, param2, var15, var25);
        hcb.a(8, var20, 1, var25, var13, var19, var22, var14, param2, var21, param2);
        hcb.a(8, var24, 1, param2, var15, var23, var18, var16, var25, var17, param2);
        hcb.a(8, var22, 1, param2, var15, var21, var24, var16, var25, var23, var25);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new float[4];
        npa discarded$0 = new npa();
        field_a = 20;
    }
}
