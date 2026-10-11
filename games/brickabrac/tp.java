/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends fc {
    byte[] field_i;
    int[] field_j;

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_g;
        int var4 = param0 + param1 * lb.field_c;
        int var5 = 0;
        int var6 = this.field_a;
        int var7 = this.field_d;
        int var8 = lb.field_c - var7;
        int var9 = 0;
        if (param1 < lb.field_b) {
          var10 = lb.field_b - param1;
          var6 = var6 - var10;
          param1 = lb.field_b;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * lb.field_c;
        }
        if (param1 + var6 > lb.field_j) {
          var6 = var6 - (param1 + var6 - lb.field_j);
        }
        if (param0 < lb.field_i) {
          var10Lifetime1 = lb.field_i - param0;
          var7 = var7 - var10Lifetime1;
          param0 = lb.field_i;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > lb.field_f) {
          var10Lifetime2 = param0 + var7 - lb.field_f;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        tp.b(lb.field_l, this.field_i, this.field_j, var5, var4, var7, var6, var8, var9, param2);
    }

    final void c(int param0, int param1) {
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
        var4 = this.field_a >> 2;
        param0 = param0 + this.field_b / 4;
        param1 = param1 + this.field_g / 4;
        if (param0 >= lb.field_i) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = lb.field_i - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= lb.field_f) {
          stackIn_6_0 = this.field_d - 4;
        } else {
          stackIn_6_0 = (lb.field_f - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= lb.field_b) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = lb.field_b - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= lb.field_j) {
          stackIn_12_0 = this.field_a - 4;
        } else {
          stackIn_12_0 = (lb.field_j - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 4) {
          for (var10 = var5; var10 <= var6; var10 += 4) {
            var11 = var9 * this.field_d + var10;
            var12 = (param1 + (var9 >> 2)) * lb.field_c + (param0 + (var10 >> 2));
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13Lifetime1 = this.field_j[this.field_i[var11 + var16 * this.field_d + var17] & 255];
                if (var13Lifetime1 == 0) {
                  var13Lifetime1 = lb.field_l[var12];
                }
                var14 = var14 + (var13Lifetime1 & 16711935);
                var15 = var15 + (var13Lifetime1 & 65280);
              }
            }
            lb.field_l[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
          }
        }
    }

    final jp a() {
        int var3 = 0;
        int var1 = this.field_d * this.field_a;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
          var2[var3] = this.field_j[this.field_i[var3] & 255];
        }
        return new jp(this.field_f, this.field_h, this.field_b, this.field_g, this.field_d, this.field_a, var2);
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_g;
        int var3 = param0 + param1 * lb.field_c;
        int var4 = 0;
        int var5 = this.field_a;
        int var6 = this.field_d;
        int var7 = lb.field_c - var6;
        int var8 = 0;
        if (param1 < lb.field_b) {
          var9 = lb.field_b - param1;
          var5 = var5 - var9;
          param1 = lb.field_b;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * lb.field_c;
        }
        if (param1 + var5 > lb.field_j) {
          var5 = var5 - (param1 + var5 - lb.field_j);
        }
        if (param0 < lb.field_i) {
          var9Lifetime1 = lb.field_i - param0;
          var6 = var6 - var9Lifetime1;
          param0 = lb.field_i;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > lb.field_f) {
          var9Lifetime2 = param0 + var6 - lb.field_f;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        tp.a(lb.field_l, this.field_i, this.field_j, var4, var3, var6, var5, var7, var8);
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

    tp(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_f = param0;
        this.field_h = param1;
        this.field_b = param2;
        this.field_g = param3;
        this.field_d = param4;
        this.field_a = param5;
        this.field_i = param6;
        this.field_j = param7;
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_g;
        int var3 = param0 + param1 * lb.field_c;
        int var4 = 0;
        int var5 = this.field_a;
        int var6 = this.field_d;
        int var7 = lb.field_c - var6;
        int var8 = 0;
        if (param1 < lb.field_b) {
          var9 = lb.field_b - param1;
          var5 = var5 - var9;
          param1 = lb.field_b;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * lb.field_c;
        }
        if (param1 + var5 > lb.field_j) {
          var5 = var5 - (param1 + var5 - lb.field_j);
        }
        if (param0 < lb.field_i) {
          var9Lifetime1 = lb.field_i - param0;
          var6 = var6 - var9Lifetime1;
          param0 = lb.field_i;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > lb.field_f) {
          var9Lifetime2 = param0 + var6 - lb.field_f;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        tp.a(lb.field_l, this.field_i, this.field_j, 0, var4, var3, var6, var5, var7, var8);
    }

    tp(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_f = param0;
        this.field_a = param1;
        this.field_h = param1;
        this.field_g = 0;
        this.field_b = 0;
        this.field_i = new byte[param0 * param1];
        this.field_j = new int[param2];
    }
}
