/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static long[] field_c;
    static int[] field_b;
    static boolean field_a;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != 99) {
          field_b = (int[]) null;
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (nm.e((byte) -96)) {
            ij.field_q.c(-1);
            if (ij.field_q.d((byte) 55)) {
              var1_int = 1;
            }
            if (13 != gk.field_r) {
              continue;
            }
            var2 = 1;
          }
          ij.field_q.a(true, ab.a(0, wm.field_hb, m.field_a), ab.a(param0 ^ param0, ld.field_l, jh.field_R));
          if (ij.field_q.d((byte) 55)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            0 <= ij.field_q.field_i) {
            var3 = uc.field_ab[ij.field_q.field_i];
            if (2 == var3 ||
              var3 == 5) {
              jg.b(15229);
            }
          } else {
            if (var2 != 0 &&
              2 != ea.field_a) {
              jg.b(15229);
            }
          }
          if (var3 == 0 &&
            2 == ea.field_a) {
            var4 = ri.a(-3) - ga.field_M;
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              q.a(5, true, (byte) -98);
            }
          }
          stackIn_26_0 = var3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "of.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        rm var4_ref_rm = null;
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
        rm var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        rm var17Lifetime1;
        rm var17Lifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Confined.field_J ? 1 : 0;
        try {
          qj.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = Confined.field_K.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_rm = Confined.field_K[var3];
            var17 = var4_ref_rm;
            var17Lifetime2 = var4_ref_rm;
            var4_ref_rm.b(27915);
            jk.a(var3, 91);
            var5 = var4_ref_rm.field_I + var4_ref_rm.field_O >> 1;
            var6 = var4_ref_rm.field_L + var4_ref_rm.field_e >> 1;
            var7 = var4_ref_rm.field_t + var4_ref_rm.field_s >> 1;
            var8 = qj.field_c[9] >> 2;
            var9 = qj.field_c[10] >> 2;
            var10_int = qj.field_c[11] >> 2;
            var11 = var9 * gd.field_m[4] + (gd.field_m[3] * var8 + gd.field_m[5] * var10_int) >> 14;
            var12 = gd.field_m[8] * var10_int + (gd.field_m[6] * var8 + gd.field_m[7] * var9) >> 14;
            var13 = var10_int * gd.field_m[11] + (gd.field_m[9] * var8 + var9 * gd.field_m[10]) >> 14;
            var2[var3] = var7 * var13 + var11 * var5 + var6 * var12 >> 16;
          }
          if (param0) {
            field_c = (long[]) null;
          }
          var3Lifetime1 = qj.field_c[9] >> 8;
          var4 = qj.field_c[10] >> 8;
          var5Lifetime1 = qj.field_c[11] >> 8;
          var6Lifetime1 = tg.field_H << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = vh.a(21872, var6Lifetime1) >> 8;
          var9Lifetime1 = si.a(var6Lifetime1, -125) >> 8;
          if (ld.field_l != -1 &&
            -1 != jh.field_R) {
            var7Lifetime1 = ld.field_l - 320;
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - jh.field_R;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 - (-(var13Lifetime1 * var13Lifetime1) - var14 * var14)));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < Confined.field_K.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < Confined.field_K.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17Lifetime1 = Confined.field_K[var16];
            jk.a(var16, -128);
            for (var18 = 0; 3 > var18; var18++) {
              gd.field_m[var18] = gd.field_m[var18] + in.field_b[var15][var18];
            }
            ck.a(qj.field_c, 109, false, gd.field_m, false, true, var17Lifetime1);
            wl.a(var8Lifetime1, 126, var14, var12Lifetime1, var9Lifetime1, var17Lifetime1, var7Lifetime1, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "of.C(" + param0 + ')');
        }
    }

    static {
        field_c = new long[32];
        field_a = false;
        field_b = new int[]{1, 2, 1, 2, 3, 3, 4};
    }
}
