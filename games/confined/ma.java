/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends rk {
    private int[] field_q;
    int[] field_t;
    private int[] field_m;
    private int[] field_n;
    int field_s;
    float field_o;
    private int[] field_p;
    boolean field_r;

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

    final boolean a(float param0, int param1, mi param2) {
        int var5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4;
        bm var6;
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
        for (var4 = 0; var4 < this.field_p.length; var4++) {
          if (!param2.a(this.field_p[var4], (byte) -37)) {
            return false;
          }
        }
        var4Lifetime1 = param1 * param1;
        this.field_t = new int[var4Lifetime1];
        for (var5 = 0; var5 < this.field_p.length; var5++) {
          var6 = kb.a(param2, (byte) 69, this.field_p[var5]);
          var6.a();
          var17 = var6.field_n;
          var15 = var17;
          var7 = var15;
          var16 = var6.field_m;
          var14 = var16;
          var8 = var14;
          var9 = this.field_n[var5];
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
            var8[var10Lifetime1] = ma.a(var16[var10Lifetime1], (double)param0);
          }
          if (var5 != 0) {
            var10Lifetime2 = this.field_q[var5 - 1];
          } else {
            var10Lifetime2 = 0;
          }
          if (var5 != 0) {
          }
          if (var10Lifetime2 == 0) {
            if (var6.field_g == param1) {
              for (var11Lifetime1 = 0; var11Lifetime1 < var4Lifetime1; var11Lifetime1++) {
                this.field_t[var11Lifetime1] = var8[var17[var11Lifetime1] & 255];
              }
            } else {
              if (var6.field_g == 64 &&
                param1 == 128) {
                var11Lifetime1 = 0;
                for (var12Lifetime1 = 0; var12Lifetime1 < param1; var12Lifetime1++) {
                  for (var13Lifetime1 = 0; var13Lifetime1 < param1; var13Lifetime1++) {
                    incrementValue$0 = var11Lifetime1;
                    var11Lifetime1++;
                    this.field_t[incrementValue$0] = var8[var7[(var13Lifetime1 >> 1) + (var12Lifetime1 >> 1 << 6)] & 255];
                  }
                }
              } else {
                if (var6.field_g == 128 &&
                  param1 == 64) {
                  var11Lifetime1 = 0;
                  for (var12Lifetime1 = 0; var12Lifetime1 < param1; var12Lifetime1++) {
                    for (var13Lifetime1 = 0; var13Lifetime1 < param1; var13Lifetime1++) {
                      incrementValue$1 = var11Lifetime1;
                      var11Lifetime1++;
                      this.field_t[incrementValue$1] = var8[var7[(var13Lifetime1 << 1) + (var12Lifetime1 << 1 << 7)] & 255];
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
          }
        }
        this.field_o = param0;
        return true;
    }

    final void a() {
        this.field_t = null;
    }

    ma(kg param0) {
        boolean stackIn_3_1 = false;
        int var2;
        int var3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        this.field_s = param0.a((byte) 25);
        stackIn_3_1 = (param0.c(32) == 1);
        this.field_r = stackIn_3_1;
        var2 = param0.c(32);
        if (var2 >= 1 &&
          var2 <= 4) {
          this.field_p = new int[var2];
          for (var3 = 0; var3 < var2; var3++) {
            this.field_p[var3] = param0.a((byte) 25);
          }
          if (var2 > 1) {
            this.field_q = new int[var2 - 1];
            for (var3Lifetime1 = 0; var3Lifetime1 < var2 - 1; var3Lifetime1++) {
              this.field_q[var3Lifetime1] = param0.c(32);
            }
          }
          if (var2 > 1) {
            this.field_m = new int[var2 - 1];
            for (var3Lifetime2 = 0; var3Lifetime2 < var2 - 1; var3Lifetime2++) {
              this.field_m[var3Lifetime2] = param0.c(32);
            }
          }
          this.field_n = new int[var2];
          for (var3Lifetime3 = 0; var3Lifetime3 < var2; var3Lifetime3++) {
            this.field_n[var3Lifetime3] = param0.f((byte) 126);
          }
          param0.c(32);
          param0.c(32);
          this.field_t = null;
          return;
        }
        throw new RuntimeException();
    }
}
