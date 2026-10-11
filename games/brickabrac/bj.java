/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj extends jc {
    private int field_X;
    static String field_U;
    private int field_O;
    private int field_W;
    private int field_Q;
    private int field_R;
    private int field_Z;
    static cd field_Y;
    static byte[][] field_S;
    static eh field_T;
    static String field_V;
    static long field_ab;
    static ck field_P;

    void j(int param0) {
        if (0 >= this.field_Z) {
          return;
        }
        if (param0 != 20) {
          field_S = (byte[][]) null;
        }
        this.a(true, this.field_R, this.field_Q);
        this.field_Z = 0;
        this.k(-13717);
    }

    boolean a(int param0) {
        this.j(20);
        if (param0 > -22) {
          this.field_Q = 2;
        }
        return super.a(-81);
    }

    void k(int param0) {
        if (param0 != -13717) {
          this.field_X = -40;
        }
    }

    bj(cp param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_W = 0;
        this.field_Z = 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
          this.a(true, param2, param3);
          return;
        }
        this.field_R = param2;
        if (param0 != -116) {
          this.a(97);
        }
        this.field_X = this.field_s;
        this.field_Z = param1;
        this.field_Q = param3;
        this.field_W = 0;
        this.field_O = this.field_t;
    }

    final static String a(int param0, byte param1, wq param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        wq var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param1 < 36) {
              var6 = (wq) null;
              bj.a(61, (byte) 3, (wq) null);
            }
            var3_int = param2.k(-32768);
            if (param0 < var3_int) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param2.field_l = param2.field_l + so.field_d.a(var3_int, 0, param2.field_l, true, var4, param2.field_k);
            var5 = df.a(var3_int, -110, var4, 0);
            stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("bj.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (this.field_Z > 0) {
          var2 = this.field_Q;
          var3 = this.field_R;
          fieldTemp$0 = this.field_W + 1;
          this.field_W = this.field_W + 1;
          if (fieldTemp$0 < this.field_Z) {
            var4 = this.field_W * (2 * this.field_Z - this.field_W);
            var5 = this.field_Z * this.field_Z;
            var2 = var4 * (this.field_Q - this.field_O) / var5 + this.field_O;
            var3 = (this.field_R - this.field_X) * var4 / var5 + this.field_X;
          } else {
            this.field_Z = 0;
            this.k(-13717);
          }
          this.a(true, var3, var2);
        }
        if (param0 != 0) {
          this.h(109);
        }
        return super.h(0);
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
        var16 = BrickABrac.field_J ? 1 : 0;
        lb.g(param0 + 6, param2 + 35, -12 + this.field_t, this.field_s - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (lb.field_b <= var8 &&
            var8 < lb.field_j) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.field_t;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (20 - var7) * (-var7 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  lb.field_l[var10 + var8 * lb.field_c + param0] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    lb.field_l[var11 + (lb.field_c * var8 + param0)] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            lb.c(var10 + param0, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param2 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          lb.c(param0, var8Lifetime1, 6, var9Lifetime1);
          lb.c(this.field_t + param0 - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        if (param1 != 274) {
          field_P = (ck) null;
        }
        ka.field_n.c(param0 + this.field_t - 90, 10 + param2);
        fq.a(this.field_t - 10, 35 + param2, param1 ^ 1013, nf.field_W, 5 + param0);
        fq.a(this.field_t, -22 + param2 + this.field_s, param1 + 469, qc.field_l, param0);
        var5Lifetime2 = 169;
        var4Lifetime2 = this.field_s - 79;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          lb.c(param0, var8Lifetime2, 6, var9Lifetime2);
          lb.c(param0 + this.field_t - 6, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    public static void i(int param0) {
        field_P = null;
        if (param0 <= 110) {
          return;
        }
        field_V = null;
        field_T = null;
        field_S = (byte[][]) null;
        field_U = null;
        field_Y = null;
    }

    static {
        field_U = "The hearts above are your lives.<br>Outside of the tutorial level, you will lose one life if all your balls fall out of play.";
        field_Y = new cd(0);
        field_V = "Hide chat";
    }
}
