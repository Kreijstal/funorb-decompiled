/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    int field_d;
    static bk field_e;
    static int field_c;
    int field_a;
    static int field_b;

    public static void a(boolean param0) {
        if (param0) {
          field_b = -77;
        }
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        mg var4_ref_mg = null;
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
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        mg var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Main.field_T;
        try {
          rh.field_h = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = il.field_a.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_mg = il.field_a[var3];
            var4_ref_mg.a((byte) 116);
            kj.a((byte) 104, var3);
            var5 = var4_ref_mg.field_f + var4_ref_mg.field_e >> 1;
            var6 = var4_ref_mg.field_s + var4_ref_mg.field_u >> 1;
            var7 = var4_ref_mg.field_z + var4_ref_mg.field_i >> 1;
            var8 = rh.field_h[9] >> 2;
            var9 = rh.field_h[10] >> 2;
            var10_int = rh.field_h[11] >> 2;
            var11 = var10_int * nl.field_c[5] + (var9 * nl.field_c[4] + nl.field_c[3] * var8) >> 14;
            var12 = nl.field_c[8] * var10_int + (nl.field_c[6] * var8 + nl.field_c[7] * var9) >> 14;
            var13 = nl.field_c[9] * var8 + var9 * nl.field_c[10] + var10_int * nl.field_c[11] >> 14;
            var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 16;
          }
          var3Lifetime1 = rh.field_h[9] >> 8;
          var4 = rh.field_h[10] >> 8;
          var5Lifetime1 = rh.field_h[11] >> 8;
          var6Lifetime1 = h.field_F << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = ph.a(-35, var6Lifetime1) >> 8;
          var9Lifetime1 = kh.a(95, var6Lifetime1) >> 8;
          if (eg.field_b != -1 &&
            ij.field_e != -1) {
            var8Lifetime1 = 240 - ij.field_e;
            var9Lifetime1 = -128;
            var7Lifetime1 = eg.field_b - 320;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 - (-(var8Lifetime1 * var8Lifetime1) - var9Lifetime1 * var9Lifetime1)));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          if (param0 < 17) {
            de.a(93);
          }
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; il.field_a.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < il.field_a.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = il.field_a[var16];
            kj.a((byte) 104, var16);
            for (var18 = 0; var18 < 3; var18++) {
              nl.field_c[var18] = nl.field_c[var18] + sk.field_b[var15][var18];
            }
            me.a(false, false, nl.field_c, true, var17, rh.field_h, false);
            fj.a(-102, var8Lifetime1, var12Lifetime1, var14, var9Lifetime1, var7Lifetime1, var17, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "de.C(" + param0 + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 565192680) {
          de.b(-60);
        }
        return ok.field_c;
    }

    de(int param0, int param1, int param2, int param3) {
        this.field_d = param3;
        this.field_a = param0;
    }

    static {
        field_e = new bk();
    }
}
