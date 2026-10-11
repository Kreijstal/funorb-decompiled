/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wk extends ri {
    private int field_K;
    private int field_J;
    static int field_G;
    static String field_H;
    private int field_F;
    private int field_I;
    private int field_M;
    private int field_L;

    void l(int param0) {
        if (param0 != -4993) {
          this.field_M = -100;
        }
    }

    public static void g(byte param0) {
        field_H = null;
        if (param0 != 38) {
          field_H = (String) null;
        }
    }

    final static void h(byte param0) {
        oh.a(param0 + 23, 4);
        if (param0 != -124) {
          field_G = -55;
        }
    }

    void i(byte param0) {
        if (this.field_M <= 0) {
          return;
        }
        this.c(-463076575, this.field_L, this.field_F);
        this.field_M = 0;
        this.l(-4993);
        int var2 = -109 / ((param0 - 31) / 35);
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = Bounce.field_N;
        if (param1 >= -6) {
          this.field_K = -102;
        }
        na.b(param2 + 6, param0 + 35, -12 + this.field_k, this.field_m - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (var8 >= na.field_i &&
            var8 < na.field_f) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.field_k;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (-var7 + 20) + (-var10 + 20) * (20 - var10);
                if (462 >= var12) {
                  if (420 > var12) {
                    break;
                  }
                  var13 = (-var12 + 462) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  na.field_d[var10 + (na.field_e * var8 + param2)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (20 >= var13Lifetime1) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    na.field_d[param2 + na.field_e * var8 + var11] = var15;
                  } else {
                    var12Lifetime1 = 1 + var11;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            na.a(var10 + param2, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          na.a(param2, var8Lifetime1, 6, var9Lifetime1);
          na.a(-6 + (param2 + this.field_k), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        fd.field_m.a(this.field_k + (param2 - 90), 10 + param0);
        gk.a(param2 + 5, 1, ij.field_c, param0 + 35, -10 + this.field_k);
        gk.a(param2, 1, de.field_d, -22 + (param0 + this.field_m), this.field_k);
        var4Lifetime2 = this.field_m - 79;
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          na.a(param2, var8Lifetime2, 6, var9Lifetime2);
          na.a(this.field_k + (param2 - 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 21) {
          return true;
        }
        if (0 < this.field_M) {
          var2 = this.field_L;
          var3 = this.field_F;
          fieldTemp$0 = this.field_K + 1;
          this.field_K = this.field_K + 1;
          if (this.field_M > fieldTemp$0) {
            var4 = this.field_K * (this.field_M * 2 - this.field_K);
            var5 = this.field_M * this.field_M;
            var3 = this.field_J + (this.field_F - this.field_J) * var4 / var5;
            var2 = (-this.field_I + this.field_L) * var4 / var5 + this.field_I;
          } else {
            this.field_M = 0;
            this.l(-4993);
          }
          this.c(-463076575, var2, var3);
        }
        return super.e((byte) 21);
    }

    boolean f(byte param0) {
        if (param0 != -33) {
          return false;
        }
        this.i((byte) 117);
        return super.f((byte) -33);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (0 >= param1) {
          this.c(-463076575, param3, param2);
          return;
        }
        this.field_L = param3;
        if (param0 != 126) {
          wk.g((byte) 74);
        }
        this.field_F = param2;
        this.field_I = this.field_k;
        this.field_J = this.field_m;
        this.field_K = 0;
        this.field_M = param1;
    }

    wk(pf param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_M = 0;
        this.field_K = 0;
    }

    static {
        field_H = "Player";
    }
}
