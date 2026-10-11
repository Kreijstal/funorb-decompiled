/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends jc {
    int[] field_l;
    byte[] field_k;

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

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_g;
        int var4 = param0 + param1 * qg.field_g;
        int var5 = 0;
        int var6 = this.field_a;
        int var7 = this.field_b;
        int var8 = qg.field_g - var7;
        int var9 = 0;
        if (param1 < qg.field_k) {
          var10 = qg.field_k - param1;
          var6 = var6 - var10;
          param1 = qg.field_k;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qg.field_g;
        }
        if (param1 + var6 > qg.field_l) {
          var6 = var6 - (param1 + var6 - qg.field_l);
        }
        if (param0 < qg.field_a) {
          var10Lifetime1 = qg.field_a - param0;
          var7 = var7 - var10Lifetime1;
          param0 = qg.field_a;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > qg.field_c) {
          var10Lifetime2 = param0 + var7 - qg.field_c;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ge.a(qg.field_i, this.field_k, this.field_l, var5, var4, var7, var6, var8, var9, param2);
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

    final void a(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        if (param2 == 256) {
          this.a(param0, param1);
          return;
        }
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_g;
        int var5 = param0 + param1 * qg.field_g;
        int var6 = 0;
        int var7 = this.field_a;
        int var8 = this.field_b;
        int var9 = qg.field_g - var8;
        int var10 = 0;
        if (param1 < qg.field_k) {
          var11 = qg.field_k - param1;
          var7 = var7 - var11;
          param1 = qg.field_k;
          var6 = var6 + var11 * var8;
          var5 = var5 + var11 * qg.field_g;
        }
        if (param1 + var7 > qg.field_l) {
          var7 = var7 - (param1 + var7 - qg.field_l);
        }
        if (param0 < qg.field_a) {
          var11Lifetime1 = qg.field_a - param0;
          var8 = var8 - var11Lifetime1;
          param0 = qg.field_a;
          var6 = var6 + var11Lifetime1;
          var5 = var5 + var11Lifetime1;
          var10 = var10 + var11Lifetime1;
          var9 = var9 + var11Lifetime1;
        }
        if (param0 + var8 > qg.field_c) {
          var11Lifetime2 = param0 + var8 - qg.field_c;
          var8 = var8 - var11Lifetime2;
          var10 = var10 + var11Lifetime2;
          var9 = var9 + var11Lifetime2;
        }
        if (var8 <= 0 ||
          var7 <= 0) {
          return;
        }
        ge.a(qg.field_i, this.field_k, this.field_l, 0, var6, var5, var8, var7, var9, var10, param2, param3);
    }

    ge(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_e = param0;
        this.field_d = param1;
        this.field_f = param2;
        this.field_g = param3;
        this.field_b = param4;
        this.field_a = param5;
        this.field_k = param6;
        this.field_l = param7;
    }

    ge(int param0, int param1, int param2) {
        this.field_b = param0;
        this.field_e = param0;
        this.field_a = param1;
        this.field_d = param1;
        this.field_g = 0;
        this.field_f = 0;
        this.field_k = new byte[param0 * param1];
        this.field_l = new int[param2];
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_g;
        int var3 = param0 + param1 * qg.field_g;
        int var4 = 0;
        int var5 = this.field_a;
        int var6 = this.field_b;
        int var7 = qg.field_g - var6;
        int var8 = 0;
        if (param1 < qg.field_k) {
          var9 = qg.field_k - param1;
          var5 = var5 - var9;
          param1 = qg.field_k;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * qg.field_g;
        }
        if (param1 + var5 > qg.field_l) {
          var5 = var5 - (param1 + var5 - qg.field_l);
        }
        if (param0 < qg.field_a) {
          var9Lifetime1 = qg.field_a - param0;
          var6 = var6 - var9Lifetime1;
          param0 = qg.field_a;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > qg.field_c) {
          var9Lifetime2 = param0 + var6 - qg.field_c;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ge.b(qg.field_i, this.field_k, this.field_l, 0, var4, var3, var6, var5, var7, var8);
    }

    final ge b() {
        int var3 = 0;
        ge var1 = new ge(this.field_b, this.field_a, this.field_l.length);
        int var3Lifetime1;
        var1.field_e = this.field_e;
        var1.field_d = this.field_d;
        var1.field_f = this.field_f;
        var1.field_g = this.field_g;
        int var2 = this.field_k.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_k[var3] = this.field_k[var3];
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

    final ka a() {
        int var3 = 0;
        int var1 = this.field_b * this.field_a;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
          var2[var3] = this.field_l[this.field_k[var3] & 255];
        }
        return new ka(this.field_e, this.field_d, this.field_f, this.field_g, this.field_b, this.field_a, var2);
    }
}
