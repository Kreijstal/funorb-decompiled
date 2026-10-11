/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends s {
    int field_K;
    int field_J;
    int field_L;
    int field_G;
    int field_I;
    int field_H;

    final static void j(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        wd var4_ref_wd = null;
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
        wd var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 < 76) {
            return;
          }
          ve.field_V = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = tc.field_a.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_wd = tc.field_a[var3];
            var4_ref_wd.a(2);
            pf.a((byte) 123, var3);
            var5 = var4_ref_wd.field_P + var4_ref_wd.field_d >> 1;
            var6 = var4_ref_wd.field_F + var4_ref_wd.field_J >> 1;
            var7 = var4_ref_wd.field_z + var4_ref_wd.field_v >> 1;
            var8 = ve.field_V[9] >> 2;
            var9 = ve.field_V[10] >> 2;
            var10_int = ve.field_V[11] >> 2;
            var11 = var10_int * kg.field_i[5] + kg.field_i[4] * var9 + var8 * kg.field_i[3] >> 14;
            var12 = var10_int * kg.field_i[8] + var9 * kg.field_i[7] + var8 * kg.field_i[6] >> 14;
            var13 = var8 * kg.field_i[9] - (-(kg.field_i[10] * var9) - kg.field_i[11] * var10_int) >> 14;
            var2[var3] = var13 * var7 + var12 * var6 + var11 * var5 >> 16;
          }
          var3Lifetime1 = ve.field_V[9] >> 8;
          var4 = ve.field_V[10] >> 8;
          var5Lifetime1 = ve.field_V[11] >> 8;
          var6Lifetime1 = ji.field_b << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = lm.a(var6Lifetime1, (byte) -118) >> 8;
          var9Lifetime1 = mf.a(var6Lifetime1, -126) >> 8;
          if (-1 != ua.field_a &&
            -1 != vl.field_d) {
            var7Lifetime1 = -320 + ua.field_a;
            var9Lifetime1 = -128;
            var8Lifetime1 = -vl.field_d + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 - (-(var13Lifetime1 * var13Lifetime1) - var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; tc.field_a.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; tc.field_a.length > var17_int; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = tc.field_a[var16];
            pf.a((byte) 114, var16);
            for (var18 = 0; 3 > var18; var18++) {
              kg.field_i[var18] = kg.field_i[var18] + ne.field_a[var15][var18];
            }
            bg.a(kg.field_i, var17, 90, true, false, false, ve.field_V);
            ta.a(var8Lifetime1, var17, var12Lifetime1, var9Lifetime1, var14, var13Lifetime1, var7Lifetime1, (byte) 23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "bj.K(" + param0 + ')');
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        pj var13 = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!super.a((byte) -122, param1, param2, param3, param4, param5, param6)) {
            if (param0 <= -115) {
              return false;
            }
            var13 = (pj) null;
            this.a((byte) 126, (pj) null, -115, 38, 73, 82, 38);
            return false;
          }
          var8_int = -this.field_s + (-param3 - (this.field_H - param5));
          var9 = -this.field_K - (this.field_n + param6) + param4;
          if (var9 * var9 + var8_int * var8_int < this.field_G * this.field_G) {
            var10 = Math.atan2((double)var9, (double)var8_int) - kd.field_h;
            if (!(var10 < 0.0)) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_I;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_I;
            }
            this.field_J = (int)((double)this.field_I * var10 / 6.283185307179586);
            while (this.field_I <= this.field_J) {
              this.field_J = this.field_J - this.field_I;
            }
            while (this.field_J < 0) {
              this.field_J = this.field_J + this.field_I;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("bj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
