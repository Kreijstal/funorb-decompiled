/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends pe {
    int[] field_l;
    byte[] field_m;

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
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

    private final static void c(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int incrementValue$8 = 0;
        int incrementValue$0 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            incrementValue$2 = param4;
            param4--;
            param3 = param2[param1[incrementValue$2] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$4 = param4;
            param4--;
            param3 = param2[param1[incrementValue$4] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$6 = param4;
            param4--;
            param3 = param2[param1[incrementValue$6] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$8 = param4;
            param4--;
            param3 = param2[param1[incrementValue$8] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            incrementValue$0 = param4;
            param4--;
            param3 = param2[param1[incrementValue$0] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = this.field_l.length - 1; var2 >= 0; var2--) {
          var3 = this.field_l[var2] >> 16 & 255;
          var3 = var3 * param0;
          var3 = var3 >> 8;
          if (var3 < 0) {
            var3 = 0;
          } else {
            if (var3 > 255) {
              var3 = 255;
            }
          }
          var4 = this.field_l[var2] >> 8 & 255;
          var4 = var4 * param0;
          var4 = var4 >> 8;
          if (var4 < 0) {
            var4 = 0;
          } else {
            if (var4 > 255) {
              var4 = 255;
            }
          }
          var5 = this.field_l[var2] & 255;
          var5 = var5 * param0;
          var5 = var5 >> 8;
          if (var5 < 0) {
            var5 = 0;
          } else {
            if (var5 > 255) {
              var5 = 255;
            }
          }
          this.field_l[var2] = (var3 << 16) + (var4 << 8) + var5;
        }
    }

    final nh b() {
        int var3 = 0;
        int var1 = this.field_d * this.field_k;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
          var2[var3] = this.field_l[this.field_m[var3] & 255];
        }
        return new nh(this.field_h, this.field_c, this.field_a, this.field_f, this.field_d, this.field_k, var2);
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
        var3 = this.field_d >> 2;
        var4 = this.field_k >> 2;
        param0 = param0 + this.field_a / 4;
        param1 = param1 + this.field_f / 4;
        if (param0 >= wj.field_g) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = wj.field_g - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= wj.field_b) {
          stackIn_6_0 = this.field_d - 4;
        } else {
          stackIn_6_0 = (wj.field_b - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= wj.field_e) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = wj.field_e - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= wj.field_j) {
          stackIn_12_0 = this.field_k - 4;
        } else {
          stackIn_12_0 = (wj.field_j - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 4) {
          for (var10 = var5; var10 <= var6; var10 += 4) {
            var11 = var9 * this.field_d + var10;
            var12 = (param1 + (var9 >> 2)) * wj.field_k + (param0 + (var10 >> 2));
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13Lifetime1 = this.field_l[this.field_m[var11 + var16 * this.field_d + var17] & 255];
                if (var13Lifetime1 == 0) {
                  var13Lifetime1 = wj.field_l[var12];
                }
                var14 = var14 + (var13Lifetime1 & 16711935);
                var15 = var15 + (var13Lifetime1 & 65280);
              }
            }
            wj.field_l[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
          }
        }
    }

    final void h() {
        int var2 = 0;
        int var4 = 0;
        int var1;
        int var3;
        int var5;
        if (this.field_l.length > 255) {
          throw new IllegalStateException();
        }
        var1 = this.field_d * this.field_k - 1;
        for (var2 = this.field_k - 1; var2 >= 0; var2--) {
          var3 = 0;
          for (var4 = this.field_d - 1; var4 >= 0; var4--) {
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

    final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * wj.field_k;
        int var4 = 0;
        int var5 = this.field_k;
        int var6 = this.field_d;
        int var7 = wj.field_k - var6;
        int var8 = 0;
        if (param1 < wj.field_e) {
          var9 = wj.field_e - param1;
          var5 = var5 - var9;
          param1 = wj.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * wj.field_k;
        }
        if (param1 + var5 > wj.field_j) {
          var5 = var5 - (param1 + var5 - wj.field_j);
        }
        if (param0 < wj.field_g) {
          var9Lifetime1 = wj.field_g - param0;
          var6 = var6 - var9Lifetime1;
          param0 = wj.field_g;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > wj.field_b) {
          var9Lifetime2 = param0 + var6 - wj.field_b;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          he.b(wj.field_l, this.field_m, this.field_l, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final he a() {
        int var4 = 0;
        int var3 = 0;
        he var1 = new he(this.field_d, this.field_k, this.field_l.length);
        int var3Lifetime1;
        var1.field_h = this.field_h;
        var1.field_c = this.field_c;
        var1.field_a = this.field_h - this.field_d - this.field_a;
        var1.field_f = this.field_f;
        int var2 = this.field_l.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_l[var3] = this.field_l[var3];
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < this.field_k; var3Lifetime1++) {
          for (var4 = 0; var4 < this.field_d; var4++) {
            var1.field_m[var3Lifetime1 * this.field_d + var4] = this.field_m[var3Lifetime1 * this.field_d + this.field_d - 1 - var4];
          }
        }
        return var1;
    }

    final void d() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        byte[] var1 = new byte[this.field_d * this.field_k];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = this.field_d - 1; var3 >= 0; var3--) {
          for (var4 = 0; var4 < this.field_k; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_m[var3 + var4 * this.field_d];
          }
        }
        this.field_m = var1;
        var3Lifetime1 = this.field_a;
        this.field_a = this.field_f;
        this.field_f = this.field_h - this.field_d - var3Lifetime1;
        var3Lifetime2 = this.field_k;
        this.field_k = this.field_d;
        this.field_d = var3Lifetime2;
        var3Lifetime3 = this.field_c;
        this.field_c = this.field_h;
        this.field_h = var3Lifetime3;
    }

    final he e() {
        int var3 = 0;
        he var1 = new he(this.field_d, this.field_k, this.field_l.length);
        int var3Lifetime1;
        var1.field_h = this.field_h;
        var1.field_c = this.field_c;
        var1.field_a = this.field_a;
        var1.field_f = this.field_f;
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

    final void c(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + (this.field_h - this.field_d - this.field_a);
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * wj.field_k;
        int var4 = this.field_d - 1;
        int var5 = this.field_k;
        int var6 = this.field_d;
        int var7 = wj.field_k - var6;
        int var8 = var6 + var6;
        if (param1 < wj.field_e) {
          var9 = wj.field_e - param1;
          var5 = var5 - var9;
          param1 = wj.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * wj.field_k;
        }
        if (param1 + var5 > wj.field_j) {
          var5 = var5 - (param1 + var5 - wj.field_j);
        }
        if (param0 < wj.field_g) {
          var9Lifetime1 = wj.field_g - param0;
          var6 = var6 - var9Lifetime1;
          param0 = wj.field_g;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > wj.field_b) {
          var9Lifetime2 = param0 + var6 - wj.field_b;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          he.c(wj.field_l, this.field_m, this.field_l, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        boolean stackIn_11_0 = false;
        param2 = param2 - (param0 + this.field_a);
        if (param2 < 0) {
          return false;
        }
        if (param2 >= this.field_d) {
          return false;
        }
        param3 = param3 - (param1 + this.field_f);
        if (param3 >= 0 &&
          param3 < this.field_k) {
          stackIn_11_0 = (this.field_m[param3 * this.field_d + param2] != 0);
          return stackIn_11_0;
        }
        return false;
    }

    final void i() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        byte[] var1 = new byte[this.field_d * this.field_k];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = 0; var3 < this.field_d; var3++) {
          for (var4 = this.field_k - 1; var4 >= 0; var4--) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_m[var3 + var4 * this.field_d];
          }
        }
        this.field_m = var1;
        var3Lifetime1 = this.field_f;
        this.field_f = this.field_a;
        this.field_a = this.field_c - this.field_k - var3Lifetime1;
        var3Lifetime2 = this.field_k;
        this.field_k = this.field_d;
        this.field_d = var3Lifetime2;
        var3Lifetime3 = this.field_c;
        this.field_c = this.field_h;
        this.field_h = var3Lifetime3;
    }

    final void f() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        byte[] var1 = new byte[this.field_d * this.field_k];
        int var2 = 0;
        for (var3 = this.field_k - 1; var3 >= 0; var3--) {
          for (var4 = 0; var4 < this.field_d; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_m[var4 + var3 * this.field_d];
          }
        }
        this.field_m = var1;
        this.field_f = this.field_c - this.field_k - this.field_f;
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        if (param2 == 256) {
          this.a(param0, param1);
          return;
        }
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_f;
        int var5 = param0 + param1 * wj.field_k;
        int var6 = 0;
        int var7 = this.field_k;
        int var8 = this.field_d;
        int var9 = wj.field_k - var8;
        int var10 = 0;
        if (param1 < wj.field_e) {
          var11 = wj.field_e - param1;
          var7 = var7 - var11;
          param1 = wj.field_e;
          var6 = var6 + var11 * var8;
          var5 = var5 + var11 * wj.field_k;
        }
        if (param1 + var7 > wj.field_j) {
          var7 = var7 - (param1 + var7 - wj.field_j);
        }
        if (param0 < wj.field_g) {
          var11Lifetime1 = wj.field_g - param0;
          var8 = var8 - var11Lifetime1;
          param0 = wj.field_g;
          var6 = var6 + var11Lifetime1;
          var5 = var5 + var11Lifetime1;
          var10 = var10 + var11Lifetime1;
          var9 = var9 + var11Lifetime1;
        }
        if (param0 + var8 > wj.field_b) {
          var11Lifetime2 = param0 + var8 - wj.field_b;
          var8 = var8 - var11Lifetime2;
          var10 = var10 + var11Lifetime2;
          var9 = var9 + var11Lifetime2;
        }
        if (var8 > 0) {
          if (var7 <= 0) {
            return;
          }
          he.b(wj.field_l, this.field_m, this.field_l, 0, var6, var5, var8, var7, var9, var10, param2, param3);
          return;
        }
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

    final void a(int param0, int param1, int param2, int param3) {
        int var13 = 0;
        int var15 = 0;
        int var5 = this.field_d;
        int var6 = this.field_k;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field_h;
        int var10 = this.field_c;
        int var11 = (var9 << 16) / param2;
        int var12 = (var10 << 16) / param3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (this.field_a > 0) {
          var13 = ((this.field_a << 16) + var11 - 1) / var11;
          param0 = param0 + var13;
          var7 = var7 + (var13 * var11 - (this.field_a << 16));
        }
        if (this.field_f > 0) {
          var13Lifetime1 = ((this.field_f << 16) + var12 - 1) / var12;
          param1 = param1 + var13Lifetime1;
          var8 = var8 + (var13Lifetime1 * var12 - (this.field_f << 16));
        }
        if (var5 < var9) {
          param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
          param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13Lifetime2 = param0 + param1 * wj.field_k;
        int var14 = wj.field_k - param2;
        if (param1 + param3 > wj.field_j) {
          param3 = param3 - (param1 + param3 - wj.field_j);
        }
        if (param1 < wj.field_e) {
          var15 = wj.field_e - param1;
          param3 = param3 - var15;
          var13Lifetime2 = var13Lifetime2 + var15 * wj.field_k;
          var8 = var8 + var12 * var15;
        }
        if (param0 + param2 > wj.field_b) {
          var15Lifetime1 = param0 + param2 - wj.field_b;
          param2 = param2 - var15Lifetime1;
          var14 = var14 + var15Lifetime1;
        }
        if (param0 < wj.field_g) {
          var15Lifetime2 = wj.field_g - param0;
          param2 = param2 - var15Lifetime2;
          var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
          var7 = var7 + var11 * var15Lifetime2;
          var14 = var14 + var15Lifetime2;
        }
        he.a(wj.field_l, this.field_m, this.field_l, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
    }

    final void g() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        byte[] var1 = new byte[this.field_d * this.field_k];
        int var2 = 0;
        for (var3 = 0; var3 < this.field_k; var3++) {
          for (var4 = this.field_d - 1; var4 >= 0; var4--) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_m[var4 + var3 * this.field_d];
          }
        }
        this.field_m = var1;
        this.field_a = this.field_h - this.field_d - this.field_a;
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_f;
        int var4 = param0 + param1 * wj.field_k;
        int var5 = 0;
        int var6 = this.field_k;
        int var7 = this.field_d;
        int var8 = wj.field_k - var7;
        int var9 = 0;
        if (param1 < wj.field_e) {
          var10 = wj.field_e - param1;
          var6 = var6 - var10;
          param1 = wj.field_e;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * wj.field_k;
        }
        if (param1 + var6 > wj.field_j) {
          var6 = var6 - (param1 + var6 - wj.field_j);
        }
        if (param0 < wj.field_g) {
          var10Lifetime1 = wj.field_g - param0;
          var7 = var7 - var10Lifetime1;
          param0 = wj.field_g;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > wj.field_b) {
          var10Lifetime2 = param0 + var7 - wj.field_b;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          he.a(wj.field_l, this.field_m, this.field_l, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void c() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        if (this.field_d == this.field_h &&
          this.field_k == this.field_c) {
          return;
        }
        byte[] var1 = new byte[this.field_h * this.field_c];
        int var2 = 0;
        for (var3 = 0; var3 < this.field_k; var3++) {
          for (var4 = 0; var4 < this.field_d; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[var4 + this.field_a + (var3 + this.field_f) * this.field_h] = this.field_m[incrementValue$0];
          }
        }
        this.field_m = var1;
        this.field_d = this.field_h;
        this.field_k = this.field_c;
        this.field_a = 0;
        this.field_f = 0;
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

    final void d(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * wj.field_k;
        int var4 = 0;
        int var5 = this.field_k;
        int var6 = this.field_d;
        int var7 = wj.field_k - var6;
        int var8 = 0;
        if (param1 < wj.field_e) {
          var9 = wj.field_e - param1;
          var5 = var5 - var9;
          param1 = wj.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * wj.field_k;
        }
        if (param1 + var5 > wj.field_j) {
          var5 = var5 - (param1 + var5 - wj.field_j);
        }
        if (param0 < wj.field_g) {
          var9Lifetime1 = wj.field_g - param0;
          var6 = var6 - var9Lifetime1;
          param0 = wj.field_g;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > wj.field_b) {
          var9Lifetime2 = param0 + var6 - wj.field_b;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          he.a(0, this.field_m, var4, var3, 0, wj.field_l, this.field_l, var6, var7, var8, 0, var5);
          return;
        }
    }

    final void e(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * wj.field_k;
        int var4 = 0;
        int var5 = this.field_k;
        int var6 = this.field_d;
        int var7 = wj.field_k - var6;
        int var8 = 0;
        if (param1 < wj.field_e) {
          var9 = wj.field_e - param1;
          var5 = var5 - var9;
          param1 = wj.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * wj.field_k;
        }
        if (param1 + var5 > wj.field_j) {
          var5 = var5 - (param1 + var5 - wj.field_j);
        }
        if (param0 < wj.field_g) {
          var9Lifetime1 = wj.field_g - param0;
          var6 = var6 - var9Lifetime1;
          param0 = wj.field_g;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > wj.field_b) {
          var9Lifetime2 = param0 + var6 - wj.field_b;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          he.a(wj.field_l, this.field_m, this.field_l, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    he(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_h = param0;
        this.field_c = param1;
        this.field_a = param2;
        this.field_f = param3;
        this.field_d = param4;
        this.field_k = param5;
        this.field_m = param6;
        this.field_l = param7;
    }

    final void d(int param0) {
        int var9 = 0;
        int var10 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        byte[] var8;
        if (this.field_d == this.field_h &&
          this.field_k == this.field_c) {
          return;
        }
        var2 = param0;
        if (var2 > this.field_a) {
          var2 = this.field_a;
        }
        var3 = param0;
        if (var3 + this.field_a + this.field_d > this.field_h) {
          var3 = this.field_h - this.field_a - this.field_d;
        }
        var4 = param0;
        if (var4 > this.field_f) {
          var4 = this.field_f;
        }
        var5 = param0;
        if (var5 + this.field_f + this.field_k > this.field_c) {
          var5 = this.field_c - this.field_f - this.field_k;
        }
        var6 = this.field_d + var2 + var3;
        var7 = this.field_k + var4 + var5;
        var8 = new byte[var6 * var7];
        for (var9 = 0; var9 < this.field_k; var9++) {
          for (var10 = 0; var10 < this.field_d; var10++) {
            var8[(var9 + var4) * var6 + (var10 + var2)] = this.field_m[var9 * this.field_d + var10];
          }
        }
        this.field_m = var8;
        this.field_d = var6;
        this.field_k = var7;
        this.field_a = this.field_a - var2;
        this.field_f = this.field_f - var4;
    }

    he(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_h = param0;
        this.field_k = param1;
        this.field_c = param1;
        this.field_f = 0;
        this.field_a = 0;
        this.field_m = new byte[param0 * param1];
        this.field_l = new int[param2];
    }
}
