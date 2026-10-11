/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class en extends ab {
    private int field_L;
    private int field_J;
    private int field_N;
    static int field_O;
    static String field_I;
    private int field_G;
    private int field_H;
    static dl field_M;
    static String field_F;
    private int field_P;
    static dl[] field_K;

    boolean e(byte param0) {
        this.j(param0 ^ -80);
        if (param0 != 79) {
          this.g((byte) 101);
        }
        return super.e((byte) 79);
    }

    void j(int param0) {
        if (param0 <= ~this.field_P) {
          return;
        }
        this.a(this.field_G, (byte) -50, this.field_H);
        this.field_P = 0;
        this.k(42);
    }

    void k(int param0) {
        if (param0 != 42) {
          field_K = (dl[]) null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param0 <= 0) {
          this.a(param1, (byte) 127, param3);
          return;
        }
        this.field_L = this.field_g;
        this.field_N = this.field_f;
        this.field_G = param1;
        this.field_P = param0;
        this.field_H = param3;
        this.field_J = 0;
        if (param2 != -93) {
          field_M = (dl) null;
        }
    }

    final static si a(String[] args, int param1) {
        si var2 = null;
        RuntimeException var2_ref = null;
        si stackIn_2_0 = null;
        si stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 169) {
            stackIn_2_0 = (si) null;
            return stackIn_2_0;
          }
          var2 = new si(false);
          var2.field_d = args;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("en.S(");
          if (args == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_K = null;
        field_F = null;
        if (param0 != 0) {
          return;
        }
        field_M = null;
        field_I = null;
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
        var16 = CrazyCrystals.field_B;
        kh.a(6 + param1, param2 + 35, -12 + this.field_g, -40 + this.field_f, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (kh.field_b <= var8 &&
            kh.field_j > var8) {
            var9 = (-var5 + var6) * var7 / var4 + var5;
            var10 = 0;
            var11 = this.field_g;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 - var7);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  kh.field_i[var8 * kh.field_l + (param1 + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    kh.field_i[var11 + (param1 + var8 * kh.field_l)] = var15;
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
            var9 = var9 | (var9 << 16 | var9 << 8);
            kh.f(var10 + param1, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param2;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          kh.f(param1, var8Lifetime1, 6, var9Lifetime1);
          kh.f(-6 + this.field_g + param1, var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        p.field_f.a(this.field_g + (param1 - 90), 10 + param2);
        fb.a(param0 - 29, gk.field_d, -10 + this.field_g, 5 + param1, param2 + 35);
        fb.a(param0 ^ 31, lm.field_g, this.field_g, param1, this.field_f + param2 - 22);
        var4Lifetime2 = this.field_f - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        if (param0 != 30) {
          this.field_H = -93;
        }
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param2;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          kh.f(param1, var8Lifetime2, 6, var9Lifetime2);
          kh.f(this.field_g + (param1 - 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 8) {
          this.j(-111);
        }
        if (0 >= this.field_P) {
        } else {
          var2 = this.field_H;
          var3 = this.field_G;
          fieldTemp$0 = this.field_J + 1;
          this.field_J = this.field_J + 1;
          if (fieldTemp$0 >= this.field_P) {
            this.field_P = 0;
            this.k(param0 ^ 34);
          } else {
            var4 = (this.field_P * 2 - this.field_J) * this.field_J;
            var5 = this.field_P * this.field_P;
            var2 = var4 * (-this.field_L + this.field_H) / var5 + this.field_L;
            var3 = (-this.field_N + this.field_G) * var4 / var5 + this.field_N;
          }
          this.a(var3, (byte) 24, var2);
        }
        return super.g((byte) 8);
    }

    en(ol param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_P = 0;
        this.field_J = 0;
    }

    static {
        field_F = "Don't worry, he has a lot more fun in the two-player levels!";
        field_I = "Pause Menu";
    }
}
