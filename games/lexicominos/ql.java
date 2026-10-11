/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ql extends al {
    static le field_Q;
    private int field_L;
    private int field_J;
    static int field_O;
    static volatile boolean field_K;
    private int field_I;
    private int field_P;
    private int field_M;
    private int field_N;

    void f(boolean param0) {
        if (0 >= this.field_J) {
          return;
        }
        if (!param0) {
          ql.g((byte) -79);
        }
        this.b(this.field_M, -120, this.field_N);
        this.field_J = 0;
        this.h((byte) 38);
    }

    void h(byte param0) {
        if (param0 != 38) {
          field_K = true;
        }
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
        var16 = Lexicominos.field_L ? 1 : 0;
        lf.a(6 + param2, 35 + param0, this.field_j - 12, this.field_v - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var4 > var7) {
          if (lf.field_c <= var8 &&
            lf.field_h > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.field_j;
            if (var7 <= 20) {
              while (20 >= var10) {
                var12 = (-var7 + 20) * (20 - var7) + (-var10 + 20) * (20 - var10);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (-var12 + 462) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  lf.field_b[param2 + (var8 * lf.field_f + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (-var7 + 20);
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    lf.field_b[var11 + lf.field_f * var8 + param2] = var15;
                  } else {
                    var12Lifetime1 = 1 + var11;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            lf.a(param2 + var10, var8, var11 - var10, var9);
          }
          var7++;
          var8++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          lf.a(param2, var8Lifetime1, 6, var9Lifetime1);
          lf.a(this.field_j + (param2 - 6), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        Lexicominos.field_I.d(-90 + (this.field_j + param2), param0 + 10);
        ac.a(true, param0 + 35, ti.field_I, param2 + 5, this.field_j - 10);
        ac.a(true, -22 + param0 + this.field_v, we.field_i, param2, this.field_j);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_v;
        var7Lifetime2 = -113 / ((-3 - param1) / 43);
        var8Lifetime2 = 0;
        var9Lifetime2 = 57 + param0;
        while (var8Lifetime2 < var4Lifetime2) {
          var10Lifetime1 = var5Lifetime2 + var8Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2;
          var10Lifetime1 = var10Lifetime1 | (var10Lifetime1 << 8 | var10Lifetime1 << 16);
          lf.a(param2, var9Lifetime2, 6, var10Lifetime1);
          lf.a(this.field_j + param2 - 6, var9Lifetime2, 6, var10Lifetime1);
          var8Lifetime2++;
          var9Lifetime2++;
        }
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 >= -21) {
          return true;
        }
        if (this.field_J > 0) {
          var2 = this.field_M;
          var3 = this.field_N;
          fieldTemp$0 = this.field_I + 1;
          this.field_I = this.field_I + 1;
          if (this.field_J <= fieldTemp$0) {
            this.field_J = 0;
            this.h((byte) 38);
          } else {
            var4 = (2 * this.field_J - this.field_I) * this.field_I;
            var5 = this.field_J * this.field_J;
            var3 = this.field_L + var4 * (-this.field_L + this.field_N) / var5;
            var2 = var4 * (-this.field_P + this.field_M) / var5 + this.field_P;
          }
          this.b(var2, -111, var3);
        }
        return super.f((byte) -65);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param2 <= 0) {
          this.b(param0, -95, param3);
          return;
        }
        this.field_J = param2;
        this.field_L = this.field_v;
        this.field_M = param0;
        this.field_N = param3;
        this.field_P = this.field_j;
        this.field_I = 0;
        int var5 = -2 % ((10 - param1) / 59);
    }

    public static void g(byte param0) {
        field_Q = null;
        if (param0 != 42) {
          field_O = -54;
        }
    }

    final static jb e(boolean param0) {
        if (param0) {
          return (jb) null;
        }
        jb var1 = new jb(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], be.field_f[0], ci.field_b);
        gk.a(12428);
        return var1;
    }

    boolean a(byte param0) {
        if (param0 != 26) {
          this.field_M = 112;
        }
        this.f(true);
        return super.a((byte) 26);
    }

    ql(eg param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_J = 0;
        this.field_I = 0;
    }

    static {
        field_O = 640;
        field_K = false;
    }
}
