/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends ma {
    private int[] field_s;
    private int[] field_m;
    int[] field_r;
    private int[] field_q;
    boolean field_n;
    float field_p;
    private int[] field_l;
    int field_o;

    final void a() {
        this.field_r = null;
    }

    private final static int a(int param0, double param1) {
        if (param1 == 1.0) {
          return param0;
        }
        int var3 = param0 >> 16;
        int var4 = param0 >> 8 & 255;
        int var5 = param0 & 255;
        var3 = (int)(Math.pow((double)var3 / 256.0, param1) * 256.0);
        var4 = (int)(Math.pow((double)var4 / 256.0, param1) * 256.0);
        var5 = (int)(Math.pow((double)var5 / 256.0, param1) * 256.0);
        return (var3 << 16) + (var4 << 8) + var5;
    }

    final boolean a(float param0, int param1, di param2) {
        int var5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4;
        qb var6;
        byte[] var7;
        int[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        byte[] var15;
        int[] var16;
        byte[] var17;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var4Lifetime1;
        for (var4 = 0; var4 < this.field_m.length; var4++) {
          if (!param2.b(true, this.field_m[var4])) {
            return false;
          }
        }
        var4Lifetime1 = param1 * param1;
        this.field_r = new int[var4Lifetime1];
        for (var5 = 0; var5 < this.field_m.length; var5++) {
          var6 = sb.a(-7575, param2, this.field_m[var5]);
          var6.b();
          var17 = var6.field_j;
          var15 = var17;
          var7 = var15;
          var16 = var6.field_i;
          var14 = var16;
          var8 = var14;
          var9 = this.field_l[var5];
          if ((var9 & -16777216) == 50331648) {
            var10 = var9 & 16711935;
            var11 = var9 >> 8 & 255;
            for (var12 = 0; var12 < var16.length; var12++) {
              var13 = var16[var12];
              if ((var13 & 65535) == var13 >> 8) {
                var13 = var13 & 255;
                var8[var12] = var10 * var13 >> 8 & 16711935 | var11 * var13 & 65280;
              }
            }
          }
          for (var10Lifetime1 = 0; var10Lifetime1 < var16.length; var10Lifetime1++) {
            var8[var10Lifetime1] = dh.a(var16[var10Lifetime1], (double)param0);
          }
          if (var5 != 0) {
            var10Lifetime2 = this.field_q[var5 - 1];
          } else {
            var10Lifetime2 = 0;
          }
          if (var5 != 0) {
          }
          if (var10Lifetime2 == 0) {
            if (var6.field_f == param1) {
              for (var11Lifetime1 = 0; var11Lifetime1 < var4Lifetime1; var11Lifetime1++) {
                this.field_r[var11Lifetime1] = var8[var17[var11Lifetime1] & 255];
              }
            } else {
              if (var6.field_f == 64 &&
                param1 == 128) {
                var11Lifetime1 = 0;
                for (var12Lifetime1 = 0; var12Lifetime1 < param1; var12Lifetime1++) {
                  for (var13Lifetime1 = 0; var13Lifetime1 < param1; var13Lifetime1++) {
                    incrementValue$0 = var11Lifetime1;
                    var11Lifetime1++;
                    this.field_r[incrementValue$0] = var8[var7[(var13Lifetime1 >> 1) + (var12Lifetime1 >> 1 << 6)] & 255];
                  }
                }
              } else {
                if (var6.field_f == 128 &&
                  param1 == 64) {
                  var11Lifetime1 = 0;
                  for (var12Lifetime1 = 0; var12Lifetime1 < param1; var12Lifetime1++) {
                    for (var13Lifetime1 = 0; var13Lifetime1 < param1; var13Lifetime1++) {
                      incrementValue$1 = var11Lifetime1;
                      var11Lifetime1++;
                      this.field_r[incrementValue$1] = var8[var7[(var13Lifetime1 << 1) + (var12Lifetime1 << 1 << 7)] & 255];
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
          }
        }
        this.field_p = param0;
        return true;
    }

    dh(ge param0) {
        boolean stackIn_3_1 = false;
        int var2;
        int var3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        this.field_o = param0.d(-1034);
        stackIn_3_1 = (param0.g(-78) == 1);
        this.field_n = stackIn_3_1;
        var2 = param0.g(-99);
        if (var2 >= 1 &&
          var2 <= 4) {
          this.field_m = new int[var2];
          for (var3 = 0; var3 < var2; var3++) {
            this.field_m[var3] = param0.d(-1034);
          }
          if (var2 > 1) {
            this.field_q = new int[var2 - 1];
            for (var3Lifetime1 = 0; var3Lifetime1 < var2 - 1; var3Lifetime1++) {
              this.field_q[var3Lifetime1] = param0.g(-60);
            }
          }
          if (var2 > 1) {
            this.field_s = new int[var2 - 1];
            for (var3Lifetime2 = 0; var3Lifetime2 < var2 - 1; var3Lifetime2++) {
              this.field_s[var3Lifetime2] = param0.g(-84);
            }
          }
          this.field_l = new int[var2];
          for (var3Lifetime3 = 0; var3Lifetime3 < var2; var3Lifetime3++) {
            this.field_l[var3Lifetime3] = param0.b(true);
          }
          param0.g(-62);
          param0.g(-102);
          this.field_r = null;
          return;
        }
        throw new RuntimeException();
    }
}
