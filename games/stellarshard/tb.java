/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb extends ui {
    private int field_I;
    private int field_J;
    private int field_N;
    static int field_K;
    private int field_O;
    private int field_M;
    private int field_L;

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var16;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
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
        var16 = stellarshard.field_B;
        ti.c(param2 + 6, param1 + 35, -12 + this.field_p, this.field_t - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var4 > var7) {
          if (ti.field_f <= var8 &&
            var8 < ti.field_l) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.field_p;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (20 - var7) * (-var7 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  ti.field_a[var10 + param2 + ti.field_i * var8] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (-var14 + 462) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    ti.field_a[var8 * ti.field_i + param2 + var11] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            ti.g(var10 + param2, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        if (param0 != 1) {
          tb.g((byte) 122);
        }
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param1;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          ti.g(param2, var8Lifetime1, 6, var9Lifetime1);
          ti.g(-6 + (param2 + this.field_p), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        ul.field_B.e(-90 + (param2 + this.field_p), 10 + param1);
        tf.a(-10 + this.field_p, 2, qh.field_a, 5 + param2, param1 + 35);
        tf.a(this.field_p, 2, sa.field_g, param2, -22 + (param1 + this.field_t));
        var4Lifetime2 = -79 + this.field_t;
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param1;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          ti.g(param2, var8Lifetime2, 6, var9Lifetime2);
          ti.g(this.field_p + param2 - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    void j(int param0) {
        if (param0 != -21) {
          this.field_I = 107;
          return;
        }
    }

    final static void f(byte param0) {
        ih.field_b = (byte[][]) null;
        ak.field_c = null;
        if (param0 <= -33) {
          ih.field_d = null;
          gj.field_w = null;
          vi.field_c = null;
          vc.field_b = null;
          return;
        }
        field_K = 80;
        ih.field_d = null;
        gj.field_w = null;
        vi.field_c = null;
        vc.field_b = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 >= param0) {
          this.a(param1, (byte) -91, param3);
          return;
        }
        this.field_O = 0;
        this.field_M = this.field_t;
        this.field_J = param3;
        this.field_L = param0;
        this.field_I = this.field_p;
        this.field_N = param1;
        if (param2 == -97) {
          return;
        }
        this.d(true);
    }

    boolean h(int param0) {
        if (param0 <= 98) {
          return false;
        }
        this.i(3642);
        return super.h(105);
    }

    boolean d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_L > 0) {
          var2 = this.field_N;
          var3 = this.field_J;
          fieldTemp$0 = this.field_O + 1;
          this.field_O = this.field_O + 1;
          if (fieldTemp$0 >= this.field_L) {
            this.field_L = 0;
            this.j(-21);
          } else {
            var4 = (this.field_L * 2 - this.field_O) * this.field_O;
            var5 = this.field_L * this.field_L;
            var2 = this.field_I + (this.field_N - this.field_I) * var4 / var5;
            var3 = this.field_M + (this.field_J - this.field_M) * var4 / var5;
          }
          this.a(var2, (byte) -13, var3);
        }
        if (param0) {
          return super.d(true);
        }
        this.field_O = -55;
        return super.d(true);
    }

    tb(ei param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_O = 0;
        this.field_L = 0;
    }

    void i(int param0) {
        if (0 >= this.field_L) {
          return;
        }
        if (param0 == 3642) {
          this.a(this.field_N, (byte) -27, this.field_J);
          this.field_L = 0;
          this.j(-21);
          return;
        }
        this.field_J = 125;
        this.a(this.field_N, (byte) -27, this.field_J);
        this.field_L = 0;
        this.j(-21);
    }

    final static am g(byte param0) {
        if (param0 == 118) {
          return new am(rb.j(5), vj.b(18596));
        }
        field_K = 94;
        return new am(rb.j(5), vj.b(18596));
    }

    static {
    }
}
