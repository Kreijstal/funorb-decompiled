/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cm extends ub {
    private int field_I;
    private int field_P;
    private int field_O;
    private int field_N;
    static int field_J;
    static int[] field_M;
    private int field_L;
    private int field_K;

    cm(se param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_O = 0;
        this.field_L = 0;
    }

    final static int a(boolean param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0 ||
          param1 >= 65536) {
          var2 += 16;
          param1 = param1 >>> 16;
        }
        if (!param0) {
          cm.b(122, (byte) 64);
        }
        if (256 <= param1) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    void m(int param0) {
        if (this.field_O <= 0) {
          return;
        }
        this.a((byte) 117, this.field_K, this.field_P);
        this.field_O = 0;
        if (param0 != 4000) {
          return;
        }
        this.n(param0 ^ 8096);
    }

    public static void o(int param0) {
        if (param0 != 1) {
          return;
        }
        field_M = null;
    }

    boolean a(int param0) {
        this.m(4000);
        if (param0 >= -11) {
          return true;
        }
        return super.a(-89);
    }

    void n(int param0) {
        if (param0 != 4096) {
          this.field_I = 43;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
          this.a((byte) 99, param2, param3);
          return;
        }
        this.field_P = param3;
        this.field_O = param1;
        this.field_N = this.field_i;
        this.field_L = 0;
        this.field_K = param2;
        if (param0 > 0) {
          this.k(-115);
        }
        this.field_I = this.field_n;
    }

    final static void a(int param0, int param1) {
        no.field_H = 1000000000L / (long)param1;
        if (param0 != 922104624) {
          field_M = (int[]) null;
        }
    }

    final static void l(int param0) {
        int var4 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var6 = Kickabout.field_G;
        try {
          var1_int = -19 % ((param0 + 57) / 45);
          lt.field_c = new ut[100];
          var2 = wt.field_y.field_o;
          var3 = wt.field_y.field_v;
          for (var4 = 0; var4 < 100; var4++) {
            lt.field_c[var4] = new ut(var2, var3);
            iw.a(123, lt.field_c[var4]);
            var5 = (var4 << 16) / 100;
            wt.field_y.b(wt.field_y.field_o << 3, wt.field_y.field_v << 3, on.field_g << 3, on.field_f << 3, -var5, 4096);
            ta.e(127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "cm.FB(" + param0 + ')');
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
        int var17;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        var17 = Kickabout.field_G;
        on.g(param0 + 6, 35 + param2, this.field_n - 12, -40 + this.field_i, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 77 % ((param1 + 55) / 45);
        var8 = 0;
        var9 = param2;
        while (var4 > var8) {
          if (var9 >= on.field_e &&
            var9 < on.field_h) {
            var10 = var8 * (var6 - var5) / var4 + var5;
            var11 = 0;
            var12 = this.field_n;
            if (var8 <= 20) {
              while (var11 <= 20) {
                var13 = (-var11 + 20) * (20 - var11) + (20 - var8) * (20 - var8);
                if (var13 <= 462) {
                  if (var13 < 420) {
                    break;
                  }
                  var14 = var10 * (462 - var13) / 42;
                  var14 = var14 | (var14 << 16 | var14 << 8);
                  on.field_a[var9 * on.field_g + param0 + var11] = var14;
                }
                var11++;
              }
            }
            if (var8 <= 20) {
              var13Lifetime1 = var12;
              var12 -= 21;
              for (var14Lifetime1 = 0; var14Lifetime1 <= 20; var14Lifetime1++) {
                var15 = var14Lifetime1 * var14Lifetime1 + (-var8 + 20) * (20 - var8);
                if (462 >= var15) {
                  if (var15 < 420) {
                    var13Lifetime1 = var12 + 1;
                  } else {
                    var16 = (462 - var15) * var10 / 42;
                    var16 = var16 | (var16 << 16 | var16 << 8);
                    on.field_a[var12 + param0 + on.field_g * var9] = var16;
                  }
                  var12++;
                  continue;
                }
                break;
              }
              var12 = var13Lifetime1;
            }
            var10 = var10 | (var10 << 16 | var10 << 8);
            on.f(var11 + param0, var9, var12 - var11, var10);
          }
          var8++;
          var9++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var8Lifetime1 = 0;
        var9Lifetime1 = 35 + param2;
        while (var4Lifetime1 > var8Lifetime1) {
          var10Lifetime1 = (var6Lifetime1 - var5Lifetime1) * var8Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var10Lifetime1 = var10Lifetime1 | (var10Lifetime1 << 16 | var10Lifetime1 << 8);
          on.f(param0, var9Lifetime1, 6, var10Lifetime1);
          on.f(-6 + this.field_n + param0, var9Lifetime1, 6, var10Lifetime1);
          var9Lifetime1++;
          var8Lifetime1++;
        }
        aa.field_f.c(-90 + this.field_n + param0, param2 + 10);
        ju.a(5 + param0, -127, 35 + param2, sk.field_a, -10 + this.field_n);
        ju.a(param0, -125, -22 + (this.field_i + param2), vb.field_a, this.field_n);
        var4Lifetime2 = this.field_i - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var8Lifetime2 = 0;
        var9Lifetime2 = 57 + param2;
        while (var8Lifetime2 < var4Lifetime2) {
          var10Lifetime2 = var8Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var10Lifetime2 = var10Lifetime2 | (var10Lifetime2 << 16 | var10Lifetime2 << 8);
          on.f(param0, var9Lifetime2, 6, var10Lifetime2);
          on.f(-6 + this.field_n + param0, var9Lifetime2, 6, var10Lifetime2);
          var9Lifetime2++;
          var8Lifetime2++;
        }
    }

    final static byte b(int param0, byte param1) {
        if (param0 != -5) {
          field_J = 116;
        }
        return (byte)(param1 + 1);
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 <= ~this.field_O) {
        } else {
          var2 = this.field_P;
          var3 = this.field_K;
          fieldTemp$0 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (fieldTemp$0 >= this.field_O) {
            this.field_O = 0;
            this.n(4096);
          } else {
            var4 = (2 * this.field_O - this.field_L) * this.field_L;
            var5 = this.field_O * this.field_O;
            var2 = var4 * (this.field_P - this.field_I) / var5 + this.field_I;
            var3 = (-this.field_N + this.field_K) * var4 / var5 + this.field_N;
          }
          this.a((byte) 125, var3, var2);
        }
        return super.k(-1);
    }

    static {
        field_M = new int[4];
        field_M[2] = 4000;
        field_M[1] = 500;
        field_M[0] = 0;
        field_M[3] = 10000;
    }
}
