/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl extends w {
    private int field_L;
    private int field_K;
    private int field_T;
    private int field_R;
    static qb field_S;
    private int field_P;
    private int field_Q;
    static java.math.BigInteger field_V;
    static String field_N;
    static String field_O;
    static int[] field_M;
    static int field_U;
    static bi field_W;

    jl(tc param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_P = 0;
        this.field_Q = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param1) {
          this.b(param3, param2, (byte) -121);
          return;
        }
        this.field_L = this.field_x;
        this.field_R = this.field_n;
        this.field_T = param2;
        this.field_Q = 0;
        int var5 = -30 % ((param0 - 43) / 43);
        this.field_K = param3;
        this.field_P = param1;
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
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        gf.i(param0 + 6, param2 + 35, -12 + this.field_x, -40 + this.field_n, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (gf.field_a <= var8 &&
            var8 < gf.field_f) {
            var9 = var5 + var7 * (-var5 + var6) / var4;
            var10 = 0;
            var11 = this.field_x;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (-var7 + 20) + (20 - var10) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (-var12 + 462) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  gf.field_h[var10 + (var8 * gf.field_b + param0)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = var13Lifetime1 * var13Lifetime1 + (20 - var7) * (-var7 + 20);
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    gf.field_h[var11 + param0 + gf.field_b * var8] = var15;
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
            gf.f(var10 + param0, var8, var11 - var10, var9);
          }
          var7++;
          var8++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = param2 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          gf.f(param0, var8Lifetime1, 6, var9Lifetime1);
          gf.f(-6 + (this.field_x + param0), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        kb.field_v.f(this.field_x + param0 - 90, 10 + param2);
        wh.a(os.field_u, param2 + 35, this.field_x - 10, (byte) -114, 5 + param0);
        wh.a(oh.field_d, -22 + (this.field_n + param2), this.field_x, (byte) -99, param0);
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_n;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        if (param1 != 103) {
          field_M = (int[]) null;
        }
        var8Lifetime2 = param2 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          gf.f(param0, var8Lifetime2, 6, var9Lifetime2);
          gf.f(param0 + this.field_x - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    void g(byte param0) {
        if (param0 > -100) {
          jl.o(21);
        }
    }

    boolean k(int param0) {
        if (param0 != 0) {
          return true;
        }
        this.n(param0 + 7489);
        return super.k(0);
    }

    void n(int param0) {
        if (param0 != 7489) {
          return;
        }
        if (this.field_P <= 0) {
          return;
        }
        this.b(this.field_K, this.field_T, (byte) -114);
        this.field_P = 0;
        this.g((byte) -103);
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        if (param0 != -21) {
          jl.a(-51, true, -46);
        }
        if (lg.field_e != null) {
          var3 = lg.field_e.a((byte) -83, param1);
          if (var3 != 0) {
            if (var3 == 2 &&
              null != lg.field_e.field_z &&
              !lg.field_e.field_z.equals("")) {
              if (lg.field_e.field_z.charAt(0) == 91) {
                var4 = lg.field_e.field_z;
              } else {
                var7 = (CharSequence) ((Object) lg.field_e.field_z);
                var4 = ji.a(var7, true);
              }
              var5 = null;
              if (0 == ia.field_b) {
                var5 = nj.a(var4, param2, (byte) -62);
              }
              if (ia.field_b == 1) {
                var5 = o.a((byte) -88, param2, var4);
              }
              if (ia.field_b == 2) {
                var5 = vq.a(2, var4, param2);
              }
              if (3 == ia.field_b) {
                var5 = os.a((byte) 117, param2, var4, var4);
              }
              if (var5 == null) {
                ia.field_b = -1;
                lg.field_e = null;
              } else {
                var6 = (String) null;
                md.a(2, (String) (var5), 0, var4, (String) null, -16169);
                ia.field_b = -1;
                lg.field_e = null;
              }
            } else {
              ia.field_b = -1;
              lg.field_e = null;
            }
          }
        }

    }

    boolean a(byte param0) {
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (0 >= this.field_P) {
        } else {
          var2 = this.field_T;
          var3 = this.field_K;
          fieldTemp$0 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (fieldTemp$0 >= this.field_P) {
            this.field_P = 0;
            this.g((byte) -119);
          } else {
            var4 = (-this.field_Q + 2 * this.field_P) * this.field_Q;
            var5 = this.field_P * this.field_P;
            var3 = var4 * (-this.field_R + this.field_K) / var5 + this.field_R;
            var2 = (this.field_T - this.field_L) * var4 / var5 + this.field_L;
          }
          this.b(var3, var2, (byte) -104);
        }
        var2Lifetime1 = -57 / ((param0 + 23) / 52);
        return super.a((byte) 88);
    }

    final static int a(nf param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -73) {
            stackIn_3_0 = -19;
            return stackIn_3_0;
          }
          var2_int = ho.field_c;
          if (param0.field_n != 2) {
            if (param0.field_n == 4) {
              var2_intLifetime1 = hd.field_l[param0.field_n];
            } else {
              if (~param0.field_p != ~ec.field_p) {
                var2_intLifetime1 = hd.field_l[param0.field_n];
              } else {
                var2_intLifetime1 = ke.field_q[param0.field_n];
              }
            }
          } else {
            if (!param0.field_h) {
              if (param0.field_l == 0 &&
                param0.field_e == 0) {
                var2_intLifetime1 = ke.field_q[param0.field_n];
              } else {
                var2_intLifetime1 = hd.field_l[param0.field_n];
              }
            } else {
              var2_intLifetime1 = ho.field_c;
            }
          }
          stackIn_17_0 = var2_intLifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("jl.H(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void o(int param0) {
        field_O = null;
        field_V = null;
        field_M = null;
        int var1 = -92 % ((-20 - param0) / 63);
        field_W = null;
        field_S = null;
        field_N = null;
    }

    static {
        field_V = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_O = "<%0>%";
        field_M = new int[16384];
        field_N = "<%highlight>Turn animations</col> provide a brief overview of the events during the previous turn and play at the start of each turn by default. They can be disabled or replayed using the buttons at the <%highlight>bottom-right</col> of the screen.";
        field_U = 4;
    }
}
