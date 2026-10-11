/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq {
    final static void a(jp param0, int param1, int param2) {
        int var10 = 0;
        param1 = param1 + param0.field_E;
        param2 = param2 + param0.field_F;
        int var3 = param1 + param2 * lb.field_c;
        int var4 = param0.field_C;
        int var5 = param0.field_C;
        int var6 = param0.field_D;
        int var7 = 0;
        int var8 = -var6;
        int var9 = 0;
        if (param2 < lb.field_b) {
          var10 = lb.field_b - param2;
          param2 = lb.field_b;
          if (var10 < var5) {
            var4 = param0.field_G[var10];
          }
          var5 = var5 - var10;
          var3 = var3 + var10 * lb.field_c;
        }
        if (param2 + var5 > lb.field_j) {
          var5 = var5 - (param2 + var5 - lb.field_j);
        }
        if (param1 < lb.field_i) {
          var8 = var8 + (lb.field_i - param1);
        }
        if (param1 + var6 > lb.field_f) {
          var9 = var9 - (param1 + var6 - lb.field_f);
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          uq.a(lb.field_l, param0.field_G, var4, var3, var7, var8, var9, var6, var5);
          return;
        }
    }

    private final static void a(jp param0) {
        int var2 = 0;
        int var4 = 0;
        int incrementValue$6 = 0;
        int var1;
        int var3;
        int var5;
        var1 = param0.field_D * param0.field_C - 1;
        for (var2 = param0.field_C - 1; var2 >= 0; var2--) {
          var3 = 0;
          for (var4 = param0.field_D - 1; var4 >= 0; var4--) {
            var5 = param0.field_G[var1];
            if (var5 != 0) {
              var3 = 0;
            } else {
              incrementValue$6 = var3;
              var3++;
              param0.field_G[var1] = -incrementValue$6;
            }
            var1--;
          }
        }
    }

    final static void b(jp param0) {
        int var3_int = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int var1;
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int var2Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        uq.a(param0);
        var1 = 0;
        var2 = 0;
        for (var3_int = 0; var3_int < param0.field_C; var3_int++) {
          var4 = 0;
          while (var4 < param0.field_D) {
            incrementValue$2 = var2;
            var2++;
            var5 = param0.field_G[incrementValue$2];
            if (var5 < 0) {
              var2 = var2 - var5;
              var4 = var4 - var5;
            }
            var1++;
            var4++;
          }
        }
        var9 = new int[param0.field_C + var1];
        var8 = var9;
        var3 = var8;
        var2Lifetime1 = 0;
        var4Lifetime1 = param0.field_C;
        for (var5Lifetime1 = 0; var5Lifetime1 < param0.field_C; var5Lifetime1++) {
          var9[var5Lifetime1] = var4Lifetime1;
          var6 = 0;
          while (var6 < param0.field_D) {
            incrementValue$0 = var2Lifetime1;
            var2Lifetime1++;
            var7 = param0.field_G[incrementValue$0];
            if (var7 < 0) {
              var2Lifetime1 = var2Lifetime1 - var7;
              var6 = var6 - var7;
            }
            var3[var4Lifetime1++] = var7;
            var6++;
          }
        }
        param0.field_G = var3;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        param3 = param3 + param7;
        var9 = 0;
        for (var10 = -param8; var10 < 0; var10++) {
          var9 = var9 - param7;
          while (var9 < param5) {
            param4 = param1[param2++];
            if (param4 <= 0) {
              var9 = var9 - param4;
            }
            var9++;
          }
          while (var9 < param6) {
            param4 = param1[param2++];
            if (param4 > 0) {
              param0[param3 + var9] = param4;
            } else {
              var9 = var9 - param4;
            }
            var9++;
          }
          param3 = param3 + lb.field_c;
        }
    }
}
