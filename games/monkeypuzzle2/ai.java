/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends bh {
    int[] field_m;
    byte[] field_n;

    final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_k;
        int var3 = param0 + param1 * ge.field_h;
        int var4 = 0;
        int var5 = this.field_d;
        int var6 = this.field_i;
        int var7 = ge.field_h - var6;
        int var8 = 0;
        if (param1 < ge.field_f) {
          var9 = ge.field_f - param1;
          var5 = var5 - var9;
          param1 = ge.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * ge.field_h;
        }
        if (param1 + var5 > ge.field_k) {
          var5 = var5 - (param1 + var5 - ge.field_k);
        }
        if (param0 < ge.field_a) {
          var9Lifetime1 = ge.field_a - param0;
          var6 = var6 - var9Lifetime1;
          param0 = ge.field_a;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > ge.field_j) {
          var9Lifetime2 = param0 + var6 - ge.field_j;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ai.b(ge.field_i, this.field_n, this.field_m, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final le a() {
        int var3 = 0;
        int var1 = this.field_i * this.field_d;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
          var2[var3] = this.field_m[this.field_n[var3] & 255];
        }
        return new le(this.field_c, this.field_l, this.field_a, this.field_k, this.field_i, this.field_d, var2);
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_k;
        int var3 = param0 + param1 * ge.field_h;
        int var4 = 0;
        int var5 = this.field_d;
        int var6 = this.field_i;
        int var7 = ge.field_h - var6;
        int var8 = 0;
        if (param1 < ge.field_f) {
          var9 = ge.field_f - param1;
          var5 = var5 - var9;
          param1 = ge.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * ge.field_h;
        }
        if (param1 + var5 > ge.field_k) {
          var5 = var5 - (param1 + var5 - ge.field_k);
        }
        if (param0 < ge.field_a) {
          var9Lifetime1 = ge.field_a - param0;
          var6 = var6 - var9Lifetime1;
          param0 = ge.field_a;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > ge.field_j) {
          var9Lifetime2 = param0 + var6 - ge.field_j;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ai.a(0, this.field_n, var4, var3, 0, ge.field_i, this.field_m, var6, var7, var8, 0, var5);
          return;
        }
    }

    final void b() {
        int var2 = 0;
        int var4 = 0;
        int var1;
        int var3;
        int var5;
        if (this.field_m.length > 255) {
          throw new IllegalStateException();
        }
        var1 = this.field_i * this.field_d - 1;
        for (var2 = this.field_d - 1; var2 >= 0; var2--) {
          var3 = 0;
          for (var4 = this.field_i - 1; var4 >= 0; var4--) {
            var5 = this.field_n[var1];
            if (var5 != 0) {
              var3 = 0;
            } else {
              var3++;
              if (var3 == 512) {
                var3 = 510;
              }
              if ((var3 & 1) == 0) {
                this.field_n[var1] = (byte)-1;
                this.field_n[var1 + 1] = (byte)(var3 - 2 >> 1);
              }
            }
            var1--;
          }
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

    private final static void a(int param0, byte[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var13;
        int var14;
        int var15;
        var13 = 256 - param12;
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
                var14 = param5[param3];
                var15 = param6[param0 & 255];
                incrementValue$1 = param3;
                param3++;
                param5[incrementValue$1] = ((var15 & 16711935) * param12 + (var14 & 16711935) * var13 & -16711936) + ((var15 & 65280) * param12 + (var14 & 65280) * var13 & 16711680) >> 8;
                continue;
              }
              incrementValue$2 = param2;
              param2++;
              param0 = param1[incrementValue$2] & 255;
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

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_k;
        int var4 = param0 + param1 * ge.field_h;
        int var5 = 0;
        int var6 = this.field_d;
        int var7 = this.field_i;
        int var8 = ge.field_h - var7;
        int var9 = 0;
        if (param1 < ge.field_f) {
          var10 = ge.field_f - param1;
          var6 = var6 - var10;
          param1 = ge.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * ge.field_h;
        }
        if (param1 + var6 > ge.field_k) {
          var6 = var6 - (param1 + var6 - ge.field_k);
        }
        if (param0 < ge.field_a) {
          var10Lifetime1 = ge.field_a - param0;
          var7 = var7 - var10Lifetime1;
          param0 = ge.field_a;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > ge.field_j) {
          var10Lifetime2 = param0 + var7 - ge.field_j;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ai.a(ge.field_i, this.field_n, this.field_m, var5, var4, var7, var6, var8, var9, param2);
          return;
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

    final void b(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_a;
        param1 = param1 + this.field_k;
        int var4 = param0 + param1 * ge.field_h;
        int var5 = 0;
        int var6 = this.field_d;
        int var7 = this.field_i;
        int var8 = ge.field_h - var7;
        int var9 = 0;
        if (param1 < ge.field_f) {
          var10 = ge.field_f - param1;
          var6 = var6 - var10;
          param1 = ge.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * ge.field_h;
        }
        if (param1 + var6 > ge.field_k) {
          var6 = var6 - (param1 + var6 - ge.field_k);
        }
        if (param0 < ge.field_a) {
          var10Lifetime1 = ge.field_a - param0;
          var7 = var7 - var10Lifetime1;
          param0 = ge.field_a;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > ge.field_j) {
          var10Lifetime2 = param0 + var7 - ge.field_j;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ai.a(0, this.field_n, var5, var4, 0, ge.field_i, this.field_m, var7, var8, var9, 0, var6, param2);
          return;
        }
    }

    ai(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_c = param0;
        this.field_l = param1;
        this.field_a = param2;
        this.field_k = param3;
        this.field_i = param4;
        this.field_d = param5;
        this.field_n = param6;
        this.field_m = param7;
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

    ai(int param0, int param1, int param2) {
        this.field_i = param0;
        this.field_c = param0;
        this.field_d = param1;
        this.field_l = param1;
        this.field_k = 0;
        this.field_a = 0;
        this.field_n = new byte[param0 * param1];
        this.field_m = new int[param2];
    }
}
