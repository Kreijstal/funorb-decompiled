/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends gg {
    static String field_k;
    ja field_p;
    int field_o;
    int field_l;
    int field_n;
    int field_r;
    static int field_t;
    int field_s;
    static jb field_m;
    static int field_q;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int var22 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        pb var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        var31 = stellarshard.field_B;
        try {
          if (param4) {
            return;
          }
          var8_int = -param2 - param1 + param0;
          var9 = -param1 + param3 - param2;
          var10 = param2 + param1 + param0;
          if (var10 > ti.field_c) {
            var10 = ti.field_c;
          }
          var11 = param2 + (param3 + param1);
          if (var8_int < ti.field_e) {
            var8_int = ti.field_e;
          }
          if (ti.field_f > var9) {
            var9 = ti.field_f;
          }
          if (var11 > ti.field_l) {
            var11 = ti.field_l;
          }
          var33 = new int[32];
          var32 = var33;
          var12 = var32;
          var13 = param7 & 16711935;
          var14 = 65280 & param7;
          for (var15 = 0; var15 < 16; var15++) {
            var16 = param6 * var15 >> 4;
            var12[var15] = vf.b(sa.a(16711680, var16 * var14), sa.a(-16711936, var16 * var13)) >>> 8;
            var12[31 - var15] = vf.b(sa.a(var14 * var16, 16711680), sa.a(var16 * var13, -16711936)) >>> 8;
          }
          var15Lifetime1 = -var8_int + var10;
          var16Lifetime1 = var11 - var9;
          if (0 < var15Lifetime1 &&
            var16Lifetime1 > 0) {
            var17 = new pb(var15Lifetime1, var16Lifetime1);
            var18 = param1 * param1;
            var19 = (param1 + param2) * (param1 + param2);
            var20 = 0;
            var21 = var9 - param3;
            for (var22 = 0; var22 < var16Lifetime1; var22++) {
              var23 = var8_int - param0;
              var24 = var23 * var23 + var21 * var21;
              var25 = 0;
              while (var25 < var15Lifetime1) {
                var26 = var22 + var9;
                var27 = var25 + var8_int;
                if (var24 != 0) {
                  if (var24 >= var18) {
                    if (var24 >= var19) {
                      var17.field_z[var20] = ti.field_a[var26 * ti.field_i + var27];
                      var20++;
                      var25++;
                      var23++;
                      var24 = var24 + (var23 * 2 - 1);
                      continue;
                    }
                    var28 = ma.a((byte) -124, var24 << 12);
                    var29 = var28 - (param1 << 6);
                    var30 = -(param5 * (65536 - lc.a((var29 << 7) / param2, false)) >> 11) + var28;
                    var27 = param0 + var23 * var30 / var28;
                    var26 = param3 + var21 * var30 / var28;
                    if (var26 < ti.field_f) {
                      var26 = ti.field_f;
                    }
                    if (ti.field_e > var27) {
                      var27 = ti.field_e;
                    }
                    if (var26 >= ti.field_l) {
                      var26 = ti.field_l;
                    }
                    if (var27 >= ti.field_c) {
                      var27 = ti.field_c;
                    }
                  } else {
                    var28 = ma.a((byte) -118, var24 << 12);
                    var29 = -var28 + (param1 << 6);
                    var30 = var28 - ((-lc.a((var29 << 7) / param1, param4) + 65536) * param5 >> 11);
                    var26 = param3 + var30 * var21 / var28;
                    var27 = param0 + var30 * var23 / var28;
                    if (var26 < ti.field_f) {
                      var26 = ti.field_f;
                    }
                    if (var27 < ti.field_e) {
                      var27 = ti.field_e;
                    }
                    if (ti.field_l <= var26) {
                      var26 = ti.field_l;
                    }
                    if (ti.field_c <= var27) {
                      var27 = ti.field_c;
                    }
                  }
                }
                var17.field_z[var20] = ti.field_a[var26 * ti.field_i + var27];
                var20++;
                var25++;
                var23++;
                var24 = var24 + (var23 * 2 - 1);
              }
              var21++;
            }
            var17.d(var8_int, var9);
            ti.b(param0 << 4, param3 << 4, param1 + param2 << 4, 255, var33);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var8), "ja.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(byte param0) {
        field_m = null;
        int var1 = -119 % ((-61 - param0) / 60);
        field_k = null;
    }

    final static void a(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        n var4_ref_n = null;
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
        n var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = stellarshard.field_B;
        try {
          sl.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = sj.field_B.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_n = sj.field_B[var3];
            var4_ref_n.b((byte) -53);
            kb.a(var3, -128);
            var5 = var4_ref_n.field_t + var4_ref_n.field_F >> 1;
            var6 = var4_ref_n.field_x + var4_ref_n.field_G >> 1;
            var7 = var4_ref_n.field_u + var4_ref_n.field_k >> 1;
            var8 = sl.field_a[9] >> 2;
            var9 = sl.field_a[10] >> 2;
            var10_int = sl.field_a[11] >> 2;
            var11 = pd.field_u[5] * var10_int + var8 * pd.field_u[3] + pd.field_u[4] * var9 >> 14;
            var12 = pd.field_u[8] * var10_int + (var8 * pd.field_u[6] + var9 * pd.field_u[7]) >> 14;
            var13 = var8 * pd.field_u[9] + (pd.field_u[10] * var9 + pd.field_u[11] * var10_int) >> 14;
            var2[var3] = var12 * var6 + (var11 * var5 + var13 * var7) >> 16;
          }
          var3Lifetime1 = sl.field_a[9] >> 8;
          var4 = sl.field_a[10] >> 8;
          var5Lifetime1 = sl.field_a[11] >> 8;
          var6Lifetime1 = ni.field_d << 4;
          if (param0 != 4) {
            return;
          }
          var7Lifetime1 = 0;
          var8Lifetime1 = hd.a(var6Lifetime1, 99) >> 8;
          var9Lifetime1 = lc.a(var6Lifetime1, false) >> 8;
          if (-1 != ni.field_e &&
            -1 != eb.field_a) {
            var8Lifetime1 = -eb.field_a + 240;
            var9Lifetime1 = -128;
            var7Lifetime1 = -320 + ni.field_e;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1)));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; var15 < sj.field_B.length; var15++) {
            var16 = 0;
            for (var17_int = 1; sj.field_B.length > var17_int; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = sj.field_B[var16];
            kb.a(var16, param0 ^ 116);
            for (var18 = 0; var18 < 3; var18++) {
              pd.field_u[var18] = pd.field_u[var18] + bi.field_s[var15][var18];
            }
            vi.a(var17, (byte) -116, pd.field_u, true, false, sl.field_a, false);
            kf.a(-62, var8Lifetime1, var13Lifetime1, var7Lifetime1, var12Lifetime1, var14, var17, var9Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ja.A(" + param0 + ')');
        }
    }

    ja(int param0, int param1, int param2, int param3, int param4) {
        this.field_l = param0;
        this.field_s = param1;
        this.field_o = param4;
        this.field_r = param2;
        this.field_n = param3;
    }

    static {
        field_k = "Lightning gun";
        field_t = -1;
        field_m = null;
        field_q = 0;
    }
}
