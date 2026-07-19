/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static int[] field_a;
    static int[] field_c;
    static int[] field_b;

    final static void a(int[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var5 = param3[0];
        int var6 = param4[0];
        int var7 = param3[1];
        int var8 = param4[1];
        int var9 = param3[2];
        int var10 = param4[2];
        int var11 = var7 * var10 - var9 * var8 + 2048 >> 12;
        int var12 = var8 * 4096 - var10 * 4096 + 2048 >> 12;
        int var13 = 4096 * var9 - 4096 * var7 + 2048 >> 12;
        int var14 = var9 * var6 - var5 * var10 + 2048 >> 12;
        int var15 = var10 * 4096 - var6 * 4096 + 2048 >> 12;
        int var16 = 4096 * var5 - 4096 * var9 + 2048 >> 12;
        int var17 = var5 * var8 - var7 * var6 + 2048 >> 12;
        int var18 = var6 * 4096 - var8 * 4096 + 2048 >> 12;
        int var19 = 4096 * var7 - 4096 * var5 + 2048 >> 12;
        int var20 = 16777216 / (4096 * var11 + var5 * var12 + var6 * var13 + 2048 >> 12);
        var11 = var11 * var20 + 2048 >> 12;
        var14 = var14 * var20 + 2048 >> 12;
        var17 = var17 * var20 + 2048 >> 12;
        var12 = var12 * var20 + 2048 >> 12;
        var15 = var15 * var20 + 2048 >> 12;
        var18 = var18 * var20 + 2048 >> 12;
        var13 = var13 * var20 + 2048 >> 12;
        var16 = var16 * var20 + 2048 >> 12;
        var19 = var19 * var20 + 2048 >> 12;
        int var21 = param0[0];
        int var22 = param1[0];
        int var23 = param2[0];
        int var24 = param0[1];
        int var25 = param1[1];
        int var26 = param2[1];
        int var27 = param0[2];
        int var28 = param1[2];
        int var29 = param2[2];
        var20 = var21 * var11 + var24 * var14 + var27 * var17;
        field_b[0] = var21 * var11 + var24 * var14 + var27 * var17 + 2048 >> 12;
        field_b[1] = var20 + var21 * var12 + var24 * var15 + var27 * var18 + 2048 >> 12;
        field_b[2] = var20 + var21 * var13 + var24 * var16 + var27 * var19 + 2048 >> 12;
        var20 = var22 * var11 + var25 * var14 + var28 * var17;
        field_c[0] = var22 * var11 + var25 * var14 + var28 * var17 + 2048 >> 12;
        field_c[1] = var20 + var22 * var12 + var25 * var15 + var28 * var18 + 2048 >> 12;
        field_c[2] = var20 + var22 * var13 + var25 * var16 + var28 * var19 + 2048 >> 12;
        var20 = var23 * var11 + var26 * var14 + var29 * var17;
        field_a[0] = var23 * var11 + var26 * var14 + var29 * var17 + 2048 >> 12;
        field_a[1] = var20 + var23 * var12 + var26 * var15 + var29 * var18 + 2048 >> 12;
        field_a[2] = var20 + var23 * var13 + var26 * var16 + var29 * var19 + 2048 >> 12;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_a = new int[3];
        field_b = new int[3];
        field_c = new int[3];
    }
}
