/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends rg {
    private int field_I;
    private int field_J;
    private int field_M;
    private int field_G;
    static String[] field_F;
    static hr[] field_H;
    static String[] field_L;
    private int field_N;
    private int field_K;

    boolean h(int param0) {
        this.f((byte) -128);
        if (param0 != 0) {
          wi var3 = (wi) null;
          hf.a(true, (wi) null, -72, -89, 23, -11);
        }
        return super.h(0);
    }

    final static hr a(ha param0, ri param1, byte param2) {
        RuntimeException var3 = null;
        wi var4 = null;
        hr stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -11) {
            var4 = (wi) null;
            hf.a(false, (wi) null, -97, 35, 94, -35);
          }
          stackIn_3_0 = param0.a(param1, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hf.FA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void j(int param0) {
        if (param0 <= 8) {
          field_H = (hr[]) null;
        }
        field_H = null;
        field_F = null;
        field_L = null;
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
        var16 = Sumoblitz.field_L ? 1 : 0;
        if (param0 <= 110) {
          return;
        }
        lk.a(6 + param1, 35 + param2, this.field_q - 12, -40 + this.field_p, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var7 < var4) {
          if (var8 >= lk.field_i &&
            lk.field_e > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.field_q;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (-var7 + 20) + (20 - var10) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  lk.field_a[param1 + (var8 * lk.field_b + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    lk.field_a[param1 + var8 * lk.field_b + var11] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            lk.f(var10 + param1, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param2;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          lk.f(param1, var8Lifetime1, 6, var9Lifetime1);
          lk.f(param1 + this.field_q - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        ar.field_E.a(param1 + (this.field_q - 90), 10 + param2);
        ud.a(35 + param2, this.field_q - 10, 2, param1 + 5, li.field_v);
        ud.a(-22 + this.field_p + param2, this.field_q, 2, param1, hd.field_O);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = this.field_p - 79;
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          lk.f(param1, var8Lifetime2, 6, var9Lifetime2);
          lk.f(-6 + (this.field_q + param1), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
        return;
    }

    void i(int param0) {
        if (param0 != 0) {
          this.g(122);
        }
    }

    final static java.awt.Frame a(boolean param0, wi param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        cd[] var10 = null;
        jr var11 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param1.a((byte) 125)) {
            return null;
          }
          if (param3 == 0) {
            var10 = ul.a((byte) -73, param1);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (param5 == var10[var8].field_a &&
                var10[var8].field_g == param4 && ((param2 == 0 ||
                var10[var8].field_b == param2) &&
                (var7_int == 0 ||
                !(param3 >= var10[var8].field_e)))) {
                param3 = var10[var8].field_e;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param1.a(false, param2, param3, param5, param4);
          while (0 == var11.field_c) {
            tg.a(10L, (byte) 118);
          }
          var7 = (java.awt.Frame) (var11.field_d);
          if (var7 == null) {
            stackIn_35_0 = null;
            return (java.awt.Frame) (stackIn_35_0);
          }
          if (!param0) {
            field_H = (hr[]) null;
          }
          if (var11.field_c != 2) {
            return var7;
          }
          wj.a(var7, param1, false);
          stackIn_41_0 = null;
          return (java.awt.Frame) (stackIn_41_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_44_0 = var6_ref;
          stackIn_44_1 = new StringBuilder().append("hf.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    hf(dg param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_K = 0;
    }

    boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -28778) {
          this.field_N = 52;
        }
        if (0 >= this.field_K) {
        } else {
          var2 = this.field_J;
          var3 = this.field_I;
          fieldTemp$0 = this.field_G + 1;
          this.field_G = this.field_G + 1;
          if (fieldTemp$0 >= this.field_K) {
            this.field_K = 0;
            this.i(0);
          } else {
            var4 = this.field_G * (2 * this.field_K - this.field_G);
            var5 = this.field_K * this.field_K;
            var2 = this.field_M + var4 * (-this.field_M + this.field_J) / var5;
            var3 = this.field_N + var4 * (this.field_I - this.field_N) / var5;
          }
          this.c(var2, var3, 109);
        }
        return super.g(-28778);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param2 <= 0) {
          this.c(param3, param1, 103);
          return;
        }
        this.field_M = this.field_q;
        this.field_K = param2;
        this.field_I = param1;
        this.field_J = param3;
        this.field_G = 0;
        this.field_N = this.field_p;
        if (param0) {
          this.a(false, -70, -124, -36);
        }
    }

    void f(byte param0) {
        if (this.field_K <= 0) {
          return;
        }
        this.c(this.field_J, this.field_I, 45);
        if (param0 != -128) {
          this.field_K = 65;
        }
        this.field_K = 0;
        this.i(0);
    }

    static {
        field_L = new String[]{"Access the new turrets!", "Challenging levels!", "Diabolical bosses!"};
    }
}
