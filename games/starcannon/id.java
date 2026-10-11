/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends ne {
    int[] field_m;
    byte[] field_n;

    final void c(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_g;
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * ki.field_j;
        int var4 = 0;
        int var5 = this.field_b;
        int var6 = this.field_h;
        int var7 = ki.field_j - var6;
        int var8 = 0;
        if (param1 < ki.field_e) {
          var9 = ki.field_e - param1;
          var5 = var5 - var9;
          param1 = ki.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * ki.field_j;
        }
        if (param1 + var5 > ki.field_i) {
          var5 = var5 - (param1 + var5 - ki.field_i);
        }
        if (param0 < ki.field_l) {
          var9Lifetime1 = ki.field_l - param0;
          var6 = var6 - var9Lifetime1;
          param0 = ki.field_l;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > ki.field_g) {
          var9Lifetime2 = param0 + var6 - ki.field_g;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        id.b(ki.field_a, this.field_n, this.field_m, 0, var4, var3, var6, var5, var7, var8);
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_g;
        param1 = param1 + this.field_f;
        int var4 = param0 + param1 * ki.field_j;
        int var5 = 0;
        int var6 = this.field_b;
        int var7 = this.field_h;
        int var8 = ki.field_j - var7;
        int var9 = 0;
        if (param1 < ki.field_e) {
          var10 = ki.field_e - param1;
          var6 = var6 - var10;
          param1 = ki.field_e;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * ki.field_j;
        }
        if (param1 + var6 > ki.field_i) {
          var6 = var6 - (param1 + var6 - ki.field_i);
        }
        if (param0 < ki.field_l) {
          var10Lifetime1 = ki.field_l - param0;
          var7 = var7 - var10Lifetime1;
          param0 = ki.field_l;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > ki.field_g) {
          var10Lifetime2 = param0 + var7 - ki.field_g;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        id.a(ki.field_a, this.field_n, this.field_m, var5, var4, var7, var6, var8, var9, param2);
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var13;
        int var14;
        var10 = 256 - param9;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            var13 = param1[param3++];
            if (var13 == 0) {
              param4++;
            } else {
              var13 = param2[var13 & 255];
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    id(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_k = param0;
        this.field_e = param1;
        this.field_g = param2;
        this.field_f = param3;
        this.field_h = param4;
        this.field_b = param5;
        this.field_n = param6;
        this.field_m = param7;
    }

    id(int param0, int param1, int param2) {
        this.field_h = param0;
        this.field_k = param0;
        this.field_b = param1;
        this.field_e = param1;
        this.field_f = 0;
        this.field_g = 0;
        this.field_n = new byte[param0 * param1];
        this.field_m = new int[param2];
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$3 = param5;
              param5++;
              param0[incrementValue$3] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$5 = param5;
              param5++;
              param0[incrementValue$5] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$7 = param5;
              param5++;
              param0[incrementValue$7] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$9 = param5;
              param5++;
              param0[incrementValue$9] = param2[param3 & 255];
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$1 = param5;
              param5++;
              param0[incrementValue$1] = param2[param3 & 255];
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }
}
