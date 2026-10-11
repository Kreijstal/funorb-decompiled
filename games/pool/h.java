/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    private int field_d;
    int field_e;
    private float[][] field_b;
    private int[] field_a;
    private int[] field_c;
    private int[] field_f;

    final float[] c() {
        return this.field_b[this.b()];
    }

    private final static int a(int param0, int param1) {
        int var2 = 0;
        for (var2 = (int)Math.pow((double)param0, 1.0 / (double)param1) + 1; me.a(param1, var2, -1) > param0; var2--) {
        }
        return var2;
    }

    private final void a() {
        int[] var2_ref_int__;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var9_int;
        int var10;
        int var11;
        int[] var12;
        int[] var14;
        int[] var17;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var9_intLifetime1;
        var17 = new int[this.field_d];
        var14 = new int[33];
        var12 = var14;
        var2_ref_int__ = var12;
        for (var3 = 0; var3 < this.field_d; var3++) {
          var4 = this.field_a[var3];
          if (var4 != 0) {
            {
              var5 = 1 << 32 - var4;
              var6 = var14[var4];
              var17[var3] = var6;
              if ((var6 & var5) == 0) {
                var7 = var6 | var5;
                for (var8 = var4 - 1; var8 >= 1; var8--) {
                  var9_int = var14[var8];
                  if (var9_int != var6) {
                    break;
                  }
                  var10 = 1 << 32 - var8;
                  if ((var9_int & var10) != 0) {
                    var2_ref_int__[var8] = var2_ref_int__[var8 - 1];
                    break;
                  }
                  var2_ref_int__[var8] = var9_int | var10;
                }
              } else {
                var7 = var2_ref_int__[var4 - 1];
              }
            }
            var14[var4] = var7;
            for (var8Lifetime2 = var4 + 1; var8Lifetime2 <= 32; var8Lifetime2++) {
              var9_intLifetime1 = var14[var8Lifetime2];
              if (var9_intLifetime1 == var6) {
                var14[var8Lifetime2] = var7;
              }
            }
          }
        }
        this.field_c = new int[8];
        var2 = 0;
        for (var3Lifetime1 = 0; var3Lifetime1 < this.field_d; var3Lifetime1++) {
          var4Lifetime1 = this.field_a[var3Lifetime1];
          if (var4Lifetime1 != 0) {
            var5Lifetime1 = var17[var3Lifetime1];
            var6Lifetime1 = 0;
            for (var7Lifetime1 = 0; var7Lifetime1 < var4Lifetime1; var7Lifetime1++) {
              var8Lifetime1 = -2147483648 >>> var7Lifetime1;
              if ((var5Lifetime1 & var8Lifetime1) == 0) {
                var6Lifetime1++;
              } else {
                if (this.field_c[var6Lifetime1] == 0) {
                  this.field_c[var6Lifetime1] = var2;
                }
                var6Lifetime1 = this.field_c[var6Lifetime1];
              }
              if (var6Lifetime1 >= this.field_c.length) {
                var9 = new int[this.field_c.length * 2];
                var11 = 0;
                var10Lifetime1 = var11;
                while (var11 < this.field_c.length) {
                  var9[var11] = this.field_c[var11];
                  var11++;
                }
                this.field_c = var9;
              }
              var8Lifetime1 = var8Lifetime1 >>> 1;
            }
            this.field_c[var6Lifetime1] = ~var3Lifetime1;
            if (var6Lifetime1 >= var2) {
              var2 = var6Lifetime1 + 1;
            }
          }
        }
    }

    final int b() {
        int var1 = 0;
        while (this.field_c[var1] >= 0) {
          var1 = gm.c() != 0 ? this.field_c[var1] : var1 + 1;
        }
        return ~this.field_c[var1];
    }

    h() {
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int var1;
        int var2;
        int var3_int;
        float var3;
        int var4_int;
        float var4;
        int var5;
        int var6;
        int var7;
        int var8;
        float var9;
        int var10;
        int var11;
        float var12;
        int var12_int;
        float var13;
        int var14;
        int var2Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        gm.a(24);
        this.field_e = gm.a(16);
        this.field_d = gm.a(24);
        this.field_a = new int[this.field_d];
        stackIn_3_0 = (gm.c() == 0) ? 0 : 1;
        var1 = stackIn_3_0;
        if (var1 != 0) {
          var2 = 0;
          var3_int = gm.a(5) + 1;
          while (var2 < this.field_d) {
            var4_int = gm.a(gi.a(this.field_d - var2, 0));
            for (var5 = 0; var5 < var4_int; var5++) {
              incrementValue$0 = var2;
              var2++;
              this.field_a[incrementValue$0] = var3_int;
            }
            var3_int++;
          }
        } else {
          stackIn_13_0 = (gm.c() == 0) ? 0 : 1;
          var2 = stackIn_13_0;
          var14 = 0;
          var3_int = var14;
          while (var14 < this.field_d) {
            if (var2 != 0 &&
              gm.c() == 0) {
              this.field_a[var14] = 0;
            } else {
              this.field_a[var14] = gm.a(5) + 1;
            }
            var14++;
          }
        }
        this.a();
        var2Lifetime1 = gm.a(4);
        if (var2Lifetime1 > 0) {
          var3 = gm.c(gm.a(32));
          var4 = gm.c(gm.a(32));
          var5Lifetime1 = gm.a(4) + 1;
          stackIn_25_0 = (gm.c() == 0) ? 0 : 1;
          var6 = stackIn_25_0;
          if (var2Lifetime1 != 1) {
            var7 = this.field_d * this.field_e;
          } else {
            var7 = h.a(this.field_d, this.field_e);
          }
          this.field_f = new int[var7];
          for (var8 = 0; var8 < var7; var8++) {
            this.field_f[var8] = gm.a(var5Lifetime1);
          }
          this.field_b = new float[this.field_d][this.field_e];
          if (var2Lifetime1 != 1) {
            for (var8Lifetime1 = 0; var8Lifetime1 < this.field_d; var8Lifetime1++) {
              var9 = 0.0f;
              var10 = var8Lifetime1 * this.field_e;
              for (var11 = 0; var11 < this.field_e; var11++) {
                var12 = (float)this.field_f[var10] * var4 + var3 + var9;
                this.field_b[var8Lifetime1][var11] = var12;
                if (var6 != 0) {
                  var9 = var12;
                }
                var10++;
              }
            }
          } else {
            for (var8Lifetime1 = 0; var8Lifetime1 < this.field_d; var8Lifetime1++) {
              var9 = 0.0f;
              var10 = 1;
              for (var11 = 0; var11 < this.field_e; var11++) {
                var12_int = var8Lifetime1 / var10 % var7;
                var13 = (float)this.field_f[var12_int] * var4 + var3 + var9;
                this.field_b[var8Lifetime1][var11] = var13;
                if (var6 != 0) {
                  var9 = var13;
                }
                var10 = var10 * var7;
              }
            }
          }
        }
    }
}
