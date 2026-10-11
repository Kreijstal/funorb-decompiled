/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ej extends sg {
    private int field_G;
    static String[] field_J;
    private int field_M;
    private int field_I;
    private int field_L;
    private int field_K;
    private int field_H;

    boolean d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (this.field_G <= 0) {
        } else {
          var2 = this.field_H;
          var3 = this.field_L;
          fieldTemp$0 = this.field_K + 1;
          this.field_K = this.field_K + 1;
          if (this.field_G > fieldTemp$0) {
            var4 = this.field_K * (this.field_G * 2 - this.field_K);
            var5 = this.field_G * this.field_G;
            var3 = var4 * (this.field_L - this.field_M) / var5 + this.field_M;
            var2 = (-this.field_I + this.field_H) * var4 / var5 + this.field_I;
          } else {
            this.field_G = 0;
            this.n(6630);
          }
          this.a(var3, (byte) -81, var2);
        }
        if (param0) {
          ej.o(121);
        }
        return super.d(false);
    }

    boolean l(int param0) {
        this.m(0);
        if (param0 != 194) {
          return true;
        }
        return super.l(param0 + 0);
    }

    void m(int param0) {
        if (this.field_G <= 0) {
          return;
        }
        this.a(this.field_L, (byte) -81, this.field_H);
        this.field_G = param0;
        this.n(6630);
    }

    void n(int param0) {
        if (param0 != 6630) {
          this.m(63);
        }
    }

    ej(sk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_K = 0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param0 <= 0) {
          this.a(param2, (byte) -81, param1);
          return;
        }
        this.field_L = param2;
        if (param3 != 114) {
          return;
        }
        this.field_G = param0;
        this.field_M = this.field_r;
        this.field_K = 0;
        this.field_I = this.field_m;
        this.field_H = param1;
    }

    public static void o(int param0) {
        field_J = null;
        if (param0 != -15640) {
          field_J = (String[]) null;
        }
    }

    void a(int param0, int param1, int param2) {
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
        var16 = OrbDefence.field_D ? 1 : 0;
        ul.a(6 + param0, 35 + param1, -12 + this.field_m, -40 + this.field_r, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (var8 >= ul.field_d &&
            var8 < ul.field_a) {
            var9 = var5 + (var6 - var5) * var7 / var4;
            var10 = 0;
            var11 = this.field_m;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (20 - var7) + (-var10 + 20) * (-var10 + 20);
                if (462 >= var12) {
                  if (420 > var12) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  ul.field_b[ul.field_f * var8 + (param0 + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (20 - var7) * (-var7 + 20);
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    ul.field_b[ul.field_f * var8 + param0 + var11] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            ul.d(var10 + param0, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          ul.d(param0, var8Lifetime1, 6, var9Lifetime1);
          ul.d(-6 + param0 + this.field_m, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        qe.field_c.c(-90 + param0 + this.field_m, param1 + 10);
        sa.a(param2 ^ param2, sd.field_f, param0 + 5, this.field_m - 10, 35 + param1);
        sa.a(param2 ^ -9111, he.field_y, param0, this.field_m, -22 + (param1 + this.field_r));
        var6Lifetime2 = 127;
        var4Lifetime2 = -79 + this.field_r;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param1;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          ul.d(param0, var8Lifetime2, 6, var9Lifetime2);
          ul.d(param0 - (-this.field_m + 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    static {
        field_J = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
