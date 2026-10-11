/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pw {
    static int field_a;
    private static String field_z;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(byte param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        wma var4_ref_wma = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        wma var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        wma var17Lifetime1;
        wma var17Lifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = VoidHunters.field_G;
        try {
          uib.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = eha.field_o.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_wma = eha.field_o[var3];
            var17 = var4_ref_wma;
            var17Lifetime2 = var4_ref_wma;
            var4_ref_wma.a(84);
            rv.a(-37, var3);
            var5 = var4_ref_wma.field_B + var4_ref_wma.field_d >> 1;
            var6 = var4_ref_wma.field_u + var4_ref_wma.field_a >> 1;
            var7 = var4_ref_wma.field_s + var4_ref_wma.field_q >> 1;
            var8 = uib.field_p[9] >> 2;
            var9 = uib.field_p[10] >> 2;
            var10_int = uib.field_p[11] >> 2;
            var11 = var9 * eob.field_p[4] + (var8 * eob.field_p[3] + eob.field_p[5] * var10_int) >> 14;
            var12 = var9 * eob.field_p[7] + eob.field_p[6] * var8 + var10_int * eob.field_p[8] >> 14;
            var13 = eob.field_p[11] * var10_int + var9 * eob.field_p[10] + eob.field_p[9] * var8 >> 14;
            var2[var3] = var13 * var7 + var5 * var11 + var6 * var12 >> 16;
          }
          if (param0 != 74) {
            pw.a((byte) 57);
          }
          var3Lifetime1 = uib.field_p[9] >> 8;
          var4 = uib.field_p[10] >> 8;
          var5Lifetime1 = uib.field_p[11] >> 8;
          var6Lifetime1 = nd.field_r << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = eu.a(var6Lifetime1, 57) >> 8;
          var9Lifetime1 = fc.a(var6Lifetime1, (byte) 61) >> 8;
          if (kc.field_b != -1 &&
            uia.field_b != -1) {
            var8Lifetime1 = 240 - uia.field_b;
            var9Lifetime1 = -128;
            var7Lifetime1 = kc.field_b - 320;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < eha.field_o.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < eha.field_o.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17Lifetime1 = eha.field_o[var16];
            rv.a(param0 ^ -34, var16);
            for (var18 = 0; var18 < 3; var18++) {
              eob.field_p[var18] = eob.field_p[var18] + raa.field_p[var15][var18];
            }
            wl.a(var17Lifetime1, eob.field_p, false, true, false, uib.field_p, false);
            kt.a(var17Lifetime1, var13Lifetime1, var12Lifetime1, -119, var14, var8Lifetime1, var9Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), field_z + param0 + ')');
        }
    }

    static {
        field_z = "pw.B(";
    }
}
