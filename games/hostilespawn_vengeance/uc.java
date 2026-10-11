/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static bd field_a;
    static String field_d;
    static volatile long field_c;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 212563556) {
          field_b = 42;
        }
        field_d = null;
    }

    final static void b(int param0) {
        int var16 = 0;
        int var18_int = 0;
        int var19 = 0;
        int var1_int = 0;
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        pf var5_ref_pf = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        double var11 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        pf var18 = null;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        double var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var20 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1_int = 0 / ((62 - param0) / 57);
          cb.field_d = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var2 = wj.field_J.length;
          var22 = new int[var2];
          var21 = var22;
          var3 = var21;
          for (var4 = 0; var4 < var2; var4++) {
            var5_ref_pf = wj.field_J[var4];
            var5_ref_pf.c(-103);
            wg.c(var4, -5878);
            var6 = var5_ref_pf.field_J + var5_ref_pf.field_d >> 1;
            var7 = var5_ref_pf.field_C + var5_ref_pf.field_a >> 1;
            var8 = var5_ref_pf.field_D + var5_ref_pf.field_t >> 1;
            var9 = cb.field_d[9] >> 2;
            var10 = cb.field_d[10] >> 2;
            var11_int = cb.field_d[11] >> 2;
            var12 = var9 * vg.field_a[3] - (-(var10 * vg.field_a[4]) - vg.field_a[5] * var11_int) >> 14;
            var13 = vg.field_a[6] * var9 + vg.field_a[7] * var10 + vg.field_a[8] * var11_int >> 14;
            var14 = vg.field_a[9] * var9 + (var10 * vg.field_a[10] + var11_int * vg.field_a[11]) >> 14;
            var3[var4] = var14 * var8 + (var13 * var7 + var12 * var6) >> 16;
          }
          var4Lifetime1 = cb.field_d[9] >> 8;
          var5 = cb.field_d[10] >> 8;
          var6Lifetime1 = cb.field_d[11] >> 8;
          var7Lifetime1 = tk.field_e << 4;
          var8Lifetime1 = 0;
          var9Lifetime1 = ni.a(var7Lifetime1, 8191) >> 8;
          var10Lifetime1 = of.a((byte) -121, var7Lifetime1) >> 8;
          if (-1 != j.field_c &&
            rb.field_m != -1) {
            var9Lifetime1 = -rb.field_m + 240;
            var10Lifetime1 = -128;
            var8Lifetime1 = j.field_c - 320;
          }
          var11 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1 + var10Lifetime1 * var10Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var11);
          var10Lifetime1 = (int)((double)var10Lifetime1 * var11);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var11);
          var13Lifetime1 = -var4Lifetime1 + var8Lifetime1;
          var14Lifetime1 = var9Lifetime1 - var5;
          var15 = var10Lifetime1 - var6Lifetime1;
          var11Lifetime1 = 256.0 / Math.sqrt((double)(var15 * var15 + (var14Lifetime1 * var14Lifetime1 + var13Lifetime1 * var13Lifetime1)));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var11Lifetime1);
          var14Lifetime1 = (int)((double)var14Lifetime1 * var11Lifetime1);
          var15 = (int)((double)var15 * var11Lifetime1);
          for (var16 = 0; wj.field_J.length > var16; var16++) {
            var17 = 0;
            for (var18_int = 1; wj.field_J.length > var18_int; var18_int++) {
              if (var22[var18_int] > var22[var17]) {
                var17 = var18_int;
              }
            }
            var22[var17] = -2147483648;
            var18 = wj.field_J[var17];
            wg.c(var17, -5878);
            for (var19 = 0; 3 > var19; var19++) {
              vg.field_a[var19] = vg.field_a[var19] + of.field_f[var16][var19];
            }
            el.a(vg.field_a, cb.field_d, -12705, true, var18, false, false);
            di.a(var10Lifetime1, var9Lifetime1, var18, var13Lifetime1, -536936193, var8Lifetime1, var14Lifetime1, var15);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "uc.B(" + param0 + ')');
        }
    }

    static {
        field_c = 0L;
        field_b = 0;
    }
}
