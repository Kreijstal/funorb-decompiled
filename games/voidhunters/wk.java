/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk implements rs {
    static float[] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 80) {
            field_b = (float[]) null;
        }
    }

    final static void a(float param0, float param1, int param2, int param3, float param4, int param5, float param6, float param7) {
        float var8;
        float var9;
        float var10;
        float var11;
        float var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        var8 = param4 - param7;
        var9 = -param1 + param6;
        var10 = -var9;
        var11 = var8;
        if (param5 != -1520350600) {
          field_b = (float[]) null;
          var12 = (float)Math.sqrt((double)(var11 * var11 + var10 * var10));
          var11 = param0 * -var11 / var12;
          var10 = -var10 * param0 / var12;
          var13 = (int)(var10 + param7);
          var14 = (int)(var11 + param1);
          var15 = (int)param7;
          var16 = (int)param1;
          var17 = (int)(-var10 + param7);
          var18 = (int)(param1 - var11);
          var19 = (int)(param4 + var10);
          var20 = (int)(param6 + var11);
          var21 = (int)param4;
          var22 = (int)param6;
          var23 = (int)(param4 - var10);
          var24 = (int)(param6 - var11);
          var25 = param2 | param3 << -1520350600;
          hcb.a(8, var22, 1, var25, var13, var21, var16, var14, param2, var15, var25);
          hcb.a(8, var20, 1, var25, var13, var19, var22, var14, param2, var21, param2);
          hcb.a(8, var24, 1, param2, var15, var23, var18, var16, var25, var17, param2);
          hcb.a(param5 + 1520350608, var22, 1, param2, var15, var21, var24, var16, var25, var23, var25);
          return;
        } else {
          var12 = (float)Math.sqrt((double)(var11 * var11 + var10 * var10));
          var11 = param0 * -var11 / var12;
          var10 = -var10 * param0 / var12;
          var13 = (int)(var10 + param7);
          var14 = (int)(var11 + param1);
          var15 = (int)param7;
          var16 = (int)param1;
          var17 = (int)(-var10 + param7);
          var18 = (int)(param1 - var11);
          var19 = (int)(param4 + var10);
          var20 = (int)(param6 + var11);
          var21 = (int)param4;
          var22 = (int)param6;
          var23 = (int)(param4 - var10);
          var24 = (int)(param6 - var11);
          var25 = param2 | param3 << -1520350600;
          hcb.a(8, var22, 1, var25, var13, var21, var16, var14, param2, var15, var25);
          hcb.a(8, var20, 1, var25, var13, var19, var22, var14, param2, var21, param2);
          hcb.a(8, var24, 1, param2, var15, var23, var18, var16, var25, var17, param2);
          hcb.a(param5 + 1520350608, var22, 1, param2, var15, var21, var24, var16, var25, var23, var25);
          return;
        }
    }

    static {
        field_b = new float[4];
        npa discarded$0 = new npa();
        field_a = 20;
    }
}
