/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class am extends vf {
    static kv[] field_M;
    private int field_L;
    private int field_I;
    static long field_K;
    private int field_N;
    static boolean field_O;
    static int[] field_Q;
    private int field_J;
    static int[] field_R;
    private int field_H;
    private int field_P;

    public static void c(boolean param0) {
        field_Q = null;
        field_R = null;
        if (!param0) {
          field_K = -59L;
        }
        field_M = null;
    }

    void a(int param0, byte param1, int param2) {
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
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = BachelorFridge.field_y;
        dg.b(param2 + 6, param0 + 35, -12 + this.field_p, -40 + this.field_q, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var4 > var7) {
          if (dg.field_j <= var8 &&
            var8 < dg.field_k) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.field_p;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  dg.field_e[var8 * dg.field_i + param2 + var10] = var13;
                }
                var10++;
              }
            }
            if (20 >= var7) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = (-var14 + 462) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    dg.field_e[param2 + (dg.field_i * var8 + var11)] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            dg.e(param2 + var10, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var9Lifetime1 = 83 / ((-16 - param1) / 56);
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param0;
        while (var4Lifetime1 > var7Lifetime1) {
          var10Lifetime1 = var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var10Lifetime1 = var10Lifetime1 | (var10Lifetime1 << 16 | var10Lifetime1 << 8);
          dg.e(param2, var8Lifetime1, 6, var10Lifetime1);
          dg.e(-6 + param2 + this.field_p, var8Lifetime1, 6, var10Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        gt.field_s.e(-90 + (param2 + this.field_p), 10 + param0);
        ao.a(param2 + 5, oea.field_s, this.field_p - 10, (byte) -128, param0 + 35);
        ao.a(param2, jw.field_v, this.field_p, (byte) -128, this.field_q + (param0 - 22));
        var5Lifetime2 = 169;
        var4Lifetime2 = this.field_q - 79;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          dg.e(param2, var8Lifetime2, 6, var9Lifetime2);
          dg.e(this.field_p + (param2 - 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 <= 0) {
          this.b(-79, param2, param3);
          return;
        }
        this.field_H = param2;
        this.field_J = param0;
        if (param1 != 26012) {
          return;
        }
        this.field_I = this.field_p;
        this.field_N = this.field_q;
        this.field_L = 0;
        this.field_P = param3;
    }

    void b(boolean param0) {
        if (param0) {
          this.m(-15);
        }
    }

    am(rp param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_J = 0;
        this.field_L = 0;
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (this.field_J > 0) {
          var2 = this.field_P;
          var3 = this.field_H;
          fieldTemp$0 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (this.field_J > fieldTemp$0) {
            var4 = (2 * this.field_J - this.field_L) * this.field_L;
            var5 = this.field_J * this.field_J;
            var2 = (this.field_P - this.field_I) * var4 / var5 + this.field_I;
            var3 = this.field_N + (-this.field_N + this.field_H) * var4 / var5;
          } else {
            this.field_J = 0;
            this.b(false);
          }
          this.b(-123, var3, var2);
        }
        if (param0 > -32) {
          return false;
        }
        return super.a(-116);
    }

    boolean k(int param0) {
        this.m(17310);
        if (param0 >= -59) {
          am.c(false);
        }
        return super.k(-81);
    }

    void m(int param0) {
        if (this.field_J <= 0) {
          return;
        }
        this.b(-35, this.field_H, this.field_P);
        if (param0 != 17310) {
          return;
        }
        this.field_J = 0;
        this.b(false);
    }

    static {
        field_K = 0L;
        field_Q = new int[]{23, 23, 24, 26, 28};
    }
}
