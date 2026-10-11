/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sp extends nm {
    private int field_L;
    static String field_K;
    private int field_S;
    static String field_U;
    static String field_Q;
    static int field_O;
    static String field_P;
    private int field_T;
    private int field_R;
    private int field_M;
    static boolean field_V;
    private int field_N;

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= this.field_L) {
        } else {
          var2 = this.field_S;
          var3 = this.field_T;
          fieldTemp$0 = this.field_R + 1;
          this.field_R = this.field_R + 1;
          if (fieldTemp$0 >= this.field_L) {
            this.field_L = 0;
            this.a((byte) -24);
          } else {
            var4 = this.field_R * (this.field_L * 2 - this.field_R);
            var5 = this.field_L * this.field_L;
            var3 = (-this.field_N + this.field_T) * var4 / var5 + this.field_N;
            var2 = (this.field_S - this.field_M) * var4 / var5 + this.field_M;
          }
          this.b(-1535749535, var2, var3);
        }
        if (param0 != 17) {
          field_P = (String) null;
        }
        return super.j(17);
    }

    void a(byte param0) {
        if (param0 > -19) {
          this.field_S = 15;
        }
    }

    final static gg a(ra param0, int param1) {
        gg var2 = null;
        RuntimeException var2_ref = null;
        gg stackIn_2_0 = null;
        gg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -59) {
            stackIn_2_0 = (gg) null;
            return stackIn_2_0;
          }
          var2 = new gg(param0, param0);
          fm.field_b.a(var2, false);
          il.field_g.a(param0);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("sp.IA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    void f(byte param0) {
        if (this.field_L <= 0) {
          return;
        }
        this.b(param0 ^ 1535749512, this.field_S, this.field_T);
        if (param0 != -23) {
          return;
        }
        this.field_L = 0;
        this.a((byte) -56);
    }

    void a(byte param0, int param1, int param2) {
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
        var16 = Vertigo2.field_L ? 1 : 0;
        bi.e(param1 + 6, param2 + 35, -12 + this.field_n, -40 + this.field_s, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (bi.field_f <= var8 &&
            bi.field_c > var8) {
            var9 = (var6 - var5) * var7 / var4 + var5;
            var10 = 0;
            var11 = this.field_n;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  bi.field_l[var10 + (bi.field_e * var8 + param1)] = var13;
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
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = (-var14 + 462) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    bi.field_l[param1 + (bi.field_e * var8 + var11)] = var15;
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
            bi.b(param1 + var10, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        if (param0 >= -92) {
          this.a((byte) -71);
        }
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param2;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          bi.b(param1, var8Lifetime1, 6, var9Lifetime1);
          bi.b(-6 + this.field_n + param1, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        qo.field_y.e(-90 + (param1 + this.field_n), 10 + param2);
        kj.a(1, this.field_n - 10, param1 + 5, bh.field_a, param2 + 35);
        kj.a(1, this.field_n, param1, ki.field_b, -22 + (this.field_s + param2));
        var4Lifetime2 = -79 + this.field_s;
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          bi.b(param1, var8Lifetime2, 6, var9Lifetime2);
          bi.b(-6 + (param1 + this.field_n), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    sp(sd param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_R = 0;
        this.field_L = 0;
    }

    boolean a(int param0) {
        if (param0 != -1) {
          return true;
        }
        this.f((byte) -23);
        return super.a(-1);
    }

    public static void l(int param0) {
        field_P = null;
        field_Q = null;
        if (param0 != -6) {
          field_O = 103;
        }
        field_U = null;
        field_K = null;
    }

    final static ud e(byte param0) {
        int var1 = 0;
        int var2_int = 0;
        ud var3 = null;
        ud stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var2 = null;
        var1 = -5 / ((param0 - 60) / 44);
        try {
          var2_int = 0;
          while (true) {
            var3 = ni.field_d.a(var2_int, true);
            if (var3.field_y) {
              stackIn_5_0 = var3;
              return stackIn_5_0;
            }
            var2_int++;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 >= param0) {
          this.b(-1535749535, param1, param2);
          return;
        }
        this.field_R = 0;
        this.field_S = param1;
        this.field_T = param2;
        this.field_M = this.field_n;
        if (param3 <= 36) {
          this.field_N = 65;
        }
        this.field_N = this.field_s;
        this.field_L = param0;
    }

    static {
        field_K = "This game has started.";
        field_P = "Hide game chat";
        field_Q = "Log in / Create account";
    }
}
