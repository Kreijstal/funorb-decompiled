/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends sb {
    byte[] field_m;
    int[] field_l;

    final void a() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        byte[] var1 = new byte[this.field_e * this.field_b];
        int var2 = 0;
        for (var3 = this.field_b - 1; var3 >= 0; var3--) {
          for (var4 = 0; var4 < this.field_e; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_m[var4 + var3 * this.field_e];
          }
        }
        this.field_m = var1;
        this.field_h = this.field_a - this.field_b - this.field_h;
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_h;
        int var4 = param0 + param1 * oo.field_b;
        int var5 = 0;
        int var6 = this.field_b;
        int var7 = this.field_e;
        int var8 = oo.field_b - var7;
        int var9 = 0;
        if (param1 < oo.field_e) {
          var10 = oo.field_e - param1;
          var6 = var6 - var10;
          param1 = oo.field_e;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * oo.field_b;
        }
        if (param1 + var6 > oo.field_d) {
          var6 = var6 - (param1 + var6 - oo.field_d);
        }
        if (param0 < oo.field_f) {
          var10Lifetime1 = oo.field_f - param0;
          var7 = var7 - var10Lifetime1;
          param0 = oo.field_f;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > oo.field_g) {
          var10Lifetime2 = param0 + var7 - oo.field_g;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ri.a(oo.field_i, this.field_m, this.field_l, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void c() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        byte[] var1 = new byte[this.field_e * this.field_b];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = 0; var3 < this.field_e; var3++) {
          for (var4 = this.field_b - 1; var4 >= 0; var4--) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_m[var3 + var4 * this.field_e];
          }
        }
        this.field_m = var1;
        var3Lifetime1 = this.field_h;
        this.field_h = this.field_j;
        this.field_j = this.field_a - this.field_b - var3Lifetime1;
        var3Lifetime2 = this.field_b;
        this.field_b = this.field_e;
        this.field_e = var3Lifetime2;
        var3Lifetime3 = this.field_a;
        this.field_a = this.field_f;
        this.field_f = var3Lifetime3;
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_h;
        int var3 = param0 + param1 * oo.field_b;
        int var4 = 0;
        int var5 = this.field_b;
        int var6 = this.field_e;
        int var7 = oo.field_b - var6;
        int var8 = 0;
        if (param1 < oo.field_e) {
          var9 = oo.field_e - param1;
          var5 = var5 - var9;
          param1 = oo.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * oo.field_b;
        }
        if (param1 + var5 > oo.field_d) {
          var5 = var5 - (param1 + var5 - oo.field_d);
        }
        if (param0 < oo.field_f) {
          var9Lifetime1 = oo.field_f - param0;
          var6 = var6 - var9Lifetime1;
          param0 = oo.field_f;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > oo.field_g) {
          var9Lifetime2 = param0 + var6 - oo.field_g;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ri.b(oo.field_i, this.field_m, this.field_l, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var15 = 0;
        int var16 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        int var14;
        int var13Lifetime1;
        int var14Lifetime1;
        var12 = 256 - param10;
        var13 = (param11 & 16711935) * var12 & -16711936;
        var14 = (param11 & 65280) * var12 & 16711680;
        param11 = (var13 | var14) >>> 8;
        for (var15 = -param7; var15 < 0; var15++) {
          for (var16 = -param6; var16 < 0; var16++) {
            incrementValue$11 = param4;
            param4++;
            param3 = param2[param1[incrementValue$11] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              var13Lifetime1 = (param3 & 16711935) * param10 & -16711936;
              var14Lifetime1 = (param3 & 65280) * param10 & 16711680;
              incrementValue$12 = param5;
              param5++;
              param0[incrementValue$12] = ((var13Lifetime1 | var14Lifetime1) >>> 8) + param11;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
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

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
          var14 = (param4 >> 16) * param11;
          for (var15 = -param7; var15 < 0; var15++) {
            var16 = param1[(param3 >> 16) + var14];
            if (var16 != 0) {
              incrementValue$1 = param5;
              param5++;
              param0[incrementValue$1] = param2[var16 & 255];
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var12;
          param5 = param5 + param6;
        }
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var13Lifetime1;
        var3 = this.field_e >> 2;
        var4 = this.field_b >> 2;
        param0 = param0 + this.field_j / 4;
        param1 = param1 + this.field_h / 4;
        if (param0 >= oo.field_f) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = oo.field_f - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= oo.field_g) {
          stackIn_6_0 = this.field_e - 4;
        } else {
          stackIn_6_0 = (oo.field_g - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= oo.field_e) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = oo.field_e - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= oo.field_d) {
          stackIn_12_0 = this.field_b - 4;
        } else {
          stackIn_12_0 = (oo.field_d - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 4) {
          for (var10 = var5; var10 <= var6; var10 += 4) {
            var11 = var9 * this.field_e + var10;
            var12 = (param1 + (var9 >> 2)) * oo.field_b + (param0 + (var10 >> 2));
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13Lifetime1 = this.field_l[this.field_m[var11 + var16 * this.field_e + var17] & 255];
                if (var13Lifetime1 == 0) {
                  var13Lifetime1 = oo.field_i[var12];
                }
                var14 = var14 + (var13Lifetime1 & 16711935);
                var15 = var15 + (var13Lifetime1 & 65280);
              }
            }
            oo.field_i[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
          }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        boolean stackIn_11_0 = false;
        param2 = param2 - (param0 + this.field_j);
        if (param2 < 0) {
          return false;
        }
        if (param2 >= this.field_e) {
          return false;
        }
        param3 = param3 - (param1 + this.field_h);
        if (param3 >= 0 &&
          param3 < this.field_b) {
          stackIn_11_0 = (this.field_m[param3 * this.field_e + param2] != 0);
          return stackIn_11_0;
        }
        return false;
    }

    final void d(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_h;
        int var3 = param0 + param1 * oo.field_b;
        int var4 = 0;
        int var5 = this.field_b;
        int var6 = this.field_e;
        int var7 = oo.field_b - var6;
        int var8 = 0;
        if (param1 < oo.field_e) {
          var9 = oo.field_e - param1;
          var5 = var5 - var9;
          param1 = oo.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * oo.field_b;
        }
        if (param1 + var5 > oo.field_d) {
          var5 = var5 - (param1 + var5 - oo.field_d);
        }
        if (param0 < oo.field_f) {
          var9Lifetime1 = oo.field_f - param0;
          var6 = var6 - var9Lifetime1;
          param0 = oo.field_f;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > oo.field_g) {
          var9Lifetime2 = param0 + var6 - oo.field_g;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ri.a(oo.field_i, this.field_m, this.field_l, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var13 = 0;
        int var15 = 0;
        int var5 = this.field_e;
        int var6 = this.field_b;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field_f;
        int var10 = this.field_a;
        int var11 = (var9 << 16) / param2;
        int var12 = (var10 << 16) / param3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (this.field_j > 0) {
          var13 = ((this.field_j << 16) + var11 - 1) / var11;
          param0 = param0 + var13;
          var7 = var7 + (var13 * var11 - (this.field_j << 16));
        }
        if (this.field_h > 0) {
          var13Lifetime1 = ((this.field_h << 16) + var12 - 1) / var12;
          param1 = param1 + var13Lifetime1;
          var8 = var8 + (var13Lifetime1 * var12 - (this.field_h << 16));
        }
        if (var5 < var9) {
          param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
          param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13Lifetime2 = param0 + param1 * oo.field_b;
        int var14 = oo.field_b - param2;
        if (param1 + param3 > oo.field_d) {
          param3 = param3 - (param1 + param3 - oo.field_d);
        }
        if (param1 < oo.field_e) {
          var15 = oo.field_e - param1;
          param3 = param3 - var15;
          var13Lifetime2 = var13Lifetime2 + var15 * oo.field_b;
          var8 = var8 + var12 * var15;
        }
        if (param0 + param2 > oo.field_g) {
          var15Lifetime1 = param0 + param2 - oo.field_g;
          param2 = param2 - var15Lifetime1;
          var14 = var14 + var15Lifetime1;
        }
        if (param0 < oo.field_f) {
          var15Lifetime2 = oo.field_f - param0;
          param2 = param2 - var15Lifetime2;
          var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
          var7 = var7 + var11 * var15Lifetime2;
          var14 = var14 + var15Lifetime2;
        }
        ri.b(oo.field_i, this.field_m, this.field_l, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
    }

    final void b() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        byte[] var1 = new byte[this.field_e * this.field_b];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = this.field_e - 1; var3 >= 0; var3--) {
          for (var4 = 0; var4 < this.field_b; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_m[var3 + var4 * this.field_e];
          }
        }
        this.field_m = var1;
        var3Lifetime1 = this.field_j;
        this.field_j = this.field_h;
        this.field_h = this.field_f - this.field_e - var3Lifetime1;
        var3Lifetime2 = this.field_b;
        this.field_b = this.field_e;
        this.field_e = var3Lifetime2;
        var3Lifetime3 = this.field_a;
        this.field_a = this.field_f;
        this.field_f = var3Lifetime3;
    }

    final ri d() {
        int var3 = 0;
        ri var1 = new ri(this.field_e, this.field_b, this.field_l.length);
        int var3Lifetime1;
        var1.field_f = this.field_f;
        var1.field_a = this.field_a;
        var1.field_j = this.field_j;
        var1.field_h = this.field_h;
        int var2 = this.field_m.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_m[var3] = this.field_m[var3];
        }
        var2 = this.field_l.length;
        int var4 = 0;
        var3Lifetime1 = var4;
        while (var4 < var2) {
          var1.field_l[var4] = this.field_l[var4];
          var4++;
        }
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        if (param2 == 256) {
          this.a(param0, param1);
          return;
        }
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_h;
        int var5 = param0 + param1 * oo.field_b;
        int var6 = 0;
        int var7 = this.field_b;
        int var8 = this.field_e;
        int var9 = oo.field_b - var8;
        int var10 = 0;
        if (param1 < oo.field_e) {
          var11 = oo.field_e - param1;
          var7 = var7 - var11;
          param1 = oo.field_e;
          var6 = var6 + var11 * var8;
          var5 = var5 + var11 * oo.field_b;
        }
        if (param1 + var7 > oo.field_d) {
          var7 = var7 - (param1 + var7 - oo.field_d);
        }
        if (param0 < oo.field_f) {
          var11Lifetime1 = oo.field_f - param0;
          var8 = var8 - var11Lifetime1;
          param0 = oo.field_f;
          var6 = var6 + var11Lifetime1;
          var5 = var5 + var11Lifetime1;
          var10 = var10 + var11Lifetime1;
          var9 = var9 + var11Lifetime1;
        }
        if (param0 + var8 > oo.field_g) {
          var11Lifetime2 = param0 + var8 - oo.field_g;
          var8 = var8 - var11Lifetime2;
          var10 = var10 + var11Lifetime2;
          var9 = var9 + var11Lifetime2;
        }
        if (var8 > 0) {
          if (var7 <= 0) {
            return;
          }
          ri.a(oo.field_i, this.field_m, this.field_l, 0, var6, var5, var8, var7, var9, var10, param2, param3);
          return;
        }
    }

    final void e(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_j;
        param1 = param1 + this.field_h;
        int var3 = param0 + param1 * oo.field_b;
        int var4 = 0;
        int var5 = this.field_b;
        int var6 = this.field_e;
        int var7 = oo.field_b - var6;
        int var8 = 0;
        if (param1 < oo.field_e) {
          var9 = oo.field_e - param1;
          var5 = var5 - var9;
          param1 = oo.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * oo.field_b;
        }
        if (param1 + var5 > oo.field_d) {
          var5 = var5 - (param1 + var5 - oo.field_d);
        }
        if (param0 < oo.field_f) {
          var9Lifetime1 = oo.field_f - param0;
          var6 = var6 - var9Lifetime1;
          param0 = oo.field_f;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > oo.field_g) {
          var9Lifetime2 = param0 + var6 - oo.field_g;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ri.a(0, this.field_m, var4, var3, 0, oo.field_i, this.field_l, var6, var7, var8, 0, var5);
          return;
        }
    }

    private final static void a(int param0, byte[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        param10 = -param11;
        while (true) {
          if (param10 >= 0) {
            return;
          }
          param4 = param7;
          if (param2 > 0 &&
            param1[param2 - 1] == -1) {
            param4--;
            param2++;
            param3++;
          }
          {
            while (!(param4 <= 0)) {
              param0 = param1[param2++];
              param4--;
              if (param0 == 0) {
                param3++;
                continue;
              }
              if (param0 != -1) {
                incrementValue$13 = param3;
                param3++;
                param5[incrementValue$13] = param6[param0 & 255];
                continue;
              }
              incrementValue$14 = param2;
              param2++;
              param0 = param1[incrementValue$14] & 255;
              param4--;
              param0 = param0 + param0;
              if (param0 > param4) {
                param0 = param4;
              }
              param2 = param2 + param0;
              param4 = param4 - param0;
              param3 = param3 + (param0 + 2);
            }
            {
              param3 = param3 + param8;
              param2 = param2 + param9;
              param10++;
            }
          }
        }
    }

    final void e() {
        int var2 = 0;
        int var4 = 0;
        int var1;
        int var3;
        int var5;
        if (this.field_l.length > 255) {
          throw new IllegalStateException();
        }
        var1 = this.field_e * this.field_b - 1;
        for (var2 = this.field_b - 1; var2 >= 0; var2--) {
          var3 = 0;
          for (var4 = this.field_e - 1; var4 >= 0; var4--) {
            var5 = this.field_m[var1];
            if (var5 != 0) {
              var3 = 0;
            } else {
              var3++;
              if (var3 == 512) {
                var3 = 510;
              }
              if ((var3 & 1) == 0) {
                this.field_m[var1] = (byte)-1;
                this.field_m[var1 + 1] = (byte)(var3 - 2 >> 1);
              }
            }
            var1--;
          }
        }
    }

    ri(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_f = param0;
        this.field_a = param1;
        this.field_j = param2;
        this.field_h = param3;
        this.field_e = param4;
        this.field_b = param5;
        this.field_m = param6;
        this.field_l = param7;
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

    final void c(int param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var18;
        int[] var19;
        var3 = this.field_e >> 1;
        var4 = this.field_b >> 1;
        param0 = param0 + this.field_j / 2;
        param1 = param1 + this.field_h / 2;
        if (param0 >= oo.field_f) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = oo.field_f - param0 << 1;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= oo.field_g) {
          stackIn_6_0 = this.field_e - 2;
        } else {
          stackIn_6_0 = (oo.field_g - param0 << 1) - 2;
        }
        var6 = stackIn_6_0;
        if (param1 >= oo.field_e) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = oo.field_e - param1 << 1;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= oo.field_d) {
          stackIn_12_0 = this.field_b - 2;
        } else {
          stackIn_12_0 = (oo.field_d - param1 << 1) - 2;
        }
        var8 = stackIn_12_0;
        var19 = new int[4];
        var18 = var19;
        var9 = var18;
        for (var10 = var7; var10 <= var8; var10 += 2) {
          for (var11 = var5; var11 <= var6; var11 += 2) {
            var12 = var10 * this.field_e + var11;
            var13 = (param1 + (var10 >> 1)) * oo.field_b + (param0 + (var11 >> 1));
            var9[0] = this.field_l[this.field_m[var12] & 255];
            var9[1] = this.field_l[this.field_m[var12 + 1] & 255];
            var9[2] = this.field_l[this.field_m[var12 + this.field_e] & 255];
            var9[3] = this.field_l[this.field_m[var12 + 1] & 255];
            var14 = 0;
            var15 = 0;
            var16 = 0;
            for (var17 = 0; var17 < 4; var17++) {
              if (var19[var17] == 0) {
                var9[var17] = oo.field_i[var13];
              }
              var14 = var14 + (var19[var17] >> 16 & 255);
              var15 = var15 + (var19[var17] >> 8 & 255);
              var16 = var16 + (var19[var17] & 255);
            }
            oo.field_i[var13] = var14 >> 2 << 16 | var15 >> 2 << 8 | var16 >> 2;
          }
        }
    }

    ri(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_f = param0;
        this.field_b = param1;
        this.field_a = param1;
        this.field_h = 0;
        this.field_j = 0;
        this.field_m = new byte[param0 * param1];
        this.field_l = new int[param2];
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var11 = 0;
        int var9 = -(param5 >> 2);
        int var11Lifetime1;
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            incrementValue$0 = param4;
            param4++;
            incrementValue$1 = param3;
            param3++;
            param0[incrementValue$0] = param2[param1[incrementValue$1] & 255];
            incrementValue$2 = param4;
            param4++;
            incrementValue$3 = param3;
            param3++;
            param0[incrementValue$2] = param2[param1[incrementValue$3] & 255];
            incrementValue$4 = param4;
            param4++;
            incrementValue$5 = param3;
            param3++;
            param0[incrementValue$4] = param2[param1[incrementValue$5] & 255];
            incrementValue$6 = param4;
            param4++;
            incrementValue$7 = param3;
            param3++;
            param0[incrementValue$6] = param2[param1[incrementValue$7] & 255];
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            incrementValue$8 = param4;
            param4++;
            incrementValue$9 = param3;
            param3++;
            param0[incrementValue$8] = param2[param1[incrementValue$9] & 255];
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }
}
