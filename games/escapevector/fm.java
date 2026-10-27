/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    private int[] field_d;
    private float[][] field_a;
    int field_f;
    private int field_c;
    private int[] field_b;
    private int[] field_e;

    final float[] a() {
        return this.field_a[this.c()];
    }

    private final static int a(int param0, int param1) {
        int var2 = 0;
        for (var2 = (int)Math.pow((double)param0, 1.0 / (double)param1) + 1; en.b(param1, var2, -1) > param0; var2--) {
        }
        return var2;
    }

    final int c() {
        int var1 = 0;
        while (this.field_e[var1] >= 0) {
          var1 = in.c() != 0 ? this.field_e[var1] : var1 + 1;
        }
        return ~this.field_e[var1];
    }

    fm() {
        int var2;
        int var3_int;
        int var7;
        float var9;
        int var10;
        int var11;
        int var8Lifetime1;
        in.e(24);
        this.field_f = in.e(16);
        this.field_c = in.e(24);
        this.field_d = new int[this.field_c];
        boolean stackIn_3_0 = !(in.c() == 0);
        boolean var1 = stackIn_3_0;
        if (var1) {
          var2 = 0;
          var3_int = in.e(5) + 1;
          while (var2 < this.field_c) {
            int var4_int = in.e(nm.a(this.field_c - var2, (byte) 78));
            for (int var5 = 0; var5 < var4_int; var5++) {
              int incrementValue$0 = var2;
              var2++;
              this.field_d[incrementValue$0] = var3_int;
            }
            var3_int++;
          }
        } else {
          int stackIn_13_0 = (in.c() == 0) ? 0 : 1;
          var2 = stackIn_13_0;
          int var14 = 0;
          var3_int = var14;
          while (var14 < this.field_c) {
            if (var2 != 0 &&
              in.c() == 0) {
              this.field_d[var14] = 0;
            } else {
              this.field_d[var14] = in.e(5) + 1;
            }
            var14++;
          }
        }
        this.b();
        int var2Lifetime1 = in.e(4);
        if (var2Lifetime1 > 0) {
          float var3 = in.d(in.e(32));
          float var4 = in.d(in.e(32));
          int var5Lifetime1 = in.e(4) + 1;
          boolean stackIn_25_0 = !(in.c() == 0);
          boolean var6 = stackIn_25_0;
          if (var2Lifetime1 != 1) {
            var7 = this.field_c * this.field_f;
          } else {
            var7 = fm.a(this.field_c, this.field_f);
          }
          this.field_b = new int[var7];
          for (int var8 = 0; var8 < var7; var8++) {
            this.field_b[var8] = in.e(var5Lifetime1);
          }
          this.field_a = new float[this.field_c][this.field_f];
          if (var2Lifetime1 != 1) {
            for (var8Lifetime1 = 0; var8Lifetime1 < this.field_c; var8Lifetime1++) {
              var9 = 0.0f;
              var10 = var8Lifetime1 * this.field_f;
              for (var11 = 0; var11 < this.field_f; var11++) {
                float var12 = (float)this.field_b[var10] * var4 + var3 + var9;
                this.field_a[var8Lifetime1][var11] = var12;
                if (var6) {
                  var9 = var12;
                }
                var10++;
              }
            }
          } else {
            for (var8Lifetime1 = 0; var8Lifetime1 < this.field_c; var8Lifetime1++) {
              var9 = 0.0f;
              var10 = 1;
              for (var11 = 0; var11 < this.field_f; var11++) {
                int var12_int = var8Lifetime1 / var10 % var7;
                float var13 = (float)this.field_b[var12_int] * var4 + var3 + var9;
                this.field_a[var8Lifetime1][var11] = var13;
                if (var6) {
                  var9 = var13;
                }
                var10 = var10 * var7;
              }
            }
          }
        }
    }

    private final void b() {
        int var6;
        int var7;
        int[] var17 = new int[this.field_c];
        int[] var14 = new int[33];
        int[] var12 = var14;
        int[] var2_ref_int__ = var12;
        for (int var3 = 0; var3 < this.field_c; var3++) {
          int var4 = this.field_d[var3];
          if (var4 != 0) {
            {
              int var5 = 1 << 32 - var4;
              var6 = var14[var4];
              var17[var3] = var6;
              if ((var6 & var5) == 0) {
                var7 = var6 | var5;
                for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9_int = var14[var8];
                  if (var9_int != var6) {
                    break;
                  }
                  int var10 = 1 << 32 - var8;
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
            for (int var8Lifetime2 = var4 + 1; var8Lifetime2 <= 32; var8Lifetime2++) {
              int var9_intLifetime1 = var14[var8Lifetime2];
              if (var9_intLifetime1 == var6) {
                var14[var8Lifetime2] = var7;
              }
            }
          }
        }
        this.field_e = new int[8];
        int var2 = 0;
        for (int var3Lifetime1 = 0; var3Lifetime1 < this.field_c; var3Lifetime1++) {
          int var4Lifetime1 = this.field_d[var3Lifetime1];
          if (var4Lifetime1 != 0) {
            int var5Lifetime1 = var17[var3Lifetime1];
            int var6Lifetime1 = 0;
            for (int var7Lifetime1 = 0; var7Lifetime1 < var4Lifetime1; var7Lifetime1++) {
              int var8Lifetime1 = -2147483648 >>> var7Lifetime1;
              if ((var5Lifetime1 & var8Lifetime1) == 0) {
                var6Lifetime1++;
              } else {
                if (this.field_e[var6Lifetime1] == 0) {
                  this.field_e[var6Lifetime1] = var2;
                }
                var6Lifetime1 = this.field_e[var6Lifetime1];
              }
              if (var6Lifetime1 >= this.field_e.length) {
                int[] var9 = new int[this.field_e.length * 2];
                int var11 = 0;
                int var10Lifetime1 = var11;
                while (var11 < this.field_e.length) {
                  var9[var11] = this.field_e[var11];
                  var11++;
                }
                this.field_e = var9;
              }
              var8Lifetime1 = var8Lifetime1 >>> 1;
            }
            this.field_e[var6Lifetime1] = ~var3Lifetime1;
            if (var6Lifetime1 >= var2) {
              var2 = var6Lifetime1 + 1;
            }
          }
        }
    }
}
